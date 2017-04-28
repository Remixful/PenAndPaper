package me.remixful.penandpaper;

public enum ClickEventAction {
    OPEN_URL,
    CHANGE_PAGE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
