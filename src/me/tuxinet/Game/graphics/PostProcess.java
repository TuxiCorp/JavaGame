package me.tuxinet.Game.graphics;

import java.util.Random;

public class PostProcess {
	
	private static final Random random = new Random();
	private int noise = 0;
	
	public PostProcess(int noise) {
		this.noise = noise;
	}
	
	public void render(Screen screen) {
		for (int i = 0; i < noise; i++) {
			int r= random.nextInt(screen.pixels.length);
			int r2 = random.nextInt(0xffffff);
			screen.pixels[r] = r2;			
		}
	}
	
	
}
