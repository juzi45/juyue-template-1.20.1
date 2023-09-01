package name.juyue;

import name.juyue.content.JuYueItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JuYue implements ModInitializer {
    public static final String MOD_ID = "juyue", NAME = "Ju Yue";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {JuYueItems.RegisterItem();
    }
}
