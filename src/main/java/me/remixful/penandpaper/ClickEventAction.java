package me.remixful.penandpaper;

public enum ClickEventAction {
    OPEN_URL;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
