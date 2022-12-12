package day15_ForLoop;

import day11_Switch_Scanner.ScannerIntro;

import java.util.Scanner;

/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
public class ReplaceX {


    public static void main(String[] args) {

        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();

        word = word.replace("x","a").replace("X","a"); // we called replaced methods two time by using '.' btw them

        System.out.println(word);



    }
}
