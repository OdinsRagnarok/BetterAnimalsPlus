package its_meow.betteranimalsplus.client.renderer.entity;

import javax.annotation.Nonnull;

import its_meow.betteranimalsplus.client.model.ModelHirschgeistMain;
import its_meow.betteranimalsplus.common.entity.miniboss.hirschgeist.EntityHirschgeist;
import its_meow.betteranimalsplus.init.TextureRegistry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHirschgeist extends RenderLiving<EntityHirschgeist> {

	public RenderHirschgeist(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelHirschgeistMain(), 1F);
	}


	/**
	 * Allows the render to do state modifications necessary before the model is rendered.
	 */
	protected void preRenderCallback(EntityHirschgeist entitylivingbaseIn, float partialTickTime)
	{
		if(!entitylivingbaseIn.isDaytime()) {
			float scale = 2F;
			GlStateManager.scale(scale, scale, scale);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}


	public static final Factory FACTORY = new Factory();

	@Override
	public void doRender(EntityHirschgeist entity, double x, double y, double z, float f, float partialTicks) {	
		super.doRender(entity, x, y, z, f, partialTicks);
	}



	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityHirschgeist entity) {
		return TextureRegistry.hirschgeist;
	}

	public static class Factory implements IRenderFactory<EntityHirschgeist> {

		@Override
		public Render<? super EntityHirschgeist> createRenderFor(RenderManager manager) {
			return new RenderHirschgeist(manager);
		}

	}
}
