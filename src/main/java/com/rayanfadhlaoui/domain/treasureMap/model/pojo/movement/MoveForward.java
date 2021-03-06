package com.rayanfadhlaoui.domain.treasureMap.model.pojo.movement;

import com.rayanfadhlaoui.domain.treasureMap.model.pojo.Position;
import com.rayanfadhlaoui.domain.treasureMap.model.pojo.direction.Direction;

public class MoveForward extends Movement {

	@Override
	public void move(Direction direction) {
		Position position = direction.move();
		this.direction = direction;
		this.x = position.getX();
		this.y = position.getY();
	}
	
	
}
