package name.juyue.content.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ItemConvertible;

public class Fuels {
    public static void registerFuels(ItemConvertible item, int burnTime) {
        FuelRegistry.INSTANCE.add(item, burnTime);
    }
}
