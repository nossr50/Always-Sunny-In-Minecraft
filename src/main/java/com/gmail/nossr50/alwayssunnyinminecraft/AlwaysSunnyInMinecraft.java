package com.gmail.nossr50.alwayssunnyinminecraft;

import com.gmail.nossr50.alwayssunnyinminecraft.listeners.WeatherListener;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * That sounds like charlie work
 */
public class AlwaysSunnyInMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        getServer().getPluginManager().registerEvents(new WeatherListener(this), this);
        getLogger().info("Always Sunny is loaded.");

        for(World world : this.getServer().getWorlds())
        {
            world.setWeatherDuration(0);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Always Sunny has been disabled.");
    }

}
