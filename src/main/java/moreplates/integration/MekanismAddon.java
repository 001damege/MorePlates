package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class MekanismAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> OSMIUM_PLATE = item("osmium_plate").register();
    public static final ItemEntry<Item> OSMIUM_GEAR = item("osmium_gear").register();
    public static final ItemEntry<Item> REFINED_GLOWSTONE_PLATE = item("refined_glowstone_plate").register();
    public static final ItemEntry<Item> REFINED_GLOWSTONE_GEAR = item("refined_glowstone_gear").register();
    public static final ItemEntry<Item> REFINED_OBSIDIAN_PLATE = item("refined_obsidian_plate").register();
    public static final ItemEntry<Item> REFINED_OBSIDIAN_GEAR = item("refined_obsidian_gear").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
