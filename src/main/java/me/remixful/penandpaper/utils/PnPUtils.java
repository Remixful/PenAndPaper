package me.remixful.penandpaper.utils;

import org.bukkit.ChatColor;

/**
 * The type PnP utils.
 */
public class PnPUtils {
    /**
     * Colored string string.
     *
     * @param str the str
     * @return the string
     */
    public static String ColoredString(String str){
        return (!str.trim().equals("")) ? ChatColor.translateAlternateColorCodes('&', str) : str;
    }
}
