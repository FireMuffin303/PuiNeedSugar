package com.firemuffin303.puineedssugar;

import com.firemuffin303.puineedssugar.regitry.ModEntity;
import com.firemuffin303.puineedssugar.regitry.ModItems;
import net.fabricmc.api.ModInitializer;

public class PuiNeedsSugar implements ModInitializer {
    public static final String MODID = "pui";

    @Override
    public void onInitialize() {
        ModEntity.init();
        ModItems.init();
    }
}
