package com.nebulaclient.utilities;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class WorldBackupManager {
    private static final File BACKUP_DIR = new File("./nebula-client/backups");
    private static final List<BackupInfo> backups = new ArrayList<>();

    public static void initialize() {
        if (!BACKUP_DIR.exists()) {
            BACKUP_DIR.mkdirs();
        }
        scanBackups();
    }

    private static void scanBackups() {
        File[] files = BACKUP_DIR.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    backups.add(new BackupInfo(
                        file.getName(),
                        file.getAbsolutePath(),
                        file.lastModified()
                    ));
                }
            }
        }
    }

    public static void createBackup(String worldName) {
        String backupName = worldName + "_" + 
            LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        // Backup creation logic here
    }

    public static void deleteBackup(String backupName) {
        backups.removeIf(b -> b.getName().equals(backupName));
        // Delete backup files
    }

    public static List<BackupInfo> getBackups() {
        return new ArrayList<>(backups);
    }

    public static class BackupInfo {
        private final String name;
        private final String path;
        private final long timestamp;

        public BackupInfo(String name, String path, long timestamp) {
            this.name = name;
            this.path = path;
            this.timestamp = timestamp;
        }

        public String getName() { return name; }
        public String getPath() { return path; }
        public long getTimestamp() { return timestamp; }
    }
}
