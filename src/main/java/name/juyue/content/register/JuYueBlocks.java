package name.juyue.content.register;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import name.juyue.JuYue;

public class JuYueBlocks {
    public static Block TEMPLATE_BLOCK = registerBlock("template_block");

    public static Block registerBlock(String id, FabricBlockSettings settings){
        return Registry.register(
                Registries.BLOCK,
                new Identifier(JuYue.MOD_ID, id),
                new Block(settings)
        );
    }

    public static Block registerBlock(String id) {
        return registerBlock(id, FabricBlockSettings.create());
    }
}
