package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Betty {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/data/betty.txt"))) {
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
        content = content.replaceAll("[^A-Za-z]", " ");
        String[] words = content.split(" ");
        //System.out.println(Arrays.toString(words));
        for (String s : words) {
            s = s.trim();
            if (s.length() !=0 && (s.charAt(0)=='b' || s.charAt(0)==('B')))
                treeSet.add(s);
        }
        System.out.println(treeSet.toString());
    }
}

