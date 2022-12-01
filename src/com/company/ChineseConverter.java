package com.company;
/*
1:	一	&#x4e00;
2:	二	&#x4e8c;
3:	三	&#x4e09;
4:	四	&#x56db;
5:	五	&#x4e94;
6:	六	&#x516d;
7:	七	&#x4e03;
8:	八	&#x516b;
9:	九	&#x4e5d;
10:	十	&#x5341;
11:	十一  	&#x5341;&#x4e00;
12:	十二	&#x5341;&#x4e8c;
20:	二十	&#x4e8c;&#x5341;
50:	五十	&#x4e94;&#x5341;
100:	百	&#x767e; (Japanese: hyaku, Chinese: bai)
1000:	千	&#x5343; (Japanese: sen, Chinese: qian)
10,000:  	万	&#x4e07; (Japanese: man)
10,000:  	萬	&#x842c; (Chinese: wan)
10^8:	億	&#x5104; (Japanese: oku)
10^8:	亿	&#x4ebf; (Chinese: yi)
10^12:	兆	&#x5146; (Japanese: chou, Chinese: jhao)
*/

import java.util.Arrays;
import java.util.HashMap;

public class ChineseConverter {
    public static void main(String[] args) {
        int number = 111;
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "\u4e00");
        hmap.put(2, "\u4e8c");
        hmap.put(3, "\u4e09");
        hmap.put(4, "\u56db");
        hmap.put(5, "\u4e94");
        hmap.put(6, "\u516d");
        hmap.put(7, "\u4e03");
        hmap.put(8, "\u516b");
        hmap.put(9, "\u4e5d");
        hmap.put(10, "\u5341");
        hmap.put(100, "\u767e");
        hmap.put(1000, "\u5343");

        int count = Integer.toString(number).length(); //Количество цифр = 123
        Integer[] digits =
                Arrays.stream
                        (Integer.toString(number).split(""))
                        .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int ones = digits[count-1];
        int tens = (count>1)? digits[count-2]: 0;
        int hundreds = (count>2)? digits[count-3]: 0;

        String res = "";
        if (hundreds==1) res = res.concat(hmap.get(100));
        else if (hundreds>1)
            res = res.concat(hmap.get(hundreds)).concat(hmap.get(100));
        if (tens==1) res = res.concat(hmap.get(10));
        else if (tens>1)
            res = res.concat(hmap.get(tens)).concat(hmap.get(10));
        if (ones!=0)
            res = res.concat(hmap.get(ones));
        System.out.println(res);
    }
}
