package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BowlingTest {
    @Test
    public void rollsOForWholeGame_returnsScoreOf0() {
     Bowling bowling = new Bowling();
     int [] rolls = new int [] {0,0,0};

     int score = bowling.bowl(rolls);

     assertThat(score).isZero();

    }
}
