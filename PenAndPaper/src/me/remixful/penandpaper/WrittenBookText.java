package me.remixful.penandpaper;

import org.bukkit.ChatColor;
import org.json.simple.JSONObject;

@SuppressWarnings("unchecked")
public class WrittenBookText {
    private JSONObject _jsonObject;
    private String _text;
    private WrittenBookPage _page;

    public WrittenBookText(String str, WrittenBookPage page) {
        this._jsonObject = new JSONObject();
        this._text = str;
        this._page = page;
        this._jsonObject.put("text", this._text);
        this._jsonObject.put("color", "reset");
    }

    public void setColor(ChatColor chatcolor){
        this._jsonObject.put("color", chatcolor.name().toLowerCase());
    }

    public JSONObject getJSONObject(){
        return this._jsonObject;
    }

    public WrittenBookPage getPage(){
        return this._page;
    }
}
