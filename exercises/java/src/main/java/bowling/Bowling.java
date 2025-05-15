package bowling;

public class Bowling {
    public int bowl(int[] rolls) {
        int result = 0;
        for (int i = 0; i < rolls.length; i += 2) {
            int frame = 0;
            int nextOne = rolls[i + 1];
            frame += rolls[i];

            if (frame == 10) {
                frame += nextOne + rolls[i + 2];
                i = i - 1;
            } else {
                frame += nextOne;
                if (frame == 10) {
                    frame += rolls[i + 2];
                }
            }
            result += frame;
        }
        return result;
    }

    //we have array that loops over in 2s
    //the frame is the current number - so

    public int strike(){
return 0;
    }
}
