package me.remixful.penandpaper.WrittenBook;

import org.bukkit.ChatColor;
import org.json.simple.JSONObject;

/**
 * The type Written book text.
 */
@SuppressWarnings("unchecked")
public class WrittenBookText {
    private JSONObject _jsonObject;
    private String _text;
    private WrittenBookPage _page;

    /**
     * Instantiates a new Written book text.
     *
     * @param str  the str
     * @param page the page
     */
    public WrittenBookText(String str, WrittenBookPage page) {
        this._jsonObject = new JSONObject();
        this._text = str;
        this._page = page;
        this._jsonObject.put("text", this._text);
        this._jsonObject.put("color", "reset");
    }

    /**
     * Set color.
     *
     * @param chatcolor the chatcolor
     */
    public void setColor(ChatColor chatcolor){
        this._jsonObject.put("color", chatcolor.name().toLowerCase());
    }

    /**
     * Get json object json object.
     *
     * @return the json object
     */
    public JSONObject getJSONObject(){
        return this._jsonObject;
    }

    /**
     * Get page written book page.
     *
     * @return the written book page
     */
    public WrittenBookPage getPage(){
        return this._page;
    }
}
