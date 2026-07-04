package com.nebulaclient.utilities;

import net.minecraft.client.MinecraftClient;

public class PerformanceAnalyzer {
    private static int fps = 0;
    private static long memoryUsed = 0;
    private static long memoryMax = 0;
    private static float cpuUsage = 0.0f;

    public static void update() {
        MinecraftClient client = MinecraftClient.getInstance();
        fps = client.getCurrentFps();

        Runtime runtime = Runtime.getRuntime();
        memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        memoryMax = runtime.maxMemory();

        // CPU usage would be calculated here
    }

    public static int getFPS() { return fps; }
    public static long getMemoryUsed() { return memoryUsed; }
    public static long getMemoryMax() { return memoryMax; }
    public static float getCPUUsage() { return cpuUsage; }
    public static double getMemoryPercentage() {
        return (memoryUsed * 100.0) / memoryMax;
    }
}
