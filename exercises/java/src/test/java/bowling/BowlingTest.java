package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BowlingTest {
    @Test
    public void rollsOForWholeGame_returnsScoreOf0() {
     Bowling bowling = new Bowling();
     int [] rolls = new int [] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

     int score = bowling.bowl(rolls);

     assertThat(score).isZero();
    }
    @Test
    public void rollsAllOnes_returns20(){
        Bowling bowling = new Bowling();
        int [] rolls = new int [] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};

        int score = bowling.bowl(rolls);

        assertThat(score).isEqualTo(20);

    }

    @Test
    public void hasASpare(){
        Bowling bowling = new Bowling();
        int [] rolls = new int [] {1,9,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};

        int score = bowling.bowl(rolls);

        assertThat(score).isEqualTo(12);

    }
    @Test
    public void hasAStrike(){
        Bowling bowling = new Bowling();
        int [] rolls = new int [] {10,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};

        int score = bowling.bowl(rolls);

        assertThat(score).isEqualTo(14);

    }




}
