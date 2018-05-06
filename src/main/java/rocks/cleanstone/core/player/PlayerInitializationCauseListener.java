package rocks.cleanstone.core.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;

import rocks.cleanstone.core.CleanstoneServer;
import rocks.cleanstone.core.player.event.AsyncPlayerLoginEvent;
import rocks.cleanstone.net.Connection;
import rocks.cleanstone.net.minecraft.login.event.AsyncLoginSuccessEvent;
import rocks.cleanstone.net.minecraft.packet.outbound.DisconnectPacket;

public class PlayerInitializationCauseListener {

    private final PlayerManager playerManager;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public PlayerInitializationCauseListener(PlayerManager playerManager) {
        this.playerManager = playerManager;
    }

    @EventListener
    public void onPlayerLoginSuccess(AsyncLoginSuccessEvent loginEvent) {
        Connection connection = loginEvent.getConnection();
        PlayerID playerID = playerManager.getPlayerID(loginEvent.getUUID());
        AsyncPlayerLoginEvent playerEvent = CleanstoneServer.publishEvent(
                new AsyncPlayerLoginEvent(connection, playerID));
        if (playerEvent.isCancelled()) {
            connection.close(new DisconnectPacket(playerEvent.getKickReason()));
            return;
        }
        OnlinePlayer player = new OnlinePlayer(playerID, connection);
        playerManager.initializePlayer(player);
    }
}