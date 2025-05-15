package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private int countUpToOneHundred;
    private int countsUpToThree;
    private int countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;

    String doFizzBuzzUpTo100() {
        String string = "";
        for (; countUpToOneHundred < 100; countUpToOneHundred++) string += addFizzOrBuzz(countUpToOneHundred) + " ";
        return string.substring(0, string.length() - 1);
    }

    private String addFizzOrBuzz(int number) {
        countsUpToThree++;
        countsDownFromFive--;
        String s = countsUpToThree == 3 || countsDownFromFive == 0 ? "" : String.valueOf(number + 1);
        if (countsUpToThree == 3) s += fizz();
        if (countsDownFromFive == 0) s += buzz();
        return s;
    }

    private String buzz() {
        countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;
        try {
            return new String(Hex.decodeHex("42757a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String fizz() {
        countsUpToThree = 0;
        try {
            return new String(Hex.decodeHex("46697a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
