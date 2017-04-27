package me.remixful.penandpaper;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * The Pen And Paper API developed by Remixful.
 * @see <a href="https://github.com/Remixful/PenAndPaper">Official GitHub</a>
 */
public class PenAndPaper extends JavaPlugin {

    public WrittenBook newBook(String title, String author){
        return new WrittenBook(title,author);
    }

    public ItemStack publishBook(WrittenBook wb){
        return wb.publish();
    }
}
