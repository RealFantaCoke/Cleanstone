package rocks.cleanstone.player.event;

import rocks.cleanstone.game.entity.HeadRotatablePosition;
import rocks.cleanstone.player.Player;

public class PlayerTeleportEvent extends PlayerMoveEvent {
    private final Player player;
    private final MoveReason moveReason;

    public PlayerTeleportEvent(Player player, HeadRotatablePosition oldPosition,
                               HeadRotatablePosition newPosition, MoveReason moveReason) {
        super(player, oldPosition, newPosition, moveReason);
        this.player = player;
        this.moveReason = moveReason;
    }

    public Player getPlayer() {
        return player;
    }

    public MoveReason getMoveReason() {
        return moveReason;
    }
}
