package net.soheil.shaking_of_spirits.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_COMBAT = "key.category.shaking_of_spirits.combat";
    public static final String KEY_SPAWN_BLACK_HOLE = "key.shaking_of_spirits.spawn_black_hole";

    public static final KeyMapping BLACK_HOLE_KEY = new KeyMapping(KEY_SPAWN_BLACK_HOLE, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_COMBAT);
}
