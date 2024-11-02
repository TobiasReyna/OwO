package flappy.bird.game;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import flappy.bird.MainFlappyBird;
import flappy.bird.screens.Screens;

public class GameScreen extends Screens {
    static final int STATE_READY = 0;
    static final int STATE_RUNNING = 0;
    static final int STATE_GAME_OVER = 0;
    int state;

    Image getReady, tap, gameOver;

    public GameScreen(MainFlappyBird game){
        super(game);
        state = STATE_READY;


    }

    @Override
    public void draw(float delta) {

    }

    @Override
    public void update(float delta) {

    }
}
