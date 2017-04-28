package me.remixful.penandpaper.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * The type PnP utils.
 */
public class PnPUtils {
    /**
     * Colored string.
     *
     * @param str The string
     * @return The new colored string.
     */
    public static String ColoredString(String str){
        return (!str.trim().equals("")) ? ChatColor.translateAlternateColorCodes('&', str) : str;
    }

    /**
     * Removes color from a string
     * @param str The string
     * @return The uncolored string
     */
    public static String UncoloredString(String str){
        return !str.trim().equals("") && str.contains("&") || str.contains(Character.toString(ChatColor.COLOR_CHAR)) ? ChatColor.stripColor(str) : str;
    }
}
