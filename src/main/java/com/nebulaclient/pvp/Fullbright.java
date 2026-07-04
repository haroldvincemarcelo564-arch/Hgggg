package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Fullbright {
    private static boolean active = false;
    private static float brightness = 1.0f;

    public static void toggleFullbright() {
        active = !active;
    }

    public static void setBrightness(float level) {
        brightness = Math.max(0.0f, Math.min(1.0f, level));
    }

    public static float getBrightness() {
        return active ? brightness : 0.0f;
    }

    public static boolean isActive() {
        return active;
    }
}
