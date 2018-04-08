package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Char {

    public boolean contains(String origin, String sub) {
        boolean result = false;
        char[] originArr = origin.toCharArray();
        char[] subArr = sub.toCharArray();
        int p1 = originArr.length;
        int p3 = subArr.length;
        int p2;
        for (int i = 2; i < p1; i++) {
            p2 = originArr[i];
            for (int j = 0; j < p3; j++) {
                if (p2 == subArr[j])
                    result = true;
                break;
            }
        }
        return result;
    }

}

