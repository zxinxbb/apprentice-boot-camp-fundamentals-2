package bowling;

import java.util.Arrays;

public class Bowling {
    public int bowl(int[] rolls) {

        return Arrays.stream(rolls).sum();

    }
}
