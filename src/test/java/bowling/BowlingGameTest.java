package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BowlingGameTest {

    private BowlingGame game;
    private int standardRolls = 20;

    @BeforeEach
    public void setup() {
        game = new BowlingGame();
    }

    @Test
    public void mustNotBeNullTest() {
        //arrange
        //act
        //assert
        assertNotNull(game);
    }

    @Test
    public void scoreMustBeZeroWhenZeroPinsHaveBeenHit() {
        //arrange
        //act
        rollMany(standardRolls, 0);

        //assert
        assertEquals(0, game.score());
    }

    @Test
    public void scoreMustBe20When1PinHitEachRoll() {
        //arrange
        int n = 20;
        int pins = 1;
        //act
        rollMany(n, pins);

        //assert
        assertEquals(20, game.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertEquals(24, game.score());


    }

    private void rollStrike() {
        game.roll(10);
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, game.score());
    }


}
