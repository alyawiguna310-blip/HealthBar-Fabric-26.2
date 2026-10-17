package dev.vro.healthbar.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// NOTE: Minecraft 26.2 changed rendering internals compared with older versions.
// This injection is intentionally isolated so its target/signature can be adjusted
// against the exact 26.2 client sources if needed.
@Mixin(targets = "net.minecraft.client.renderer.entity.EntityRenderer")
public abstract class HealthBarRendererMixin {
    /*
     * The actual bar renderer must run where the living entity's render state and
     * pose/buffer objects are available. The exact 26.2 method signature must be
     * confirmed against the game sources before enabling this injection.
     *
     * Kept as a source scaffold rather than guessing a signature that could crash
     * the game at startup. See README.md for the next implementation step.
     */
}
