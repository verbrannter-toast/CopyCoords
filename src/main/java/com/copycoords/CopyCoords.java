package com.copycoords;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(CopyCoords.MODID)
public class CopyCoords {
    public static final String MODID = "copycoords";

    public CopyCoords(IEventBus modEventBus) {
        // Register client setup
        modEventBus.addListener(ClientSetup::init);
    }
}