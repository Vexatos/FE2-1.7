package forestry.api.farming;

import java.util.Collection;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraftforge.common.util.ForgeDirection;

public interface IFarmLogic {

	int getFertilizerConsumption();

	int getWaterConsumption(float hydrationModifier);

	boolean isAcceptedResource(ItemStack itemstack);

	boolean isAcceptedGermling(ItemStack itemstack);

	Collection<ItemStack> collect();

	boolean cultivate(int x, int y, int z, ForgeDirection direction, int extent);

	Collection<ICrop> harvest(int x, int y, int z, ForgeDirection direction, int extent);

	@SideOnly(Side.CLIENT)
	IIcon getIcon();

	ResourceLocation getSpriteSheet();
	
	String getName();
}