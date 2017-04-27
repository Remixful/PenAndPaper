package me.remixful.penandpaper;

import me.remixful.penandpaper.WrittenBook.WrittenBook;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * The Pen And Paper API developed by Remixful.
 *
 * @see <a href="https://github.com/Remixful/PenAndPaper">Official GitHub</a>
 */
public class PenAndPaper extends JavaPlugin {
    /**
     * New book written book.
     *
     * @param title  the title
     * @param author the author
     * @return the written book
     */
    public WrittenBook newBook(String title, String author) {
        return new WrittenBook(title,author);
    }

    /**
     * Publish book item stack.
     *
     * @param wb the wb
     * @return the item stack
     */
    public ItemStack publishBook(WrittenBook wb) {
        return wb.publish();
    }
}
