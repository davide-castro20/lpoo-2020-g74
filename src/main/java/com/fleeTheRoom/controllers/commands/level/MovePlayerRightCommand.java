package com.fleeTheRoom.controllers.commands.level;

import com.fleeTheRoom.controllers.commands.Command;
import com.fleeTheRoom.models.level.Level;
import com.fleeTheRoom.models.Position;

public class MovePlayerRightCommand implements Command {
    private final Level level;

    public MovePlayerRightCommand(Level level) {
        this.level = level;
    }

    @Override
    public void execute() {
        Position position = level.getPlayerPos().right();
        level.movePlayerTo(position);
    }
}
