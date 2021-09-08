package io.github.sefiraat.simplestorage.items.chests;

import io.github.sefiraat.simplestorage.items.Skulls;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement.NetworkElementType;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GuiItems {

    private GuiItems() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItemStack menuBackground() {
        return new CustomItemStack(
                Material.GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "Simple!",
                ""
        );
    }

    public static CustomItemStack menuInfo() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_NO1)),
                Theme.GUI_HEAD + "信息",
                "",
                "第 1 页"
        );
    }

    public static CustomItemStack menuChestPageBack() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_BACK)),
                Theme.GUI_HEAD + "上一页",
                "",
                Theme.CLICK_INFO + "点击访问上一页"
        );
    }

    public static CustomItemStack menuChestPageForward() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_FORWARD)),
                Theme.GUI_HEAD + "下一页",
                "",
                Theme.CLICK_INFO + "点击访问下一页"
        );
    }

    public static CustomItemStack menuChestDummy() {
        return new CustomItemStack(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "没有物品"
        );
    }

    public static CustomItemStack menuMasterDummy() {
        return new CustomItemStack(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "No inventory here"
        );
    }

    public static CustomItemStack menuClose() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_CLOSE)),
                Theme.GUI_HEAD + "关闭"
        );
    }

    public static CustomItemStack menuRenameCell() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_RENAME_CELL)),
                Theme.GUI_HEAD + "重命名存储单元"
        );
    }

    public static CustomItemStack menuSetMaterial() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_SET_ICON)),
                Theme.GUI_HEAD + "设置图标",
                "",
                Theme.ITEM_TYPEDESC + "在界面中拿起一个物品并点击这里",
                Theme.ITEM_TYPEDESC + "以设置该存储空间的图标"
        );
    }

    public static CustomItemStack menuCell(NetworkElement ne) {

        ItemStack i = NetworkElement.getItemStack(ne);
        String name;
        String storedName = ne.getDisplayName();
        if (storedName == null) {
            name = ChatColor.WHITE + "已扫描的存储空间";
        } else {
            name = storedName;
        }

        if (ne.getType() == NetworkElement.NetworkElementType.INVENTORY_CELL) {
            return menuCellNormal(i, name);
        } else if (
                ne.getType() == NetworkElementType.INFINITY_BARREL ||
                ne.getType() == NetworkElementType.FLUFFY_BARREL
        ) {
            return menuCellBarrel(i, name, ne);
        } else {
            return menuCellError();
        }
    }

    public static CustomItemStack menuCellNormal(ItemStack i, String name) {
        return new CustomItemStack(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "存储空间类型: " + NetworkElement.networkElementTypeName(NetworkElement.NetworkElementType.INVENTORY_CELL),
                "",
                Theme.CLICK_INFO + "左键点击" + ChatColor.WHITE + "打开存储空间",
                Theme.CLICK_INFO + "右键点击" + ChatColor.WHITE + "高亮存储空间"
        );
    }

    public static CustomItemStack menuCellBarrel(ItemStack i, String name, NetworkElement networkElement) {
        String barrelAmount = Theme.ITEM_TYPEDESC + "容量: " + ChatColor.WHITE + networkElement.getBarrelAmount();
        return new CustomItemStack(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "存储空间类型: " + NetworkElement.networkElementTypeName(networkElement.getType()),
                "",
                barrelAmount,
                "",
                Theme.CLICK_INFO + "左键点击" + ChatColor.WHITE + "打开存储空间",
                Theme.CLICK_INFO + "右键点击" + ChatColor.WHITE + "高亮存储空间"
        );
    }

    public static CustomItemStack menuCellError() {
        return new CustomItemStack(
                Material.BARRIER,
                Theme.GUI_HEAD + "已扫描的存储空间 (错误)",
                "",
                Theme.ITEM_TYPEDESC + "存储空间类型: 未知",
                "",
                Theme.CLICK_INFO + "左键点击" + ChatColor.WHITE + "打开存储空间",
                Theme.CLICK_INFO + "右键点击" + ChatColor.WHITE + "高亮存储空间"
        );
    }


}
