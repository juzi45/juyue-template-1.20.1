package name.juyue.content;

import name.juyue.JuYue;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class JuYueItems {
	public static final Item XUAN = RegisterItem(JuYue.MOD_ID, "xuan");

	public static Item RegisterItem(String namespace, String id) {
		return Registry.register(Registries.ITEM, new Identifier(namespace, id), new Item(new FabricItemSettings()));
	}
}