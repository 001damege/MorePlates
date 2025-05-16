package moreplates;

import com.tterrag.registrate.Registrate;
import moreplates.integration.*;
import moreplates.registries.ModGroups;
import moreplates.registries.ModItems;
import moreplates.util.Addons;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MorePlates.MODID)
public class MorePlates {
    public static final String MODID = "moreplates";
    private static final Lazy<Registrate> REGISTRATE = Lazy.of(() -> Registrate.create(MODID));

    public MorePlates() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModGroups.register();
        ModItems.register();

        if (ModList.get().isLoaded(Addons.Avaritia.getModId())) {
            AvaritiaAddon.register();
        }
        if (ModList.get().isLoaded(Addons.Actually.getModId())) {
            ActuallyAdditionsAddon.register();
        }
        if (ModList.get().isLoaded(Addons.AE2.getModId())) {
            AppliedEnergistics2Addon.register();
        }
    }

    public static ResourceLocation rl(String path) {
        return new ResourceLocation(MODID, path);
    }

    public static Registrate registrate() {
        return REGISTRATE.get();
    }
}
