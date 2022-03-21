package com.colt.ccam.client.event;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.client.gui.ButtonIcons;
import com.colt.ccam.client.gui.buttonTags;
import com.colt.ccam.itemgroup.ccamItemGroup;
import com.colt.ccam.registries.ccamItems;
import com.colt.ccam.util.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

//Credits for this function goes to MrCrayfish as i used his furniture mod as a reference
//i didnt want to clutter the creative menu with to many tabs but also wanted to keep everything organized

public class CreativeFilter {

    private static ResourceLocation ICONS = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/gui/icons.png");
    private static int startIndex;

    private List<TagFilter> filters;
    private List<buttonTags> buttons;
    private Button btnScrollUp;
    private Button btnScrollDown;
    private Button btnEnableAll;
    private Button btnDisableAll;
    private boolean ccamTab;
    private int guiCenterX = 0;
    private int guiCenterY = 0;

    @SubscribeEvent
    public void onPlayerLogout(ClientPlayerNetworkEvent.LoggedOutEvent event)
    {
        this.filters = null;
    }

    @SubscribeEvent
    public void onScreenInit(ScreenEvent.InitScreenEvent.Post event)
    {
        if (event.getScreen() instanceof CreativeModeInventoryScreen creativeModeInventoryScreen)
        {
            if (this.filters == null) {
                this.compileItems();
            }

        this.ccamTab = false;
        this.guiCenterX = creativeModeInventoryScreen.getGuiLeft();
        this.guiCenterY= creativeModeInventoryScreen.getGuiTop();
        this.buttons = new ArrayList<>();

            event.addListener(this.btnScrollUp = new ButtonIcons(this.guiCenterX - 22, this.guiCenterY - 12, new TranslatableComponent("gui.button.ccam.scroll_filters_up"), button -> {
                if(startIndex > 0) startIndex--;
                this.updateTagButtons();
            }, ICONS, 64, 0));

            event.addListener(this.btnScrollDown = new ButtonIcons(this.guiCenterX - 22, this.guiCenterY + 127, new TranslatableComponent("gui.button.ccam.scroll_filters_down"), button -> {
                if(startIndex <= filters.size() - 4 - 1) startIndex++;
                this.updateTagButtons();
            }, ICONS, 80, 0));

            event.addListener(this.btnEnableAll = new ButtonIcons(this.guiCenterX - 50, this.guiCenterY + 10, new TranslatableComponent("gui.button.ccam.enable_filters"), button -> {
                this.filters.forEach(filters -> filters.setEnabled(true));
                this.buttons.forEach(buttonTags::updateState);
                Screen screen = Minecraft.getInstance().screen;
                if(screen instanceof CreativeModeInventoryScreen)
                {
                    this.updateItems((CreativeModeInventoryScreen) screen);
                }
            }, ICONS, 96, 0));

            event.addListener(this.btnDisableAll = new ButtonIcons(this.guiCenterX - 50, this.guiCenterY + 32, new TranslatableComponent("gui.button.ccam.disable_filters"), button -> {
                this.filters.forEach(filters -> filters.setEnabled(false));
                this.buttons.forEach(buttonTags::updateState);
                Screen screen = Minecraft.getInstance().screen;
                if(screen instanceof CreativeModeInventoryScreen)
                {
                    this.updateItems((CreativeModeInventoryScreen) screen);
                }
            }, ICONS, 112, 0));

            this.btnScrollUp.visible = false;
            this.btnScrollDown.visible = false;
            this.btnEnableAll.visible = false;
            this.btnDisableAll.visible = false;

            this.updateTagButtons();

            if(creativeModeInventoryScreen.getSelectedTab() == ccamItemGroup.CCAM_TAB.getId())
            {
                this.btnScrollUp.visible = true;
                this.btnScrollDown.visible = true;
                this.btnEnableAll.visible = true;
                this.btnDisableAll.visible = true;
                this.ccamTab = true;
                this.buttons.forEach(button -> button.visible = true);
                this.updateItems(creativeModeInventoryScreen);
            }
        }
    }

    @SubscribeEvent
    public void onScreenClick(ScreenEvent.MouseClickedEvent.Pre event)
    {
        if(event.getButton() != GLFW.GLFW_MOUSE_BUTTON_LEFT)
            return;

        if(event.getScreen() instanceof CreativeModeInventoryScreen)
        {
            for(Button button : this.buttons)
            {
                if(button.isMouseOver(event.getMouseX(), event.getMouseY()))
                {
                    if(button.mouseClicked(event.getMouseX(), event.getMouseY(), event.getButton()))
                    {
                        return;
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onScreenDrawPre(ScreenEvent.DrawScreenEvent.Pre event)
    {
        if(event.getScreen() instanceof CreativeModeInventoryScreen creativeScreen)
        {
            if(creativeScreen.getSelectedTab() == ccamItemGroup.CCAM_TAB.getId())
            {
                if(!this.ccamTab)
                {
                    this.updateItems(creativeScreen);
                    this.ccamTab = true;
                }
            }
            else
            {
                this.ccamTab = false;
            }
        }
    }

    @SubscribeEvent
    public void onScreenDrawPost(ScreenEvent.DrawScreenEvent.Post event)
    {
        if(event.getScreen() instanceof CreativeModeInventoryScreen creativeScreen)
        {
            this.guiCenterX = creativeScreen.getGuiLeft();
            this.guiCenterY = creativeScreen.getGuiTop();

            if(creativeScreen.getSelectedTab() == ccamItemGroup.CCAM_TAB.getId())
            {
                this.btnScrollUp.visible = true;
                this.btnScrollDown.visible = true;
                this.btnEnableAll.visible = true;
                this.btnDisableAll.visible = true;
                this.buttons.forEach(button -> button.visible = true);

                /* Render buttons */
                this.buttons.forEach(button ->
                {
                    button.render(event.getPoseStack(), event.getMouseX(), event.getMouseY(), event.getPartialTicks());
                });

                /* Render tooltips after so it renders above buttons */
                this.buttons.forEach(button ->
                {
                    if(button.isMouseOver(event.getMouseX(), event.getMouseY()))
                    {
                        creativeScreen.renderTooltip(event.getPoseStack(), button.getCategory().getName(), event.getMouseX(), event.getMouseY());
                    }
                });

                if(this.btnEnableAll.isMouseOver(event.getMouseX(), event.getMouseY()))
                {
                    creativeScreen.renderTooltip(event.getPoseStack(), this.btnEnableAll.getMessage(), event.getMouseX(), event.getMouseY());
                }

                if(this.btnDisableAll.isMouseOver(event.getMouseX(), event.getMouseY()))
                {
                    creativeScreen.renderTooltip(event.getPoseStack(), this.btnDisableAll.getMessage(), event.getMouseX(), event.getMouseY());
                }
            }
            else
            {
                this.btnScrollUp.visible = false;
                this.btnScrollDown.visible = false;
                this.btnEnableAll.visible = false;
                this.btnDisableAll.visible = false;
                this.buttons.forEach(button -> button.visible = false);
            }
        }
    }

    private void updateTagButtons()
    {
        final Button.OnPress onPress = button ->
        {
            Screen screen = Minecraft.getInstance().screen;
            if(screen instanceof CreativeModeInventoryScreen creativeScreen)
            {
                this.updateItems(creativeScreen);
            }
        };
        this.buttons.clear();
        for(int i = startIndex; i < startIndex + 4 && i < this.filters.size(); i++)
        {
            buttonTags button = new buttonTags(this.guiCenterX - 28, this.guiCenterY + 29 * (i - startIndex) + 10, this.filters.get(i), onPress);
            this.buttons.add(button);
        }
        this.btnScrollUp.active = startIndex > 0;
        this.btnScrollDown.active = startIndex <= this.filters.size() - 4 - 1;
    }

    private void updateItems(CreativeModeInventoryScreen screen)
    {
        CreativeModeInventoryScreen.ItemPickerMenu menu = screen.getMenu();
        LinkedHashSet<Item> categorisedItems = new LinkedHashSet<>();
        for(TagFilter filter : this.filters)
        {
            if(filter.isEnabled())
            {
                categorisedItems.addAll(filter.getItems());
            }
        }

        NonNullList<ItemStack> newItems = NonNullList.create();
        for(Item item : categorisedItems)
        {
            item.fillItemCategory(ccamItemGroup.CCAM_TAB, newItems);
        }

        menu.items.clear();
        menu.items.addAll(newItems);
        menu.items.sort(Comparator.comparingInt(o -> Item.getId(o.getItem())));
        menu.scrollTo(0);
    }
    private void compileItems()
    {
        TagFilter[] filters = new TagFilter[] {
                new TagFilter(ModTags.Items.BLOCKS, new ItemStack(ccamItems.SEWING_TABLE.get())),
                new TagFilter(ModTags.Items.HELEMTS, new ItemStack(ccamItems.BASIC_HELMET.get())),
                new TagFilter(ModTags.Items.CHESTPLATES, new ItemStack(ccamItems.BASIC_CHESTPLATE.get())),
                new TagFilter(ModTags.Items.LEGGINGS, new ItemStack(ccamItems.BASIC_LEGGINGS.get())),
                new TagFilter(ModTags.Items.BOOTS, new ItemStack(ccamItems.BASIC_BOOTS.get())),
                new TagFilter(ModTags.Items.CURIO, new ItemStack(ccamItems.BASIC_CURIO.get()))

        };

        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getItemCategory() == ccamItemGroup.CCAM_TAB)
                .filter(item -> item.getRegistryName().getNamespace().equals(ColtCosmeticArmorMod.MOD_ID))
                .forEach(item ->
                {
                    item.builtInRegistryHolder().tags().forEach(tagKey ->
                    {
                        for(TagFilter filter : filters)
                        {
                            if(tagKey == filter.getTag())
                            {
                                filter.add(item);
                            }
                        }
                    });
                });

        this.filters = new ArrayList<>();
        this.filters.addAll(Arrays.asList(filters));
    }

    public static class TagFilter {
        private final List<Item> items = Lists.newArrayList();
        private final TagKey<Item> tag;
        private final TranslatableComponent name;
        private final ItemStack icon;
        private boolean enabled = true;

        public TagFilter(TagKey<Item> tag, ItemStack icon)
        {
            this.tag = tag;
            this.name = new TranslatableComponent(String.format("gui.tag_filter.%s.%s", tag.location().getNamespace(), tag.location().getPath().replace("/", ".")));
            this.icon = icon;
        }

        public TagKey<Item> getTag()
        {
            return tag;
        }

        public ItemStack getIcon()
        {
            return this.icon;
        }

        public TranslatableComponent getName()
        {
            return this.name;
        }

        public void setEnabled(boolean enabled)
        {
            this.enabled = enabled;
        }

        public boolean isEnabled()
        {
            return this.enabled;
        }

        public void add(Item item)
        {
            this.items.add(item);
        }

        public void add(Block block)
        {
            this.items.add(Item.byBlock(block));
        }

        public List<Item> getItems()
        {
            return this.items;
        }
    }
}


