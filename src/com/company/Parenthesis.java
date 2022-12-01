package com.company;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String s = "{[s+(a+b)+1]+2}";
        //String s = "{[s+(a+b+1]+2}";
         //String s = "{[s+(+ab+1])+2}";
        //String s = "{[(a+b)+1]+2}";
        String parentesis = "()[]{}";
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        // for(char c:s.toCharArray());
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = parentesis.indexOf(c); //4
            if (index!=-1){
                if (index%2==0)
                    stack.push(c);
                else {
                    // Пуст ли стек
                    if (stack.isEmpty()){
                        System.out.println("Ошибка в позиции "+i);
                        flag = false;
                        break;
                    }
                    char c2 = stack.peek();
                    int index2 = parentesis.indexOf(c2); //4
                    if (index-index2==1)
                        stack.pop();
                    else {
                        System.out.println("Ошибка в позиции " + i);
                         //Непарность скобок
                        flag = false;
                        break;
                    }
                }
            }
        }
        // Пуст ли стек
        if (!stack.isEmpty() && flag) {
            System.out.println("Ошибка в позиции " + (s.length() - 1));
            flag = false;
        }
        if (flag) System.out.println("Все верно!");
    }
}
