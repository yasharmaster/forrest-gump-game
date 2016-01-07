package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {
	
	Image playNow;
	Image exitGame;
	
	public Menu(int state){
			
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Welcome to Forrest !", 100, 50);
		playNow.draw(100, 100);
		exitGame.draw(100, 200);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		if((xpos > 100 && xpos < 311 ) && (ypos > 209 && ypos < 260)){
			if(Mouse.isButtonDown(0)){
				sbg.enterState(1);
			}
		}
		if((xpos > 100 && xpos < 311 ) && (ypos > 109 && ypos < 160)){
			if(Mouse.isButtonDown(0)){
				System.exit(0);
			}
		}
	}

	@Override
	public int getID() {
		return 0;
	}
	
	
	
}
