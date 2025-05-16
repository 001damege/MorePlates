package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import committee.nova.mods.avaritia.init.registry.ModRarities;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

@SuppressWarnings("unused")
public class AvaritiaAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> CRYSTAL_MATRIX_PLATE = crystal("crystal_matrix_plate").register();
    public static final ItemEntry<Item> CRYSTAL_MATRIX_GEAR = crystal("crystal_matrix_gear").register();
    public static final ItemEntry<Item> NEUTRON_PLATE = neutron("neutron_plate").register();
    public static final ItemEntry<Item> NEUTRON_GEAR = neutron("neutron_gear").register();
    public static final ItemEntry<Item> BLAZE_PLATE = blaze("blaze_plate").register();
    public static final ItemEntry<Item> BLAZE_GEAR = blaze("blaze_gear").register();
    public static final ItemEntry<Item> INFINITY_PLATE = infinity("infinity_plate").register();
    public static final ItemEntry<Item> INFINITY_GEAR = infinity("infinity_gear").register();

    private static ItemBuilder<Item, Registrate> crystal(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties().rarity(Rarity.RARE))).tab(ModGroups.MAIN);
    }

    private static ItemBuilder<Item, Registrate> neutron(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties().rarity(Rarity.EPIC))).tab(ModGroups.MAIN);
    }

    private static ItemBuilder<Item, Registrate> blaze(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties().rarity(ModRarities.LEGEND))).tab(ModGroups.MAIN);
    }

    private static ItemBuilder<Item, Registrate> infinity(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties().rarity(ModRarities.COSMIC))).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
