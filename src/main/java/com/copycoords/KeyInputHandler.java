package com.copycoords;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = CopyCoords.MODID, value = Dist.CLIENT)
public class KeyInputHandler {

    @SubscribeEvent
    public static void onKeyInput(ClientTickEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();

        // Check if the key was pressed
        if (KeyBindings.COPY_COORDS.consumeClick()) {
            Player player = mc.player;

            if (player != null) {
                // Get coordinates
                int x = (int) player.getX();
                int y = (int) player.getY();
                int z = (int) player.getZ();

                // Format coordinates
                String coords = String.format("%d %d %d", x, y, z);

                // Copy to clipboard
                mc.keyboardHandler.setClipboard(coords);

                // Show message to player
                player.displayClientMessage(
                        Component.literal("§aCoordinates copied: §f" + coords),
                        true  // Show as action bar (above hotbar)
                );
            }
        }
    }
}