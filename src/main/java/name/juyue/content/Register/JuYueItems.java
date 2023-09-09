package name.juyue.content.Register;

import name.juyue.JuYue;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class JuYueItems {

	public static final Item XUAN = RegisterItem("xuan");
	public static final Item JINGSHI = RegisterItem("baboljinsi");
	public static Item RegisterItem(String id) {
		return Registry.register(Registries.ITEM, new Identifier(JuYue.MOD_ID, id), new Item(new FabricItemSettings()));
	}
	public static void RegisterItem(){
		JuYue.LOGGER.debug("Loading for Items of"+JuYue.MOD_ID,"Mod");
}}
