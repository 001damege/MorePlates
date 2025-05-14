package moreplates.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.ItemBuilder;
import moreplates.MorePlates;
import moreplates.registries.ModGroups;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class ProjectEAddon {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    private static ItemBuilder<Item, Registrate> item(String name) {
        return REGISTRATE.item(name, p -> new Item(new Item.Properties())).tab(ModGroups.MAIN);
    }

    public static void register() {}
}
