package me.tuxinet.Game.level.tile.spawn_level;

import me.tuxinet.Game.graphics.Screen;
import me.tuxinet.Game.graphics.Sprite;
import me.tuxinet.Game.level.tile.Tile;

public class SpawnGrassTile extends Tile {

	public SpawnGrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}


}
