package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unsued")
public class EnderIOAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> CONDUCTIVE_IRON_PLATE = item("conductive_iron_plate").register();
    public static final ItemEntry<Item> CONDUCTIVE_IRON_GEAR = item("conductive_iron_gear").register();
    public static final ItemEntry<Item> CONSTRUCTION_ALLOY_PLATE = item("construction_alloy_plate").register();
    public static final ItemEntry<Item> CONSTRUCTION_ALLOT_GEAR = item("construction_alloy_gear").register();
    public static final ItemEntry<Item> DARK_STEEL_PLATE = item("dark_steel_plate").register();
    public static final ItemEntry<Item> DARK_STEEL_GEAR = item("dark_steel_gear").register();
    public static final ItemEntry<Item> ELECTRIC_STEEL_PLATE = item("electric_steel_plate").register();
    public static final ItemEntry<Item> ELECTRIC_STEEL_GEAR = item("electric_steel_gear").register();
    public static final ItemEntry<Item> END_STEEL_PLATE = item("end_steel_plate").register();
    public static final ItemEntry<Item> END_STEEL_GEAR = item("end_steel_gear").register();
    public static final ItemEntry<Item> ENERGETIC_ALLOY_PLATE = item("energetic_alloy_plate").register();
    public static final ItemEntry<Item> ENERGETIC_ALLOY_GEAR = item("energetic_alloy_gear").register();
    public static final ItemEntry<Item> PULSATING_IRON_PLATE = item("pulsating_iron_plate").register();
    public static final ItemEntry<Item> PULSATING_IRON_GEAR = item("pulsating_iron_gear").register();
    public static final ItemEntry<Item> REDSTONE_ALLOY_PLATE = item("redstone_alloy_plate").register();
    public static final ItemEntry<Item> REDSTONE_ALLOY_GEAR = item("redstone_alloy_gear").register();
    public static final ItemEntry<Item> SOULARIUM_PLATE = item("soularium_plate").register();
    public static final ItemEntry<Item> SOULARIUM_GEAR = item("soularium_gear").register();
    public static final ItemEntry<Item> VIBRANT_ALLOY_PLATE = item("vibrant_alloy_plate").register();
    public static final ItemEntry<Item> VIBRANT_ALLOY_GEAR = item("vibrant_alloy_gear").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
