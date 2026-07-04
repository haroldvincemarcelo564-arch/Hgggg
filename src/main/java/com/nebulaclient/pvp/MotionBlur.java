package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class MotionBlur {
    private static boolean enabled = true;
    private static float intensity = 0.5f;

    public static void setEnabled(boolean enabled) {
        MotionBlur.enabled = enabled;
    }

    public static void setIntensity(float intensity) {
        MotionBlur.intensity = Math.max(0.0f, Math.min(1.0f, intensity));
    }

    public static boolean isEnabled() { return enabled; }
    public static float getIntensity() { return intensity; }
}
