package name.juyue.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static name.juyue.juyue.Mod_id;

public class juyue_items_registers {


    public static final Item xuan = RegisterItem(Mod_id, "xuan");

    public static Item RegisterItem(String namespace, String id) {
        return Registry.register(Registries.ITEM, new Identifier(namespace, id), new Item(new FabricItemSettings()));
    }

}
