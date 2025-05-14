package moreplates.util;

public enum Addons {
    Mekanism("mekanism"),
    Avaritia("avaritia"),
    Actually("actuallyadditions"),
    AE2("ae2"),
    Botania("botania"),
    DE("draconicevolution"),
    EIO("enderio"),
    Mystical("mysticalagriculture"),
    PNC("pneumaticcraft"),
    ProE("projecte"),
    RefinedStorage("refinedstorage");

    private final String modId;

    Addons(String modId) {
        this.modId = modId;
    }

    public String getModId() {
        return modId;
    }
}
