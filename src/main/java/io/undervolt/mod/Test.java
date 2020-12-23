package io.undervolt.mod;

import io.undervolt.api.event.events.RenderGameOverlayEvent;
import io.undervolt.api.event.events.TickEvent;
import io.undervolt.api.event.handler.EventHandler;
import io.undervolt.bridge.GameBridge;
import io.undervolt.utils.config.Configurable;

public class Test extends Configurable {
    public Test() {
        super("peko");
    }

    @EventHandler
    public void onTick(TickEvent.ClientTickEvent client){
        System.out.println("TICK");
    }

    @EventHandler
    public void onTick(TickEvent.RenderTickEvent client){
        System.out.println("RENDER");
    }

    @EventHandler
    public void onTick(RenderGameOverlayEvent client){
        this.drawCenteredString(GameBridge.getFontRenderer(), "PEKOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!", 10, 10, -1);
    }
}
