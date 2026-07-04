package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HitColor {
    private static boolean enabled = true;
    private static int hitColor = 0xFFFF0000; // Red
    private static long hitDuration = 100; // ms
    private static long lastHitTime = 0;

    public static void recordHit() {
        lastHitTime = System.currentTimeMillis();
    }

    public static int getHitColor() {
        if (!enabled || System.currentTimeMillis() - lastHitTime > hitDuration) {
            return 0xFFFFFFFF; // White (normal)
        }
        return hitColor;
    }

    public static void setHitColor(int color) {
        HitColor.hitColor = color;
    }

    public static void setEnabled(boolean enabled) {
        HitColor.enabled = enabled;
    }

    public static boolean isEnabled() { return enabled; }
}
