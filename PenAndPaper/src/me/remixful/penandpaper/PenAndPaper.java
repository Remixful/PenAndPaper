package me.remixful.penandpaper;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * The Pen And Paper API developed by Remixful.
 * @see <a href="https://github.com/Remixful/PenAndPaper">Official GitHub</a>
 */
public class PenAndPaper extends JavaPlugin {
    /**
     * Create Material.WRITTEN_BOOK ItemStack from <code>Written Book</code>
     * @param wb {@link me.remixful.penandpaper.WrittenBook}
     * @return Material.WRITTEN_BOOK ItemStack
     */
    public static ItemStack publishBook(WrittenBook wb){
        //TODO
        return new ItemStack(Material.WRITTEN_BOOK);
    }
}
