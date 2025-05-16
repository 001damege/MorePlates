package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class ActuallyAdditionsAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> RESTONIA_PLATE = item("restonia_crystal_plate").register();
    public static final ItemEntry<Item> RESTONIA_GEAR = item("restonia_crystal_gear").register();
    public static final ItemEntry<Item> PALIS_PLATE = item("palis_crystal_plate").register();
    public static final ItemEntry<Item> PALIS_GEAR = item("palis_crystal_gear").register();
    public static final ItemEntry<Item> DIAMATINE_PLATE = item("diamatine_crystal_plate").register();
    public static final ItemEntry<Item> DIAMATINE_GEAR = item("diamatine_crystal_gear").register();
    public static final ItemEntry<Item> VOID_PLATE = item("void_crystal_plate").register();
    public static final ItemEntry<Item> VOID_GEAR = item("void_crystal_gear").register();
    public static final ItemEntry<Item> EMERADIC_PLATE = item("emeradic_plate").register();
    public static final ItemEntry<Item> EMERADIC_GEAR = item("emeradic_gear").register();
    public static final ItemEntry<Item> ENORI_PLATE = item("enori_crystal_plate").register();
    public static final ItemEntry<Item> ENORI_GEAR = item("enori_crystal_gear").register();
    public static final ItemEntry<Item> EMPOWERED_RESTONIA_PLATE = item("empowered_restonia_plate").register();
    public static final ItemEntry<Item> EMPOWERED_RESTONIA_GEAR = item("empowered_restonia_gear").register();
    public static final ItemEntry<Item> EMPOWERED_PALIS_PLATE = item("empowered_palis_plate").register();
    public static final ItemEntry<Item> EMPOWERED_PALIS_GEAR = item("empowered_palis_gear").register();
    public static final ItemEntry<Item> EMPOWERED_DIAMATINE_PLATE = item("empowered_diamatine_plate").register();
    public static final ItemEntry<Item> EMPOWERED_DIAMATINE_GEAR = item("empowered_diamatine_gear").register();
    public static final ItemEntry<Item> EMPOWERED_VOID_PLATE = item("empowered_void_plate").register();
    public static final ItemEntry<Item> EMPOWERED_VOID_GEAR = item("empowered_void_gear").register();
    public static final ItemEntry<Item> EMPOWERED_EMERADIC_PLATE = item("empowered_emeradic_plate").register();
    public static final ItemEntry<Item> EMPOWERED_EMERADIC_GEAR = item("empowered_emeradic_gear").register();
    public static final ItemEntry<Item> EMPOWERED_ENORI_PLATE = item("empowered_enori_plate").register();
    public static final ItemEntry<Item> EMPOWERED_ENORI_GEAR = item("empowered_enori_gear").register();
    public static final ItemEntry<Item> BLACK_QUARTZ_PLATE = item("black_quartz_plate").register();
    public static final ItemEntry<Item> BLACK_QUARTZ_GEAR = item("black_quartz_gear").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
