package net.ninjaworks.chroniclesofthelightside.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ninjaworks.chroniclesofthelightside.chroniclesofthelightside;
import net.ninjaworks.chroniclesofthelightside.item.custom.BlowtorchItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, chroniclesofthelightside.MOD_ID);


    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> NENDER_INGOT = ITEMS.register("nender_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));


    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> BLOWCHIP = ITEMS.register("blowchip",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> FRISBY_DISC = ITEMS.register("frisby_disc",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));


    public static final RegistryObject<Item> ELECTRICAL_CONTACT= ITEMS.register("electrical_contact",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> BLOWTORCH = ITEMS.register("blowtorch",
            () -> new BlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(64)));

    public static final RegistryObject<Item> ATOM = ITEMS.register("atom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR)));

    public static final RegistryObject<Item> NENDER_PICKAXE = ITEMS.register("nender_pickaxe",
            () -> new PickaxeItem(ModTiers.NENDER, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));

    public static final RegistryObject<Item> NENDER_SHOVEL = ITEMS.register("nender_shovel",
            () -> new PickaxeItem(ModTiers.NENDER, 0, 0.4f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));

    public static final RegistryObject<Item> NENDER_HOE = ITEMS.register("nender_hoe",
            () -> new PickaxeItem(ModTiers.NENDER, 0, 0.4f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));

    public static final RegistryObject<Item> NENDER_SWORD = ITEMS.register("nender_sword",
            () -> new PickaxeItem(ModTiers.NENDER, 1, 3f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));

    public static final RegistryObject<Item> NENDER_AXE = ITEMS.register("nender_axe",
            () -> new PickaxeItem(ModTiers.NENDER, 2, 1.5f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));


    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModTiers.TITANIUM, 0, 0.5f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(2500)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModTiers.TITANIUM, 0, 0.5f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(2500)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModTiers.TITANIUM, 3, 2f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(2500)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModTiers.TITANIUM, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModTiers.TITANIUM, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.NINJA_GEAR).durability(20500)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
