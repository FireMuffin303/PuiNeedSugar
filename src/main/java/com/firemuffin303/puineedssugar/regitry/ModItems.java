package com.firemuffin303.puineedssugar.regitry;

import com.firemuffin303.puineedssugar.PuiNeedsSugar;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item PUI_SPAWN_EGG;

    public static void init(){
    }


     static  {
        PUI_SPAWN_EGG = Registry.register(Registry.ITEM,new Identifier(PuiNeedsSugar.MODID,"pui_spawn_egg"),new SpawnEggItem(ModEntity.PUI,1054854,4778754,(new FabricItemSettings().group(ItemGroup.MISC))));
    }



}
