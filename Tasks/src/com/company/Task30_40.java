package com.company;

import java.util.Arrays;

public class Task30_40 { //task31

    // Метод для задачи 1 из task4
    public static String sevenBoom(int[] arr) {
        for (int n : arr)
            while (n > 0) {
                if (n % 10 == 7) return "Boom!";
                n /= 10;
            }
        return "there is no 7 in the array";
    }

    // Метод для задачи 2 из task4
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == arr[i + 1] || arr[i+1] - arr[i] > 1) return false;
        return true;
    }

    // Метод для задачи 3 из task4
    public static String unmix(String str) {
        String res = "";
        for (int i = 0; i < str.length() / 2; i++) {
            res += str.charAt(2*i + 1);
            res += str.charAt(2*i);
        }
        if (str.length() % 2 == 1)
            res += str.charAt(str.length() - 1);
        return res;
    }

    // Метод для задачи 4 из task4
    public static String noYelling(String yell){
        while (yell.endsWith("!!") || yell.endsWith("??")) {
            yell = yell.substring(0, yell.length() - 1); // удаление последнего элемента строки
        }
        return yell;
    }

    // Метод для задачи 5 из task4
    public static String xPronounce(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'x')
                if (i == 0 || str.charAt(i - 1) == ' ')
                    if (i < str.length() && str.charAt(i + 1) != ' ')
                        res += 'z';
                    else
                        res += "ecks";
                else
                    res += "cks";
            else
                res += str.charAt(i);
        return res;
    }

    // Метод для задачи 6 из task4
    public static int largestGap(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++)
            max = Math.max(max, arr[i+1] - arr[i]);
        return max;
    }

    // Метод для задачи 7 из task4
    public static int raznitsa(int t) {
        String k = String.valueOf(t); // int -> string
        StringBuilder result = new StringBuilder();
        char[] b = k.toCharArray();
        for (int i = b.length-1; i >= 0; i--) { //запись числа в обратном порядке
            result.append(b[i]); // перепись
        }
        int res = Integer.parseInt(result.toString().trim()); //string ->int, trim удаляет пробелы
        return t - res;
    }

    // Метод для задачи 8 из task4
    public static String commonLastVowel(String str) {
        for (int i = str.length() - 1; i >= 0; i--)
            if (isVowel(str.charAt(i)))
                return "" + Character.toLowerCase(str.charAt(i));
        return null;
    }

    public static boolean isVowel(char c)
    {return "aeiouy".indexOf(c)!=-1;}

    // Метод для задачи 9 из task4
    public static int memeSum(int a, int b) {
        int sum = 0;
        int decade = 1;
        while (a > 0 || b > 0) {
            int subsum = a % 10 + b % 10;
            sum += subsum * decade;
            if (subsum > 9) decade *= 10;
            a /= 10;
            b /= 10;
            decade *= 10;
        }
        return sum;
    }

    // Метод для задачи 10 из task4
    public static String unrepeated(String str) {
        boolean[] charset = new boolean[127];
        String res = "";
        for (char c : str.toCharArray())
            if (!charset[c]) {
                res += c;
                charset[c] = true;
            }
        return res;
    }
}