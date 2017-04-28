package me.remixful.penandpaper;

import me.dpohvar.powernbt.PowerNBT;
import me.dpohvar.powernbt.api.NBTCompound;
import me.dpohvar.powernbt.api.NBTManager;
import org.bukkit.Bukkit;
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
    public static WrittenBook newBook(String title, String author) {
        return new WrittenBook(title,author);
    }

    /**
     * Publish book item stack.
     *
     * @param wb the wb
     * @return the item stack
     */
    public static ItemStack publishBook(WrittenBook wb) {
        return wb.publish();
    }

    public static boolean isWrittenBook(ItemStack item){
        NBTManager nbtManager = PowerNBT.getApi();
        NBTCompound compound = nbtManager.read(item);
        return compound.getBoolean("PnPWrittenBook");
    }
}
