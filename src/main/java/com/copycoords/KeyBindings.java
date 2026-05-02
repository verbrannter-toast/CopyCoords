package com.copycoords;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final KeyMapping COPY_COORDS = new KeyMapping(
            "key.copycoords.copy",  // Translation key
            KeyConflictContext.IN_GAME,  // Only works in-game
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_V,  // Default key: V
            "key.categories.copycoords"  // Category in controls menu
    );
}