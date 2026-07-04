package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;

@Environment(EnvType.CLIENT)
public class Zoom {
    private static boolean active = false;
    private static float zoomLevel = 1.0f;
    private static final float MAX_ZOOM = 8.0f;
    private static final float MIN_ZOOM = 1.0f;

    public static void toggleZoom() {
        active = !active;
    }

    public static void setZoomLevel(float level) {
        zoomLevel = Math.max(MIN_ZOOM, Math.min(MAX_ZOOM, level));
    }

    public static void incrementZoom(float amount) {
        setZoomLevel(zoomLevel + amount);
    }

    public static float getZoomLevel() {
        return active ? zoomLevel : 1.0f;
    }

    public static boolean isActive() {
        return active;
    }
}
