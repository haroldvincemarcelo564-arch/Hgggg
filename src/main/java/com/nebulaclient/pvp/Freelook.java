package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Freelook {
    private static boolean active = false;
    private static float yaw = 0.0f;
    private static float pitch = 0.0f;

    public static void toggleFreelook() {
        active = !active;
    }

    public static void setRotation(float yaw, float pitch) {
        Freelook.yaw = yaw;
        Freelook.pitch = pitch;
    }

    public static float getYaw() {
        return active ? yaw : 0.0f;
    }

    public static float getPitch() {
        return active ? pitch : 0.0f;
    }

    public static boolean isActive() {
        return active;
    }
}
