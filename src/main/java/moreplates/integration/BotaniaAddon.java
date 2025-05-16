package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class BotaniaAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> STEEL_PLATE = item("manasteel_plate").register();
    public static final ItemEntry<Item> TERRA_PLATE = item("terrasteel_plate").register();
    public static final ItemEntry<Item> ELEMENTIUM_PLATE = item("elementium_plate").register();
    public static final ItemEntry<Item> GAIA_PLATE = item("gaia_plate").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
