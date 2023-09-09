package name.juyue.content.register;

import name.juyue.JuYue;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class JuYueItems {
	public static final Item TEMPLATE_ITEM = registerItem("template_item");

	// 改掉使用拼音的习惯！不然我不给你 pr 了！来自 KrLite
	public static final Item XUAN = registerItem("xuan");
	public static final Item BABOL_CRYSTAL = registerItem("babol_crystal");

	public static Item registerItem(String id, FabricItemSettings settings) {
		return Registry.register(
				Registries.ITEM,
				new Identifier(JuYue.MOD_ID, id),
				new Item(settings)
		);
	}

	public static Item registerItem(String id) {
		return registerItem(id, new FabricItemSettings());
	}

	public static void registerItems() {
		JuYue.LOGGER.debug("Registering items for mod " + JuYue.MOD_ID, ".");
	}
}
