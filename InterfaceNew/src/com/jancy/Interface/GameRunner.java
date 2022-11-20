package com.jancy.Interface;

public class GameRunner {
	
	public static void main(String args[]) {
		//GamingConsole game=new ChessGame();
		//GamingConsole game=new MarioGame();
		
		GamingConsole[] games= {new  MarioGame(), new ChessGame()};
		for(GamingConsole game:games) {
		game.up();
		game.down();
		game.left();
		game.right();
		}
		
	}

}
