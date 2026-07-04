package com.nebulaclient.performance;

import com.nebulaclient.NebulaClientInitializer;
import net.minecraft.client.MinecraftClient;

public class PerformanceMonitor {
    private static long lastFrameTime = 0;
    private static int frameCount = 0;
    private static double averageFPS = 0;
    private static double averageLatency = 0;
    private static long startTime = System.currentTimeMillis();

    public static void update() {
        long currentTime = System.currentTimeMillis();
        long deltaTime = currentTime - lastFrameTime;
        lastFrameTime = currentTime;

        MinecraftClient client = MinecraftClient.getInstance();
        int currentFPS = client.getCurrentFps();

        frameCount++;
        if (frameCount >= 100) {
            averageFPS = currentFPS;
            NebulaClientInitializer.LOGGER.debug("Average FPS: " + averageFPS);
            frameCount = 0;
        }
    }

    public static void recordLatency(long latency) {
        averageLatency = latency;
    }

    public static double getAverageFPS() {
        return averageFPS;
    }

    public static double getAverageLatency() {
        return averageLatency;
    }

    public static long getUptime() {
        return System.currentTimeMillis() - startTime;
    }

    public static PerformanceStats getStats() {
        Runtime runtime = Runtime.getRuntime();
        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        long memoryMax = runtime.maxMemory();

        return new PerformanceStats(
            MinecraftClient.getInstance().getCurrentFps(),
            (int) averageLatency,
            memoryUsed / 1024 / 1024,
            memoryMax / 1024 / 1024,
            getUptime()
        );
    }

    public static class PerformanceStats {
        public final int currentFPS;
        public final int latency;
        public final long memoryUsedMB;
        public final long memoryMaxMB;
        public final long uptime;

        public PerformanceStats(int fps, int latency, long usedMB, long maxMB, long uptime) {
            this.currentFPS = fps;
            this.latency = latency;
            this.memoryUsedMB = usedMB;
            this.memoryMaxMB = maxMB;
            this.uptime = uptime;
        }

        public double getMemoryUsagePercent() {
            return (memoryUsedMB * 100.0) / memoryMaxMB;
        }
    }
}
