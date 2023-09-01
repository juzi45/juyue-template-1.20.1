package name.juyue.content;

import name.juyue.JuYue;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class JuYueItems {
	public static final String Item="item"; String Tool="tools";

	public static final Item XUAN = RegisterItem(Item, "xuan");
	public static final Item JINGSHI = RegisterItem(Item, "baboljinsi");
	public static Item RegisterItem(String namespace, String id) {
		return Registry.register(Registries.ITEM, new Identifier(namespace, id), new Item(new FabricItemSettings()));
	}
	public static void RegisterItem(){
		JuYue.LOGGER.debug("Loading for Items of"+JuYue.MOD_ID,"Mod");
}}
