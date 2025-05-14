package moreplates.registries;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import moreplates.MorePlates;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid = MorePlates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModGroups {
    private static final Registrate REGISTRATE = MorePlates.registrate();

    public static final ResourceKey<CreativeModeTab> MAIN = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MorePlates.MODID, "tab"));

    public static final RegistryEntry<CreativeModeTab> MAIN_TAB =
            create(MAIN, "tab", "MorePlates", tab -> tab.icon(() -> new ItemStack(Items.ACACIA_BUTTON.asItem())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS));

    private static RegistryEntry<CreativeModeTab> create(ResourceKey<CreativeModeTab> key, String name, String english, Consumer<CreativeModeTab.Builder> consumer) {
        return REGISTRATE.generic(name, Registries.CREATIVE_MODE_TAB, () -> {
            var builder = CreativeModeTab.builder().title(REGISTRATE.addLang("itemGroup", key.location(), english));
            consumer.accept(builder);
            return builder.build();
        }).register();
    }

    public static void register() {}
}
