package day15_ForLoop;


import java.util.Scanner;

/*
Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */
public class StartsWithX {


    public static void main(String[] args) {

        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();// if you are going to use Scanner one time you can use liken this.
        if (word.charAt(0)=='x'){
           word =word.replaceFirst("x","a");
        }

        System.out.println(word);



    }
}
