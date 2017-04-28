package me.remixful.penandpaper;

public enum HoverEventAction {
    SHOW_TEXT;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
