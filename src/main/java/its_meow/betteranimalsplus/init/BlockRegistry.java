package its_meow.betteranimalsplus.init;

import java.util.HashMap;
import java.util.function.Supplier;

import com.google.common.base.Preconditions;

import its_meow.betteranimalsplus.BetterAnimalsPlusMod;
import its_meow.betteranimalsplus.Ref;
import its_meow.betteranimalsplus.common.block.BlockGenericSkull;
import its_meow.betteranimalsplus.common.block.BlockHandOfFate;
import its_meow.betteranimalsplus.common.block.BlockHirschgeistSkull;
import its_meow.betteranimalsplus.common.block.BlockTrillium;
import its_meow.betteranimalsplus.common.item.ItemBlockSkull;
import its_meow.betteranimalsplus.common.tileentity.TileEntityBoarHead;
import its_meow.betteranimalsplus.common.tileentity.TileEntityDeerHead;
import its_meow.betteranimalsplus.common.tileentity.TileEntityFoxHead;
import its_meow.betteranimalsplus.common.tileentity.TileEntityHandOfFate;
import its_meow.betteranimalsplus.common.tileentity.TileEntityHirschgeistSkull;
import its_meow.betteranimalsplus.common.tileentity.TileEntityReindeerHead;
import its_meow.betteranimalsplus.common.tileentity.TileEntityTrillium;
import its_meow.betteranimalsplus.common.tileentity.TileEntityWolfHead;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(its_meow.betteranimalsplus.Ref.MOD_ID)
public class BlockRegistry {

	public static final BlockTrillium trillium = new BlockTrillium();
	public static final BlockHirschgeistSkull hirschgeistskull = new BlockHirschgeistSkull();
	public static final BlockHandOfFate handoffate = new BlockHandOfFate();

	// Generic Skulls
	public static final BlockGenericSkull deerhead = new BlockGenericSkull(TileEntityDeerHead.class, "deerhead", false, 2, TileEntityDeerHead::new);
	public static final BlockGenericSkull wolfhead = new BlockGenericSkull(TileEntityWolfHead.class, "wolfhead", true, 4, TileEntityWolfHead::new);
	public static final BlockGenericSkull reindeerhead = new BlockGenericSkull(TileEntityReindeerHead.class, "reindeerhead", false, 4, TileEntityReindeerHead::new);
	public static final BlockGenericSkull foxhead = new BlockGenericSkull(TileEntityFoxHead.class, "foxhead", true, 4, TileEntityFoxHead::new);
	public static final BlockGenericSkull boarhead = new BlockGenericSkull(TileEntityBoarHead.class, "boarhead", false, 4, TileEntityBoarHead::new);

	public static HashMap<BlockGenericSkull, HashMap<Integer, ItemBlockSkull>> genericskulls = new HashMap<BlockGenericSkull, HashMap<Integer, ItemBlockSkull>>();
	public static HashMap<Class<? extends TileEntity>, TileEntityType<?>> types = new HashMap<Class<? extends TileEntity>, TileEntityType<?>>();
	
	public static void addGenericSkull(BlockGenericSkull block) {
		genericskulls.put(block, new HashMap<Integer, ItemBlockSkull>());
		for(int i = 1; i <= block.texCount; i++) {
			genericskulls.get(block).put(i, new ItemBlockSkull(block, block.allowFloor, i));
		}
	}

	public static ItemBlockSkull getSkullItemForBlock(BlockGenericSkull block, int texID) {
		return genericskulls.get(block).get(texID);
	}

	@Mod.EventBusSubscriber(modid = Ref.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistrationHandler {

		/**
		 * Register this mod's {@link Block}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();

			BlockRegistry.addGenericSkull(BlockRegistry.deerhead);
			BlockRegistry.addGenericSkull(BlockRegistry.wolfhead);
			BlockRegistry.addGenericSkull(BlockRegistry.reindeerhead);
			BlockRegistry.addGenericSkull(BlockRegistry.foxhead);
			BlockRegistry.addGenericSkull(BlockRegistry.boarhead);

			final Block[] blocks = {
					trillium,
					hirschgeistskull,
					handoffate,
			};

			registry.registerAll(blocks);

			genericskulls.keySet().forEach(b -> registry.register(b));
		}


		/**
		 * Register this mod's {@link ItemBlock}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
			final ItemBlock[] items = {
					new ItemBlock(trillium, new Properties().group(BetterAnimalsPlusMod.group)),
					hirschgeistskull.getItemBlock(),
					BlockHandOfFate.getItemBlock(),
			};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final ItemBlock item : items) {
				Block block = item.getBlock();
				ResourceLocation loc = item.getRegistryName();
				if(item.getRegistryName() == null) {
					loc = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
					item.setRegistryName(loc);
				}
				registry.register(item);
			}

			for(BlockGenericSkull block : genericskulls.keySet()) {
				for(ItemBlockSkull skull : genericskulls.get(block).values()) {
					Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
					registry.register(skull);
				}
			}
		}

		@SubscribeEvent
		public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event) {
			final IForgeRegistry<TileEntityType<?>> reg = event.getRegistry();
			reg.register(TileEntityTrillium.TRILLIUM_TYPE);
			reg.register(TileEntityHandOfFate.HAND_OF_FATE_TYPE);
			reg.register(TileEntityHirschgeistSkull.HIRSCHGEIST_SKULL_TYPE);

			for(BlockGenericSkull block : genericskulls.keySet()) {
				reg(reg, block.teSupplier, block, block.teClass);
			}
		}

		private static void reg(IForgeRegistry<TileEntityType<?>> reg, Supplier<? extends TileEntity> factory, BlockGenericSkull block, Class<? extends TileEntity> teClass) {
			TileEntityType<?> type = TileEntityType.Builder.create(factory).build(null).setRegistryName(Ref.MOD_ID, block.getRegistryName().getPath() + "tileentity");
			reg.register(type);
			types.put(teClass, type);
		}

	}

	public static int getTypeForItem(ResourceLocation registryName) {
		return Integer.valueOf(registryName.getPath().substring(registryName.getPath().lastIndexOf('_') + 1, registryName.getPath().length()));
	}

	public static TileEntityType<?> getTileEntityType(Class<? extends TileEntity> type) {
		return types.get(type);
	}
	
}
