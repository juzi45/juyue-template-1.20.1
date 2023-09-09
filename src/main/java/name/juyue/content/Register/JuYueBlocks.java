package name.juyue.content.Register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import name.juyue.JuYue;

public class JuYueBlocks {

    public static Block RegisterBlocks(String id,String b){
        return Registry.register(Registries.BLOCK,new Identifier(JuYue.MOD_ID,id),new Block(new FabricBlockSettings()));
    }
}
