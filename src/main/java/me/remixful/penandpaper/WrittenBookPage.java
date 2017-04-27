package me.remixful.penandpaper;

import org.bukkit.Bukkit;
import org.json.simple.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Written book page.
 */
@SuppressWarnings("unchecked")
public class WrittenBookPage {
    private List<WrittenBookText> _writtenBookTexts;

    /**
     * Instantiates a new Written book page.
     */
    //TODO: Support for next page and automatically going to next page when at max text limit
    public WrittenBookPage(){
        _writtenBookTexts = new ArrayList<>();
    }

    /**
     * Write.
     *
     * @param wb the wb
     */
    public void write(WrittenBookText wb){
        this._writtenBookTexts.add(wb);
    }

    /**
     * Each page is a string in double quotes. That's why this exists.
     *
     * @return Returns JSONString
     */
    public String toJSONString(){
        JSONArray jarray = new JSONArray();
        for(WrittenBookText wbt:_writtenBookTexts){
            jarray.add(wbt.getJSONObject());
            Bukkit.broadcastMessage(wbt.getJSONObject().toJSONString());
        }
        return jarray.toJSONString();
    }
}
