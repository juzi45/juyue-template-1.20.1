package name.juyue.content.register;

import name.juyue.JuYue;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class JuYueItems {
	// 改掉使用拼音的习惯！不然我不给你 pr 了！来自 KrLite
	public static final Item XUAN = registerItem("xuan");
	public static final Item BABOL_CRYSTAL = registerItem("babol_crystal");

	private static Item registerItem(String id, FabricItemSettings settings) {
		return Registry.register(
				Registries.ITEM,
				new Identifier(JuYue.MOD_ID, id),
				new Item(settings)
		);
	}

	private static Item registerItem(String id) {
		return registerItem(id, new FabricItemSettings());
	}

	public static void register() {
	}
}
