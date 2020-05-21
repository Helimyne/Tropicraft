package net.tropicraft.core.client.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.tropicraft.core.client.TropicraftRenderUtils;
import net.tropicraft.core.client.entity.model.SharkModel;
import net.tropicraft.core.common.entity.underdasea.SharkEntity;

import javax.annotation.Nullable;

public class SharkRenderer extends MobRenderer<SharkEntity, SharkModel> {

    public static final ResourceLocation BASIC_SHARK_TEXTURE = TropicraftRenderUtils.getTextureEntity("shark/hammerhead1");
    public static final ResourceLocation BOSS_SHARK_TEXTURE = TropicraftRenderUtils.getTextureEntity("shark/hammerhead4");

    public SharkRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SharkModel(), 1);
    }

    @Override
    public ResourceLocation getEntityTexture(SharkEntity sharkEntity) {
        if (sharkEntity.isBoss()) {
            return BOSS_SHARK_TEXTURE;
        }
        return BASIC_SHARK_TEXTURE;
    }

    @Override
    protected void preRenderCallback(SharkEntity shark, final MatrixStack stack, float partialTickTime) {
        float scale = 1f;
        if (shark.isBoss()) {
            scale = 1.5f;
            stack.translate(0, 0.3f, 0);
        }

        stack.scale(scale, scale, scale);
    }
}
