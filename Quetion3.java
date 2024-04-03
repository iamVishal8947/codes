package rslCodes;

import java.util.HashMap;

public class Quetion3 {
    public static int countLastCharacter(char[] stream) {
        int count = 0;
        char lastCharacter = '\0';
        for (char ch : stream) {
            if (ch == '\n') {
                break;
            }
            lastCharacter = ch;
            count++;
        }
        int lastCharacterCount = 0;
        for (char ch : stream) {
            if (ch == lastCharacter) {
                lastCharacterCount++;
            }
        }
        return lastCharacterCount;
    }

    public static void main(String[] args) {
        char[] stream = {'a', '1', '!', 'r', 'r', ' ', '~', 'A', '\n'};
        System.out.println(countLastCharacter(stream));
    }
}


