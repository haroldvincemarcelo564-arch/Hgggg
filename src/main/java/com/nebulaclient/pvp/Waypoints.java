package com.nebulaclient.pvp;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class Waypoints {
    private static final List<Waypoint> waypoints = new ArrayList<>();

    public static void addWaypoint(String name, int x, int y, int z, int color) {
        waypoints.add(new Waypoint(name, x, y, z, color));
    }

    public static void removeWaypoint(String name) {
        waypoints.removeIf(w -> w.getName().equals(name));
    }

    public static List<Waypoint> getWaypoints() {
        return new ArrayList<>(waypoints);
    }

    public static class Waypoint {
        private final String name;
        private final int x, y, z;
        private final int color;

        public Waypoint(String name, int x, int y, int z, int color) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.z = z;
            this.color = color;
        }

        public String getName() { return name; }
        public int getX() { return x; }
        public int getY() { return y; }
        public int getZ() { return z; }
        public int getColor() { return color; }
    }
}
