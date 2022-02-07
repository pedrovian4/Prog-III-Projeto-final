package GameState;

public class GameStateManager {
	
	private GameState[] gameStates;
	private int currentState;
	
	public static final int NUMGAMESTATES = 2;
	public static final int MENUSTATE = 0;
	public static final int LEVEL1STATE = 1;
	
	public GameStateManager() {
		
		gameStates = new GameState[NUMGAMESTATES];
		
		currentState = MENUSTATE;
		loadState(currentState);
		
	}
	//carregar o proximo estado do jogo
	private void loadState(int state) {
		if(state == MENUSTATE)
			gameStates[state] = new MenuState(this);
		if(state == LEVEL1STATE)
			gameStates[state] = new Level1State(this);
	}
	


	private void unloadState(int state) {
		gameStates[state] = null;
	}
	
	public void setState(int state) {
		unloadState(currentState);
		currentState = state;
		loadState(currentState);
	}
	

	//atualização para o proximo estagio 
	public void update() {
		try {
			gameStates[currentState].update();
		} catch(Exception e) {}
	}
	

	//renderizar os estados na tela
	public void draw(java.awt.Graphics2D g) {
		try {
			gameStates[currentState].draw(g);
		} catch(Exception e) {}
	}
	

	//pegar a tecla pressionada
	public void keyPressed(int k) {
		gameStates[currentState].keyPressed(k);
	}
	//pegar tecla solta
	public void keyReleased(int k) {
		gameStates[currentState].keyReleased(k);
	}
	
}









