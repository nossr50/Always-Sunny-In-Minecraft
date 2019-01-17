package com.gmail.nossr50.alwayssunnyinminecraft.listeners;

import com.gmail.nossr50.alwayssunnyinminecraft.AlwaysSunnyInMinecraft;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * You two better not be bangin
 */
public class WeatherListener implements Listener {
    private AlwaysSunnyInMinecraft plugin;

    public WeatherListener(AlwaysSunnyInMinecraft plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onWeatherChangeEvent(WeatherChangeEvent event)
    {
        event.setCancelled(true);

        event.getWorld().setWeatherDuration(0);
    }

}
