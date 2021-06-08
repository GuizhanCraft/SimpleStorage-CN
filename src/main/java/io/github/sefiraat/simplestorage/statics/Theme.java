package io.github.sefiraat.simplestorage.statics;

import net.md_5.bungee.api.ChatColor;

public final class Theme {

    private Theme() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PREFIX = "" + ChatColor.GRAY + "[Simple Storage] ";
    public static final String SUFFIX = "" + ChatColor.GRAY + "";
    public static final ChatColor WARNING = ChatColor.YELLOW;
    public static final ChatColor ERROR = ChatColor.RED;
    public static final ChatColor NOTICE = ChatColor.WHITE;
    public static final ChatColor PASSIVE = ChatColor.GRAY;
    public static final ChatColor SUCCESS = ChatColor.GREEN;
    public static final ChatColor MAIN = ChatColor.of("#21588f");
    public static final ChatColor ITEM_CRAFTING = ChatColor.of("#dbcea9");
    public static final ChatColor ITEM_MACHINE = ChatColor.of("#3295a8");
    public static final ChatColor ITEM_RARE_DROP = ChatColor.of("#bf307f");
    public static final ChatColor ITEM_TYPEDESC = ChatColor.of("#f0ea4f");
    public static final ChatColor GUI_HEAD = ChatColor.of("#175724");
    public static final ChatColor CLICK_INFO = ChatColor.of("#e4ed32");

}
