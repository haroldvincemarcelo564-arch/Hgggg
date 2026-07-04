package com.nebulaclient.cosmetics;

import java.util.HashMap;
import java.util.Map;

public class CosmeticManager {
    private static final Map<String, Cosmetic> equippedCosmetics = new HashMap<>();
    private static final Map<String, Map<String, Cosmetic>> availableCosmetics = new HashMap<>();

    public static void initialize() {
        // Initialize cosmetic categories
        availableCosmetics.put("capes", new HashMap<>());
        availableCosmetics.put("wings", new HashMap<>());
        availableCosmetics.put("hats", new HashMap<>());
        availableCosmetics.put("trails", new HashMap<>());
        availableCosmetics.put("particles", new HashMap<>());
    }

    public static void equipCosmetic(String category, String name, Cosmetic cosmetic) {
        equippedCosmetics.put(category, cosmetic);
    }

    public static Cosmetic getEquippedCosmetic(String category) {
        return equippedCosmetics.get(category);
    }

    public static void registerCosmetic(String category, String name, Cosmetic cosmetic) {
        availableCosmetics.get(category).put(name, cosmetic);
    }

    public static Map<String, Cosmetic> getCosmeticsInCategory(String category) {
        return new HashMap<>(availableCosmetics.getOrDefault(category, new HashMap<>()));
    }

    public static class Cosmetic {
        private final String name;
        private final String description;
        private final String texturePath;
        private final int rarity;

        public Cosmetic(String name, String description, String texturePath, int rarity) {
            this.name = name;
            this.description = description;
            this.texturePath = texturePath;
            this.rarity = rarity;
        }

        public String getName() { return name; }
        public String getDescription() { return description; }
        public String getTexturePath() { return texturePath; }
        public int getRarity() { return rarity; }
    }
}
