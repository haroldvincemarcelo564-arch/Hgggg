package com.nebulaclient.utilities;

import com.nebulaclient.util.NotificationSystem;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ScreenshotManager {
    private static final File SCREENSHOTS_DIR = new File("./nebula-client/screenshots");
    private static final List<ScreenshotInfo> screenshots = new ArrayList<>();

    public static void initialize() {
        if (!SCREENSHOTS_DIR.exists()) {
            SCREENSHOTS_DIR.mkdirs();
        }
        scanScreenshots();
    }

    private static void scanScreenshots() {
        File[] files = SCREENSHOTS_DIR.listFiles((dir, name) -> 
            name.endsWith(".png") || name.endsWith(".jpg"));
        
        if (files != null) {
            for (File file : files) {
                screenshots.add(new ScreenshotInfo(
                    file.getName(),
                    file.getAbsolutePath(),
                    file.lastModified(),
                    file.length()
                ));
            }
        }
    }

    public static void takeScreenshot() {
        String timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        String filename = "screenshot_" + timestamp + ".png";
        // Screenshot capture logic here
        NotificationSystem.notifyScreenshotSaved(filename);
    }

    public static List<ScreenshotInfo> getScreenshots() {
        return new ArrayList<>(screenshots);
    }

    public static class ScreenshotInfo {
        private final String name;
        private final String path;
        private final long timestamp;
        private final long size;

        public ScreenshotInfo(String name, String path, long timestamp, long size) {
            this.name = name;
            this.path = path;
            this.timestamp = timestamp;
            this.size = size;
        }

        public String getName() { return name; }
        public String getPath() { return path; }
        public long getTimestamp() { return timestamp; }
        public long getSize() { return size; }
    }
}
