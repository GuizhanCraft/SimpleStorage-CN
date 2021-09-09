package io.github.sefiraat.simplestorage.items.other;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class RareDropRedstone {

    private RareDropRedstone() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "MECHANIC_DROP_REDSTONE",
            Material.REDSTONE_ORE,
            Theme.ITEM_RARE_DROP + "稀有掉落: 来自红石矿",
            "",
            Theme.PASSIVE + "该物品是开采红石矿时",
            Theme.PASSIVE + "有几率爆出的稀有掉落物",
            Theme.PASSIVE + "使用精准采集开采时不会掉落",
            "",
            Theme.LORE_TYPE_DROP
    );

    public static final RecipeType TYPE = new RecipeType(new NamespacedKey(SimpleStorage.inst(), "drop-redstone"), STACK, "");

}
