package com.hubberspot.dsalgo.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Practise {

    public void isLeapYear ( int year ) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    public void isVowel (String letter) {
        letter = letter.toLowerCase();
        String [] vowels = new String[]{"a", "e", "i", "o", "u"};
        if (Arrays.asList(vowels).contains(letter))
        System.out.println("Vowel");
        else
            System.out.println("Not a Vowel");
    }

    public void findDuplicates (String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        HashMap <String,Integer> dict = new HashMap<String,Integer>();
        for (String c : arr) {
            Integer v = dict.get(c);
            if (v == null)
                dict.put(c, 1);
            else
                dict.put(c, v + 1);
        }
        System.out.println(dict);

        for (String c : dict.keySet()) {
            Integer v = dict.get(c);
            if (v > 1)
                System.out.println(c +" = "+v);
        }
    }

    public void isPalindrome(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        Collections.reverse(Arrays.asList(arr));
        String p = "";
        for (String c: arr) {
            p += c;
        }
        System.out.println(p);
        if (p.equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public void removeWhiteSpaces (String s) {
        String result = "";
        for (String c: s.split("")) {
            if (! c.equals(" "))
                result += c;
        }
        System.out.println(result);
    }

    public void countFrequency (String s, String c) {
        int frequency = 0;
        for (String ch: s.split("")) {
            if (ch.equals(c)) {
                frequency += 1;
            }
        }
        System.out.println(frequency);
    }
    public void displayFibonacci( Integer count) {
        ArrayList<Integer> series = new ArrayList<>();
        series.add(0);
        series.add(1);
        for (Integer i = 2; i< count; i++) {
            Integer value = series.get(i-2) + series.get(i-1);
            series.add(value);
        }
        System.out.println(series);
    }

    public void isPrime (Integer num) {
        for (Integer i=2; i<num/2; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    public void countDigits (Integer num) {
        System.out.println(String.valueOf(num).length());
    }

    public void printPyramid (Integer num) {
        for(Integer i = 0; i <num; i++) {
            for(Integer j = 0; j <=i; j++) {
                char ch = 'A';
                ch+=j;
                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    public int sumRecursion (int num) {
        int sum = 0;
        if (num == 0) {
            return 0;
        }
        sum += num + sumRecursion(num-1);
        return sum;
    }

    public String reverseRecursion(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        }
        return reverseRecursion(sentence.substring(1)) + sentence.charAt(0);
    }

    public static void main(String[] args) {
        Practise p = new Practise();
        String str = "My Name is Rahul";
        System.out.println(p.reverseRecursion(str));
    }
}
