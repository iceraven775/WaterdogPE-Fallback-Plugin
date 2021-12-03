package plugins.Fallback.handler;

import dev.waterdog.waterdogpe.network.serverinfo.ServerInfo;
import dev.waterdog.waterdogpe.player.ProxiedPlayer;
import dev.waterdog.waterdogpe.utils.types.IReconnectHandler;

public class FallbackHandler implements IReconnectHandler {

    @Override
    public ServerInfo getFallbackServer(ProxiedPlayer proxiedPlayer, ServerInfo serverInfo, String s) {
        for(ServerInfo i : proxiedPlayer.getProxy().getServers()){
            if(!i.getServerName().equals(serverInfo.getServerName())){
                return i;
            }
        }
        return null;
    }
}
