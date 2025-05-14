package bowling;

public class Bowling {
    public int bowl(int[] rolls) {
        int result = 0;
        for (int i = 0; i < rolls.length; i += 2) {
            int frame = 0;
            frame += rolls[i];
            frame += rolls[i + 1];
            if (frame == 10) {
                frame += rolls[i + 2];
            }

            result += frame;


        }
        return result;

//        return Arrays.stream(rolls).sum();

    }
}
