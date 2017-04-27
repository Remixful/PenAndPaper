package me.remixful.penandpaper.utils;

import org.bukkit.ChatColor;

public class PnPUtils {
    public static String ColoredString(String str){
        return (!str.trim().equals("")) ? ChatColor.translateAlternateColorCodes('&', str) : str;
    }
}
