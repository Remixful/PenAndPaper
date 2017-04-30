package me.remixful.penandpaper;

import me.remixful.penandpaper.utils.PnPUtils;
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
     * Appends new {@link WrittenBookText} to the current page
     *
     * @param str Text to append (supports '&amp;' character for text formatting)
     * @return The new {@link WrittenBookText}
     */
    public WrittenBookText write(String str) {
        WrittenBookText wbtext = new WrittenBookText(PnPUtils.ColoredString(str), this);
        this._writtenBookTexts.add(wbtext);
        return wbtext;
    }


    /**
     * Same as {@link #write(String)} but writes the specified text followed by a newline character
     *
     * @param text Text to append (supports '&amp;' character for text formatting)
     * @return The new {@link WrittenBookText}
     */
    public WrittenBookText writeLine(String text) {
        return this.write(text + "\n");
    }

    /**
     * Removes all content from this page
     */
    public void clear(){
        this._writtenBookTexts = new ArrayList<>();
    }

    private void Erase(WrittenBookText wbtext){
        //TODO
    }

    /**
     * Each page is a string in double quotes. That's why this exists.
     *
     * @return Returns JSONString
     */
    public String toJSONString(){
        JSONArray jarray = new JSONArray();
        if(jarray.size() == 0){
            this.write("");
        }
        for(WrittenBookText wbt:_writtenBookTexts){
            jarray.add(wbt.getJSONObject());
            //Used for debugging purposes Bukkit.broadcastMessage(wbt.getJSONObject().toJSONString());
        }
        return jarray.toJSONString();
    }
}
