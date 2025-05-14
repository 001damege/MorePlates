package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class DraconicEvolutionAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> AWAKENED_DRACONIUM_PLATE = item("awakened_draconic_plate").register();
    public static final ItemEntry<Item> AWAKENED_DRACONIC_GEAR = item("awakened_draconic_gear").register();
    public static final ItemEntry<Item> DRACONIUM_PLATE = item("draconium_plate").register();
    public static final ItemEntry<Item> DRACONIUM_GEAR = item("draconium_gear").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
