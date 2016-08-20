package proxy;

import items.BasicItem;
import mainpackage.MyFirstMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

/**
 * Created by Kriller on 20.08.2016.
 */
public class ClientProxy extends ServerProxy {

    @Override
    public void registerClient(){
        registerItemModel(MyFirstMod.reddiamond);
        registerItemModel(MyFirstMod.superCake);
    }

    public static void registerItemModel(BasicItem item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MyFirstMod.MODID + ":" + item.getRegistryName(), "inventory"));
    }

}
