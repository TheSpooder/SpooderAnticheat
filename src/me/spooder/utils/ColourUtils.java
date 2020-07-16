package me.spooder.utils;

import org.bukkit.ChatColor;

public class ColourUtils {
    public static String colour(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
