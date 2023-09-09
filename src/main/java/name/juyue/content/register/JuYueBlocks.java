package name.juyue.content.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import name.juyue.JuYue;

public class JuYueBlocks {
    public static Block TEMPLATE_BLOCK = registerBlock("template_block");

    private static Block registerBlock(String id, FabricBlockSettings settings){
        Block block = Registry.register(
                Registries.BLOCK,
                new Identifier(JuYue.MOD_ID, id),
                new Block(settings)
        );

        Registry.register(
                Registries.ITEM,
                new Identifier(JuYue.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings())
        );

        return block;
    }

    private static Block registerBlock(String id) {
        return registerBlock(id, FabricBlockSettings.create());
    }

    public static void register() {
    }
}
