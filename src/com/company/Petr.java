package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Petr {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/data/petr.txt"))) {
            String s;
            do {
                s = br.readLine();
                sb.append(s);
                sb.append(System.lineSeparator());
            }
            while (s != null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = sb.toString();
        //System.out.println(content);
        content = content.replaceAll("[^А-ЯЁёа-я]", " ");
        String[] words = content.split(" ");
        //System.out.println(Arrays.toString(words));
        for (String s : words) {
            s = s.trim();
            if (s.length() !=0 && (s.charAt(0)=='п' || s.charAt(0)==('П')))
                treeSet.add(s);
        }
        System.out.println(treeSet.toString());
    }
}

