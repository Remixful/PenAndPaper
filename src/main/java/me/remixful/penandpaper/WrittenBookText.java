package me.remixful.penandpaper;

import org.bukkit.Bukkit;
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
     * Set color of this text
     *
     * @param chatcolor the chatcolor
     */
    public void setColor(ChatColor chatcolor){
        this._jsonObject.put("color", chatcolor.name().toLowerCase());
    }

    /**
     * Set the click event of this text
     * @param action The action to perform when clicked.
     * @param value The URL, file, twitch user, chat, command or book page used by the specified action.
     */
    public void setClickEvent(ClickEventAction action, String value){
        JSONObject event = new JSONObject();
        event.put("action", action.toString());
        if(action == ClickEventAction.OPEN_URL) {
            if (!value.substring(0, 7).equals("http://") && !value.substring(0, 8).equals("https://")) {
                StringBuilder sb = new StringBuilder(value);
                sb.insert(0, "http://");
                value = sb.toString();
            }
        }
        event.put("value", value);
        this._jsonObject.put("clickEvent", event);
    }

    public void setHoverEvent(HoverEventAction action, String value){
        JSONObject event = new JSONObject();
        JSONObject jsonvalue = new JSONObject();
        jsonvalue.put("text", value);
        event.put("action", action.toString());
        event.put("value", jsonvalue);
        this._jsonObject.put("hoverEvent", event);
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
