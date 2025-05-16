package moreplates.registries;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class ModItems {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> COAL_PLATE = item("coal_plate").register();
    public static final ItemEntry<Item> DIAMOND_PLATE = item("diamond_plate").register();
    public static final ItemEntry<Item> EMERALD_PLATE = item("emerald_plate").register();
    public static final ItemEntry<Item> GLOWSTONE_PLATE = item("glowstone_plate").register();
    public static final ItemEntry<Item> GOLD_PLATE = item("gold_plate").register();
    public static final ItemEntry<Item> IRON_PLATE = item("iron_plate").register();
    public static final ItemEntry<Item> LAPIS_PLATE = item("lapis_plate").register();
    public static final ItemEntry<Item> QUARTZ_PLATE = item("nether_quartz_plate").register();
    public static final ItemEntry<Item> REDSTONE_PLATE = item("redstone_plate").register();
    public static final ItemEntry<Item> AMETHYST_PLATE = item("amethyst_plate").register();
    public static final ItemEntry<Item> NETHERITE_PLATE = item("netherite_plate").register();
    public static final ItemEntry<Item> STAR_PLATE = item("nether_star_plate").register();


    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
