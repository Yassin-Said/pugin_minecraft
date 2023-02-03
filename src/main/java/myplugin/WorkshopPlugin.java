package myplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class WorkshopPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        System.out.println("[WorkshopPlugin] Loading WorkshopPlugin v1.0-SNAPSHOT");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }
    @Override
    public void onDisable() {
        super.onDisable();
        System.out.println("[WorkshopPlugin] Enabling WorkshopPlugin v1.0-SNAPSHOT");
    }
}
