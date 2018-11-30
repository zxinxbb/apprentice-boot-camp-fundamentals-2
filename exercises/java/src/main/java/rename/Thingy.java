package rename;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class Thingy {

    private int foo;
    private int c1=0x1, d2=0b111;
    private int foobar = new int[] {0,0,0,0,0}.length;

    String doTheThing() {
        String s = "";
        for (; foo < Byte.MAX_VALUE - 27; foo++) s += b(foo) + " ";
        return s.substring(0,s.length()-1);
    }

    private String b(int foo) {
        c1++;
        d2--;
        foobar--;
        String s = c1 == d2||foobar==0?"":String.valueOf(foo + 1);
        if (c1 == d2) s += reset();
        if (foobar==0) s += f2();
        return s;
    }

    private String f2() {
        foobar = new int[] {0,0,0,0,0}.length;
        return new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
    }

    private String reset() {
        d2 = 0x1B;
        c1 = 0x15;
        return new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);
    }
}
