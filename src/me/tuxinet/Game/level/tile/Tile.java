package me.tuxinet.Game.level.tile;

import me.tuxinet.Game.graphics.Screen;
import me.tuxinet.Game.graphics.Sprite;
import me.tuxinet.Game.level.tile.spawn_level.SpawnFloorTile;
import me.tuxinet.Game.level.tile.spawn_level.SpawnGrassTile;
import me.tuxinet.Game.level.tile.spawn_level.SpawnHedgeTile;
import me.tuxinet.Game.level.tile.spawn_level.SpawnWallTile;
import me.tuxinet.Game.level.tile.spawn_level.SpawnWaterTile;

public class Tile {

	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile spawn_wall = new SpawnWallTile(Sprite.spawn_wall);
	public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);
	
	public static final int col_spawn_grass = 0xff00ff00;
	public static final int col_spawn_hedge = 0; // Unused
	public static final int col_spawn_water = 0xff0000ff;
	public static final int col_spawn_wall = 0xff808080;
	public static final int col_spawn_floor = 0xff7F4E28;

	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {
	}
	
	public boolean solid() {
		return false;
	}

}
