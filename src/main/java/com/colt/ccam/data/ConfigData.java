package com.colt.ccam.data;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigData {
    public static final ServerConfig SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {
        final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
        SERVER_SPEC = specPair.getRight();
        SERVER = specPair.getLeft();
    }

    //public static List<Integer> Basic_Armor = Arrays.asList(2, 5, 6, 2);

    public static class ServerConfig {
        //public final ForgeConfigSpec.ConfigValue<List<Integer>> Basic_Armor;

        ServerConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Armour values\nOrder: (HEAD, CHEST, LEGGINGS, BOOTS)");
            Basic_Armor=builder
            .comment("Values for basic armor set (Default: 2, 5, 6, 2)")
            .define("Basic",Arrays.asList(2,5,6,2),o->o instanceof int[4]||o instanceof List<Integer>);
            builder.pop();

            builder.push("Settings");
        }
    }

    public static int[] IntListToArray(List<Integer> intList) {
        return intList.stream().mapToInt(x -> x).toArray();
    }

    public static void refreshServer() {
    }
}
