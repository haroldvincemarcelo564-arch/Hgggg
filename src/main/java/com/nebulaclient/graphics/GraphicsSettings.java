package com.nebulaclient.graphics;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class GraphicsSettings {
    private static int renderDistance = 16;
    private static int entityDistance = 32;
    private static int simulationDistance = 12;
    private static boolean useFastMath = true;
    private static boolean chunkPreloading = true;
    private static boolean asyncChunkLoading = true;
    private static int maxParticles = 16384;
    private static boolean particlePhysics = true;
    private static boolean waterPhysics = true;
    private static boolean entityShadows = true;
    private static float fov = 70.0f;

    public static void setRenderDistance(int distance) {
        renderDistance = Math.max(2, Math.min(32, distance));
    }

    public static void setEntityDistance(int distance) {
        entityDistance = Math.max(16, Math.min(256, distance));
    }

    public static void setSimulationDistance(int distance) {
        simulationDistance = Math.max(4, Math.min(32, distance));
    }

    public static void setMaxParticles(int max) {
        maxParticles = Math.max(1024, Math.min(65536, max));
    }

    public static int getRenderDistance() { return renderDistance; }
    public static int getEntityDistance() { return entityDistance; }
    public static int getSimulationDistance() { return simulationDistance; }
    public static boolean isFastMathEnabled() { return useFastMath; }
    public static boolean isChunkPreloadingEnabled() { return chunkPreloading; }
    public static boolean isAsyncChunkLoadingEnabled() { return asyncChunkLoading; }
    public static int getMaxParticles() { return maxParticles; }
    public static boolean isParticlePhysicsEnabled() { return particlePhysics; }
    public static boolean isWaterPhysicsEnabled() { return waterPhysics; }
    public static boolean areEntityShadowsEnabled() { return entityShadows; }
    public static float getFov() { return fov; }

    public static void setFastMathEnabled(boolean enabled) { useFastMath = enabled; }
    public static void setChunkPreloadingEnabled(boolean enabled) { chunkPreloading = enabled; }
    public static void setAsyncChunkLoadingEnabled(boolean enabled) { asyncChunkLoading = enabled; }
    public static void setParticlePhysicsEnabled(boolean enabled) { particlePhysics = enabled; }
    public static void setWaterPhysicsEnabled(boolean enabled) { waterPhysics = enabled; }
    public static void setEntityShadowsEnabled(boolean enabled) { entityShadows = enabled; }
    public static void setFov(float fov) { GraphicsSettings.fov = Math.max(30.0f, Math.min(110.0f, fov)); }
}
