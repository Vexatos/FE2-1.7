package forestryextras.main.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Tabs {
    public static CreativeTabs tabMain = new CreativeTabs("tabForestryExtras") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return FEItems.draconicIngot;}};  
               
}
