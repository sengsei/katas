package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void shouldPlayGameWithOnePin() {
        Game game = new Game();
        game.addRoll(1);

        assertEquals(1, game.totalScore());

    }


}