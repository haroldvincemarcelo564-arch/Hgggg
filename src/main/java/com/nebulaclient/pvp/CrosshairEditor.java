package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class CrosshairEditor {
    private static int size = 10;
    private static int thickness = 1;
    private static int color = 0xFFFFFFFF;
    private static boolean enabled = true;
    private static float opacity = 1.0f;
    private static boolean showGap = true;
    private static int gapSize = 2;

    public static void setSize(int size) {
        CrosshairEditor.size = Math.max(1, size);
    }

    public static void setThickness(int thickness) {
        CrosshairEditor.thickness = Math.max(1, thickness);
    }

    public static void setColor(int color) {
        CrosshairEditor.color = color;
    }

    public static void setOpacity(float opacity) {
        CrosshairEditor.opacity = Math.max(0.0f, Math.min(1.0f, opacity));
    }

    public static int getSize() { return size; }
    public static int getThickness() { return thickness; }
    public static int getColor() { return color; }
    public static boolean isEnabled() { return enabled; }
    public static float getOpacity() { return opacity; }
    public static boolean isGapShown() { return showGap; }
    public static int getGapSize() { return gapSize; }
}
