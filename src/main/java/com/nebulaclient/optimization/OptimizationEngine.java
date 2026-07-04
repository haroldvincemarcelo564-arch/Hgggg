package com.nebulaclient.optimization;

import com.nebulaclient.NebulaClientInitializer;
import java.util.HashMap;
import java.util.Map;

public class OptimizationEngine {
    private static final Map<String, OptimizationMod> optimizationMods = new HashMap<>();
    private static boolean allOptimizationsEnabled = true;

    public static void initialize() {
        registerOptimizationMod("sodium", new OptimizationMod(
            "Sodium",
            "Modern rendering engine for Minecraft",
            "Improves FPS by 20-100%",
            "https://modrinth.com/mod/sodium",
            true,
            80
        ));

        registerOptimizationMod("lithium", new OptimizationMod(
            "Lithium",
            "General-purpose optimization mod",
            "Reduces CPU usage and improves world loading",
            "https://modrinth.com/mod/lithium",
            true,
            75
        ));

        registerOptimizationMod("phosphor", new OptimizationMod(
            "Phosphor",
            "Lighting engine optimization",
            "Improves lighting performance by 50%+",
            "https://modrinth.com/mod/phosphor",
            true,
            70
        ));

        registerOptimizationMod("iris", new OptimizationMod(
            "Iris Shaders",
            "Shader support for Sodium",
            "High-performance shaders with ray tracing",
            "https://modrinth.com/mod/iris",
            false,
            85
        ));

        registerOptimizationMod("starlight", new OptimizationMod(
            "Starlight",
            "Advanced lighting engine",
            "10x faster light recalculation",
            "https://modrinth.com/mod/starlight",
            true,
            90
        ));

        registerOptimizationMod("canvas", new OptimizationMod(
            "Canvas",
            "Alternative rendering engine",
            "Better compatibility with RTX and advanced rendering",
            "https://modrinth.com/mod/canvas",
            false,
            75
        ));

        registerOptimizationMod("ferrite-core", new OptimizationMod(
            "Ferrite Core",
            "Memory optimization",
            "Reduces memory usage by 10-30%",
            "https://modrinth.com/mod/ferrite-core",
            true,
            70
        ));

        registerOptimizationMod("ksyxis", new OptimizationMod(
            "Ksyxis",
            "World generation optimization",
            "Faster chunk generation and loading",
            "https://modrinth.com/mod/ksyxis",
            true,
            65
        ));

        registerOptimizationMod("entity-culling", new OptimizationMod(
            "Entity Culling",
            "Entity rendering optimization",
            "Skips rendering off-screen entities",
            "https://modrinth.com/mod/entity-culling",
            true,
            72
        ));

        registerOptimizationMod("c2me", new OptimizationMod(
            "Concurrent Chunk Management Engine",
            "Multi-threaded chunk management",
            "Parallel chunk generation and loading",
            "https://modrinth.com/mod/c2me-fabric",
            true,
            80
        ));

        registerOptimizationMod("lazy-dfu", new OptimizationMod(
            "Lazy DFU",
            "Faster world loading",
            "Defers data fix-upper operations",
            "https://modrinth.com/mod/lazydfu",
            true,
            60
        ));

        registerOptimizationMod("nvidium", new OptimizationMod(
            "Nvidium",
            "NVIDIA GPU optimization",
            "Better NVIDIA GPU utilization (RTX cards)",
            "https://modrinth.com/mod/nvidium",
            false,
            95
        ));

        NebulaClientInitializer.LOGGER.info("Optimization Engine initialized with " + optimizationMods.size() + " optimization mods");
    }

    public static void registerOptimizationMod(String id, OptimizationMod mod) {
        optimizationMods.put(id, mod);
    }

    public static OptimizationMod getOptimizationMod(String id) {
        return optimizationMods.get(id);
    }

    public static Map<String, OptimizationMod> getAllOptimizationMods() {
        return new HashMap<>(optimizationMods);
    }

    public static void enableOptimization(String modId) {
        OptimizationMod mod = optimizationMods.get(modId);
        if (mod != null) {
            mod.setEnabled(true);
            NebulaClientInitializer.LOGGER.info("Enabled optimization: " + mod.getName());
        }
    }

    public static void disableOptimization(String modId) {
        OptimizationMod mod = optimizationMods.get(modId);
        if (mod != null) {
            mod.setEnabled(false);
            NebulaClientInitializer.LOGGER.info("Disabled optimization: " + mod.getName());
        }
    }

    public static int getPerformanceBoost() {
        return optimizationMods.values().stream()
            .filter(OptimizationMod::isEnabled)
            .mapToInt(OptimizationMod::getPerformanceBoost)
            .sum() / optimizationMods.size();
    }

    public static class OptimizationMod {
        private final String name;
        private final String description;
        private final String benefits;
        private final String downloadUrl;
        private boolean enabled;
        private final int performanceBoost; // 1-100

        public OptimizationMod(String name, String description, String benefits, String downloadUrl, boolean enabled, int performanceBoost) {
            this.name = name;
            this.description = description;
            this.benefits = benefits;
            this.downloadUrl = downloadUrl;
            this.enabled = enabled;
            this.performanceBoost = performanceBoost;
        }

        public String getName() { return name; }
        public String getDescription() { return description; }
        public String getBenefits() { return benefits; }
        public String getDownloadUrl() { return downloadUrl; }
        public boolean isEnabled() { return enabled; }
        public void setEnabled(boolean enabled) { this.enabled = enabled; }
        public int getPerformanceBoost() { return performanceBoost; }
    }
}
