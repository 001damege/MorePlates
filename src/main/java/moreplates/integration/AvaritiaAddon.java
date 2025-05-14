package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class AvaritiaAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> CRYSTAL_MATRIX_PLATE = item("crystal_matrix_plate").register();
    public static final ItemEntry<Item> CRYSTAL_MATRIX_GEAR = item("crystal_matrix_gear").register();
    public static final ItemEntry<Item> NEUTRONIUM_PLATE = item("neutronium_plate").register();
    public static final ItemEntry<Item> NEUTRONIUM_GEAR = item("neutronium_gear").register();
    public static final ItemEntry<Item> INFINITY_PLATE = item("infinity_plate").register();
    public static final ItemEntry<Item> INFINITY_GEAR = item("infinity_gear").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
