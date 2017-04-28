package me.remixful.penandpaper;

import me.dpohvar.powernbt.PowerNBT;
import me.dpohvar.powernbt.api.NBTCompound;
import me.dpohvar.powernbt.api.NBTManager;
import me.remixful.penandpaper.utils.PnPUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Written book.
 */
@SuppressWarnings("unchecked")
public class    WrittenBook {
    private String _title, _author;
    private List<WrittenBookPage> _writtenBookPages;
    private ItemStack _item;
    private NBTManager _nbtManager;
    private NBTCompound _itemData;

    /**
     * Title defaults to "Written Book" and Author defaults to "Anonymous" if this no-argument constructor is used.
     */
    public WrittenBook() {
        this._nbtManager  = PowerNBT.getApi();
        this._title = "Written Book";
        this._author = "Anonymous";
        this._writtenBookPages  = new ArrayList<>();
        this._item = this._nbtManager.asCraftItemStack(new ItemStack(Material.WRITTEN_BOOK));
        this._itemData = new NBTCompound();
        this._itemData.put("title", this._title);
        this._itemData.put("author", this._author);
        this._nbtManager.write(this._item, this._itemData);
    }

    /**
     * Instantiates a new Written book.
     *
     * @param title  the title
     * @param author the author
     */
    public WrittenBook(String title, String author) {
        this();
        this.setTitle(title);
        this.setAuthor(author);
    }

    /**
     * Instantiates a new Written book.
     *
     * @param title the title
     */
    public WrittenBook(String title) {
        this();
        this.setTitle(title);
    }

    public WrittenBook(BookMeta bookmeta) {
        this();
        if(bookmeta.hasTitle()) this.setTitle(bookmeta.getTitle());
        if(bookmeta.hasAuthor()) this.setAuthor(bookmeta.getAuthor());
    }

    /**
     * Create Material.WRITTEN_BOOK ItemStack from this <code>Written Book</code>
     *
     * @return Material.WRITTEN_BOOK ItemStack
     */
    public ItemStack publish() {
        if(_writtenBookPages.size() == 0) {
            WrittenBookPage wb = this.addPage();
            wb.write("");
        }
        JSONArray pages = new JSONArray();
        for (WrittenBookPage wbp : _writtenBookPages) {
            pages.add(wbp.toJSONString());
        }
        this._itemData.put("pages", pages);
        this._itemData.put("PnPWrittenBook", true);
        _nbtManager.write(getItem(), _itemData);
        return this.getItem();
    }

    //Setters
    public void setTitle(String title) {
        if (title != null) {
            this._title = PnPUtils.ColoredString(title);
            this._itemData.put("title", this._title);
            this._nbtManager.write(this._item, this._itemData);
        }
    }

    public void setAuthor(String author) {
        if(author != null) {
            this._author = PnPUtils.ColoredString(author);
            this._itemData.put("author", this._author);
            this._nbtManager.write(this._item, this._itemData);
        }
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    //Getters
    public String getTitle() {
        return this._title;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return this._author;
    }

    private ItemStack getItem() {
        return this._item;
    }

    /**
     * Add a new {@link me.remixful.penandpaper.WrittenBookPage} to this Written Book
     * @return The new <code>WrittenBookPage</code>
     */
    public WrittenBookPage addPage(WrittenBookPage page){
        this._writtenBookPages.add(page);
        return page;
    }

    /**
     * Adds a new empty {@link me.remixful.penandpaper.WrittenBookPage} to this Written Book
     * @return The new <code>WrittenBookPage</code>
     */
    public WrittenBookPage addPage(){
        WrittenBookPage page = new WrittenBookPage();
        this._writtenBookPages.add(page);
        return page;
    }

    /**
     * Completely remove the page from this Written Book
     * @return The page you removed
     */
    private WrittenBookPage tearPage(Integer index){
        //TODO
        return null;
    }

    /**
     * Get page of this Written Book. Pages are 1-based.
     * @param index Page of Written Book.
     */
    public WrittenBookPage getPage(Integer index){
        return this._writtenBookPages.get(Math.max(0, index - 1));
    }

    /**
     * Get the amount of pages in this Written Book
     */
    public int getPageCount(){
        return this._writtenBookPages.size();
    }

}
