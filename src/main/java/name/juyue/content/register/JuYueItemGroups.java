package name.juyue.content.register;

import name.juyue.JuYue;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class JuYueItemGroups {
	public static final ItemGroup GENERAL = registerItemGroup("general", JuYueBlocks.TEMPLATE_BLOCK.asItem().getDefaultStack());

	private static ItemGroup registerItemGroup(String id, ItemStack icon) {
		ItemGroup itemGroup =
				FabricItemGroup.builder()
						.icon(() -> icon)
						.displayName(Text.translatable("itemGroup." + JuYue.MOD_ID + "." + id))
						.build();

		return Registry.register(
				Registries.ITEM_GROUP,
				new Identifier(JuYue.MOD_ID, id),
				itemGroup
		);
	}

	public static void register() {
		Registries.ITEM_GROUP.getKey(GENERAL).ifPresent(
				registryKey -> ItemGroupEvents.modifyEntriesEvent(registryKey).register(content -> {
					content.add(JuYueBlocks.TEMPLATE_BLOCK);

					content.add(JuYueItems.XUAN);
					content.add(JuYueItems.BABOL_CRYSTAL);
				})
		);
	}
}
