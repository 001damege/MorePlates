package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class AppliedEnergistics2Addon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ItemEntry<Item> CERTUS_PLATE = item("certus_quartz_plate").register();
    public static final ItemEntry<Item> CHARGED_CERTUS_PLATE = item("charged_certus_quartz_plate").register();
    public static final ItemEntry<Item> SILICON_PLATE = item("silicon_plate").register();
    public static final ItemEntry<Item> FLUIX_PLATE = item("fluix_crystal_plate").register();
    public static final ItemEntry<Item> SINGULARITY_PLATE = item("singularity_plate").register();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
