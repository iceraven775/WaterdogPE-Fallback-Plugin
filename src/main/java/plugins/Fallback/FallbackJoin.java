package plugins.Fallback;

import plugins.Fallback.handler.FallbackHandler;
import dev.waterdog.waterdogpe.plugin.Plugin;

public class FallbackJoin extends Plugin {

    @Override
    public void onEnable() {
        this.getProxy().setReconnectHandler(new FallbackHandler());
    }
}
