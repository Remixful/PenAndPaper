package me.remixful.penandpaper;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class PenAndPaper extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        String version = getDescription().getVersion();
        getLogger().info("Enabling PenAndPaper Version " + version);
    }
}
