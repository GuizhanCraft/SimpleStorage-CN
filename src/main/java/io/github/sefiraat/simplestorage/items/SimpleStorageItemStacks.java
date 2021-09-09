package io.github.sefiraat.simplestorage.items;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.items.machines.DiePress;
import io.github.sefiraat.simplestorage.items.machines.Enderator;
import io.github.sefiraat.simplestorage.items.machines.MetalPressBasic;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;

public final class SimpleStorageItemStacks {

    private SimpleStorageItemStacks() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack ANGELITE = new SlimefunItemStack(
            "MATERIAL_ANGELITE",
            Skulls.ITEM_ANGELITE,
            Theme.ITEM_CRAFTING + "天使水晶",
            "",
            Theme.PASSIVE + "天使水晶是一种稀有资源",
            Theme.PASSIVE + "用于简单的数据传输",
            Theme.PASSIVE + "在寒冷地区数量较多",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack PROUSTITE = new SlimefunItemStack(
            "MATERIAL_PROUSTITE",
            Skulls.ITEM_PROUSTITE,
            Theme.ITEM_CRAFTING + "淡红银水晶",
            "",
            Theme.PASSIVE + "淡红银水晶是一种稀有资源",
            Theme.PASSIVE + "用于更高级的数据传输",
            Theme.PASSIVE + "只能在炎热地区找到",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack SHORTITE = new SlimefunItemStack(
            "MATERIAL_SHORTITE",
            Skulls.ITEM_SHORTITE,
            Theme.ITEM_CRAFTING + "碳酸钠钙水晶",
            "",
            Theme.PASSIVE + "碳酸钠钙水晶是一种稀有资源",
            Theme.PASSIVE + "用于最先进的数据传输",
            Theme.PASSIVE + "未知出现位置",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CLEARQUARTZ = new SlimefunItemStack(
            "MATERIAL_QUARTZGEM",
            Skulls.ITEM_CLEAR_QUARTZ,
            Theme.ITEM_CRAFTING + "晶莹剔透的石英",
            "",
            Theme.PASSIVE + "这种形式的石英非常罕见",
            Theme.PASSIVE + "用于制作显示器",
            Theme.PASSIVE + "未知出现位置",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_CHROMITE = new SlimefunItemStack(
            "CHUNK_CHROMITE",
            Skulls.ITEM_CHROMITE_CHUNK,
            Theme.ITEM_CRAFTING + "铬铁矿块",
            "",
            Theme.PASSIVE + "一种非常稀有的矿石",
            Theme.PASSIVE + "可加工成铬铁矿",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_BASTNAESITE = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_CHUNK",
            Skulls.ITEM_BASTNAESITE_CHUNK,
            Theme.ITEM_CRAFTING + "氟碳铈矿块",
            "",
            Theme.PASSIVE + "一种非常稀有的矿石",
            Theme.PASSIVE + "可加工成铈",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_ANTIMONY = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_CHUNK",
            Skulls.ITEM_ANTIMONY_CHUNK,
            Theme.ITEM_CRAFTING + "锑碎片",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "可加工成锑",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack RHENIUM_CHUNK = new SlimefunItemStack(
            "MATERIAL_RHENIUM_CHUNK",
            Skulls.ITEM_RHENIUM_CHUNK,
            Theme.ITEM_CRAFTING + "铼碎片",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "可加工成铼",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHROMIUM_DUST = new SlimefunItemStack(
            "MATERIAL_CHROMIUM_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "铬粉",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "需要加工成锭",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack BASTNAESITE_DUST = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "氟碳铈矿粉",
            "",
            Theme.PASSIVE + "一种非常稀有的矿石",
            Theme.PASSIVE + "需要加工成锭",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ANTIMONY_DUST = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "锑粉",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "需要加工成锭",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack RHENIUM_DUST = new SlimefunItemStack(
            "MATERIAL_RHENIUM_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "铼粉",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "需要加工成锭",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHROMIUM_INGOT = new SlimefunItemStack(
            "MATERIAL_CHROMIUM_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "铬锭",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "用于制作合金",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack BASTNAESITE_INGOT = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "氟碳铈矿锭",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "用于制作合金",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ANTIMONY_INGOT = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "锑锭",
            "",
            Theme.PASSIVE + "一种非常稀有的金属",
            Theme.PASSIVE + "用于制作高级合金",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack RHENIUM_INGOT = new SlimefunItemStack(
            "MATERIAL_RHENIUM_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "铼锭",
            "",
            Theme.PASSIVE + "一种难以置信的稀有金属",
            Theme.PASSIVE + "用于制作高级合金",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ELECTRUM_INGOT = new SlimefunItemStack(
            "MATERIAL_ELECTRUM",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "银金合金锭",
            "",
            Theme.PASSIVE + "一种没什么用的合金",
            Theme.PASSIVE + "由银和金制成",
            Theme.PASSIVE + "但我们也许能找到点用途?",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_INGOT = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "铜镍合金锭",
            "",
            Theme.PASSIVE + "由铜与镍制成的合金",
            Theme.PASSIVE + "有较高强度与耐高压的特性",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_INGOT = new SlimefunItemStack(
            "MATERIAL_PEWTER",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "银锡合金锭",
            "",
            Theme.PASSIVE + "由银和锡制成的合金",
            Theme.PASSIVE + "有较高的耐用性",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICKEL_SUPER_INGOT = new SlimefunItemStack(
            "MATERIAL_SUPER_INGOT",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "镍超级合金",
            "",
            Theme.PASSIVE + "由镍与铼制成的合金",
            Theme.PASSIVE + "有极致的耐高温特性",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_1 = new SlimefunItemStack(
            "MATERIAL_ZAMAK1",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "扎马克合金-1",
            "",
            Theme.PASSIVE + "由锌、铝和铜制成的合金",
            Theme.PASSIVE + "虽然这种合金不是最强的",
            Theme.PASSIVE + "但它对机器模具很有用",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_2 = new SlimefunItemStack(
            "MATERIAL_ZAMAK2",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "扎马克合金-2",
            "",
            Theme.PASSIVE + "由锌、铝和铜制成的合金",
            Theme.PASSIVE + "扎马克合金-2使用额外的铜",
            Theme.PASSIVE + "来增加强度，使其能用于",
            Theme.PASSIVE + "更多的金属模具",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_3 = new SlimefunItemStack(
            "MATERIAL_ZAMAK3",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "扎马克合金-3",
            "",
            Theme.PASSIVE + "由锌、铝和铜制成的合金",
            Theme.PASSIVE + "扎马克合金-3使用额外的镁",
            Theme.PASSIVE + "来增加稳定性",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NISIL = new SlimefunItemStack(
            "MATERIAL_NISIL",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "镍硅合金锭",
            "",
            Theme.PASSIVE + "由镍和硅制成的合金",
            Theme.PASSIVE + "用于制作热电偶",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICROSIL = new SlimefunItemStack(
            "MATERIAL_NICROSIL",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "镍铬硅合金锭",
            "",
            Theme.PASSIVE + "由镍、铬和硅制成的合金",
            Theme.PASSIVE + "用于制作热电偶",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_REINFORCED = new SlimefunItemStack(
            "MATERIAL_REINFORCED_CUPRONICKEL",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "强化铜镍合金锭",
            "",
            Theme.PASSIVE + "由铜与镍制成的合金",
            Theme.PASSIVE + "有较高强度与耐高压的特性",
            Theme.PASSIVE + "并使用铬铁矿进行强化",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_REINFORCED = new SlimefunItemStack(
            "MATERIAL_REINFORCED_PEWTER",
            Material.IRON_INGOT ,
            Theme.ITEM_CRAFTING + "硬化银锡合金锭",
            "",
            Theme.PASSIVE + "由银和锡制成的合金",
            Theme.PASSIVE + "有较高的耐用性",
            Theme.PASSIVE + "并使用锑进行硬化",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ELECTRUM_PLATE = new SlimefunItemStack(
            "MATERIAL_ELECTRUM_PLATE",
            Material.YELLOW_CARPET,
            Theme.ITEM_CRAFTING + "银金合金板",
            "",
            Theme.PASSIVE + "由银金合金制成的板",
            Theme.PASSIVE + "用于制作基础储存组件的外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_PLATE = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL_PLATE",
            Material.ORANGE_CARPET,
            Theme.ITEM_CRAFTING + "强化铜镍合金板",
            "",
            Theme.PASSIVE + "由强化镍铜合金制成的板",
            Theme.PASSIVE + "用于制作中级储存组件的外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_PLATE = new SlimefunItemStack(
            "MATERIAL_PEWTER_PLATE",
            Material.LIGHT_GRAY_CARPET,
            Theme.ITEM_CRAFTING + "硬化银锡合金板",
            "",
            Theme.PASSIVE + "由银锡合金制成的板",
            Theme.PASSIVE + "用于制作高级储存组件的外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICKEL_SUPERALLOY_PLATE = new SlimefunItemStack(
            "MATERIAL_SUPER_PLATE",
            Material.BROWN_CARPET,
            Theme.ITEM_CRAFTING + "镍超级合金板",
            "",
            Theme.PASSIVE + "由镍和铼制成的板",
            Theme.PASSIVE + "用于制作高级储存组件的外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack COMBINED_PLATE = new SlimefunItemStack(
            "MATERIAL_COMBINED_PLATE",
            Material.PINK_CARPET,
            Theme.ITEM_CRAFTING + "组合板",
            "",
            Theme.PASSIVE + "由镍和铼制成的板",
            Theme.PASSIVE + "使用银锡合金进行分层",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_BASIC = new SlimefunItemStack(
            "MATERIAL_DIE_BASIC",
            Material.LIGHT_GRAY_CARPET,
            Theme.ITEM_CRAFTING + "基础模具",
            "",
            Theme.PASSIVE + "由扎马克合金-1制作出的脆弱模具",
            Theme.PASSIVE + "可用于制作基础的注入外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_REINFORCED = new SlimefunItemStack(
            "MATERIAL_DIE_REINFORCED",
            Material.GRAY_CARPET,
            Theme.ITEM_CRAFTING + "强化模具",
            "",
            Theme.PASSIVE + "由扎马克合金-2制作出的强化模具",
            Theme.PASSIVE + "可用于制作中级的注入外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_ADVANCED = new SlimefunItemStack(
            "MATERIAL_DIE_ADVANCED",
            Material.BLACK_CARPET,
            Theme.ITEM_CRAFTING + "高级模具",
            "",
            Theme.PASSIVE + "由扎马克合金-3制作出的高级模具",
            Theme.PASSIVE + "可用于制作顶级的注入外壳",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack THERMOCOUPLE = new SlimefunItemStack(
            "MATERIAL_THERMOCOUPLE",
            Material.REPEATER,
            Theme.ITEM_CRAFTING + "热电偶",
            "",
            Theme.PASSIVE + "用于测试热传导",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_BASIC = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_BASIC",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "基础箱子核心",
            "",
            Theme.PASSIVE + "作为铁箱子的核心",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_REINFORCED = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_REINFORCED",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "强化箱子核心",
            "",
            Theme.PASSIVE + "作为金箱子的核心",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_ADVANCED = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_ADVANCED",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "高级箱子核心",
            "",
            Theme.PASSIVE + "作为钻石箱子的核心",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack COMMUNICATION_BLOCK = new SlimefunItemStack(
            "BLOCK_COMMUNICATION",
            Material.BLACK_GLAZED_TERRACOTTA,
            Theme.ITEM_MACHINE + "通讯方块",
            "",
            Theme.PASSIVE + "允许各种储物空间连接至",
            Theme.PASSIVE + "网络的主控制",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DISPLAY_PANEL = new SlimefunItemStack(
            "MATERIAL_DISPLAY",
            Material.GRAY_STAINED_GLASS_PANE,
            Theme.ITEM_CRAFTING + "显示面板",
            "",
            Theme.PASSIVE + "一个显示面板",
            Theme.PASSIVE + "用于制作储物箱主控制",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_PRESS = new SlimefunItemStack(
            "MACHINE_DIE_PRESS",
            Material.PISTON,
            Theme.ITEM_MACHINE + "压模机",
            "",
            Theme.PASSIVE + "可使用特定的金属制作模具",
            Theme.PASSIVE + "模具用来给其他金属定型",
            "",
            MachineLore.energyPerSecond(DiePress.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack METAL_PRESS_BASIC = new SlimefunItemStack(
            "MACHINE_METAL_PRESS_BASIC",
            Material.STICKY_PISTON,
            Theme.ITEM_MACHINE + "基础金属压机",
            "",
            Theme.PASSIVE + "一种机械金属压机",
            Theme.PASSIVE + "可使用基础模具与软合金",
            Theme.PASSIVE + "制作成型的金属板",
            "",
            MachineLore.energyPerSecond(MetalPressBasic.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack ENDERATOR = new SlimefunItemStack(
            "MACHINE_ENDERATOR",
            Material.RESPAWN_ANCHOR,
            Theme.ITEM_MACHINE + "末地扭曲机",
            "",
            Theme.PASSIVE + "使用末地水晶与大量引导能量",
            Theme.PASSIVE + "将物品的结构扭曲成其他物品",
            "",
            MachineLore.energyPerSecond(Enderator.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack CHEST_IRON = new SlimefunItemStack(
            "BLOCK_CHEST_IRON",
            Skulls.BLOCK_CHEST_IRON,
            Theme.ITEM_MACHINE + "铁箱子",
            "",
            Theme.PASSIVE + "一个包含90个物品栏位的箱子",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_GOLD = new SlimefunItemStack(
            "BLOCK_CHEST_GOLD",
            Skulls.BLOCK_CHEST_GOLD,
            Theme.ITEM_MACHINE + "金箱子",
            "",
            Theme.PASSIVE + "一个包含180个物品栏位的箱子",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_DIAMOND = new SlimefunItemStack(
            "BLOCK_CHEST_DIAMOND",
            Skulls.BLOCK_CHEST_DIAMOND,
            Theme.ITEM_MACHINE + "钻石箱子",
            "",
            Theme.PASSIVE + "一个包含270个物品栏位的箱子",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack INVENTORY_CELL = new SlimefunItemStack(
            "BLOCK_CELL_BASIC",
            Skulls.BLOCK_CELL_BASIC,
            Theme.ITEM_MACHINE + "存储单元",
            "",
            Theme.PASSIVE + "一个包含270个物品栏位的存储单元",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_NETWORK = new SlimefunItemStack(
            "BLOCK_CHEST_NETWORK",
            Skulls.BLOCK_CHEST_MASTER,
            Theme.ITEM_MACHINE + "网络存储箱",
            "",
            Theme.PASSIVE + "这个箱子可以访问周围",
            Theme.PASSIVE + "所有存储单元内的物品",
            "",
            Theme.PASSIVE + "存储单元必须在网络存储箱",
            Theme.PASSIVE + "周围 " + Theme.ITEM_TYPEDESC + SimpleStorage.inst().getManagerConfiguration().getVals().getNetworkRange() + Theme.PASSIVE + " 格范围内才能读取",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack UPGRADE_BARREL = new SlimefunItemStack(
            "UPGRADE_BARREL",
            Skulls.ITEM_UPGRADE_BARREL,
            Theme.ITEM_AUGMENT + "组件: 存储桶",
            "",
            Theme.PASSIVE + "使网络存储箱可以访问范围内:",
            Theme.PASSIVE + "- 存储单元 (无尽科技)",
            Theme.PASSIVE + "- 蓬松桶 (蓬松科技)",
            "",
            Theme.LORE_TYPE_AUGMENT
    );
}
