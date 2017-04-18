package com.jetbrains;

// Lab Six, Translate to PigLatin. GC Java Bootcamp. Lydia Latocki

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int i = 0;
        char ch;
        String morePigLatin = "Yes"; // set variable for continue condition

        do {

            System.out.println("Enter a word to translate: "); // prompt user to enter a word for translation

            String str = scnr.nextLine().toLowerCase(); // global scanner

            ch = str.charAt(0); // use to check for word starting with vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // send word through all vowels
                System.out.println(str + "way");
            }
            else  { // continue through this block if word does not start with vowel

                final String vowels = "aeiou"; // use this to iterate through word charactors until vowel is found
                for (i=0; i< str.length(); i++){ // loop through each char of the word that strats with consonant
                    char letter = str.charAt(i); // use to locate the position of the first vowel

                    if (vowels.contains(String.valueOf(letter))){ // capture the position of the first vowel
                        String str1 = str.substring(0,i); // substring cuts word at index position, first=0, up to vowel=i
                        String bkstr = str.substring(i); // substring captures the back end of the word at the vowel to the end
                        System.out.println(bkstr + str1 + "ay"); // print the new PigLatin word from last part= bkstr, first chars=str1, and ay
                        break; // used to stop from looping through the rest of the characters in the word
                    }
                }
            }

            System.out.println("Enter another word?? Yes or No."); // prompt user to continue or not
            morePigLatin = scnr.nextLine();

        }
        while (morePigLatin.equalsIgnoreCase("Yes")); // result to continue loop back up to word prompt line 19
        System.out.println("Goodbye."); // exit program on No

    }

}



