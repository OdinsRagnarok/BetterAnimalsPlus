package its_meow.betteranimalsplus.common.block;

import its_meow.betteranimalsplus.common.tileentity.TileEntityDeerHead;
import its_meow.betteranimalsplus.init.ItemRegistry;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDeerHead extends BlockAnimalSkull implements ITileEntityProvider {

	public BlockDeerHead() {
		super();
		this.setRegistryName("deerhead");
		this.setUnlocalizedName("deerhead");
	}


	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityDeerHead();
	}

	@Override
	public ItemBlock getItemBlock() {
		return ItemRegistry.itemDeerHead;
	}

}
