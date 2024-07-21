// Java Program to Count Number of Vowels in a String

import java.io.*;
import java.util.*;
public class CountVowels{
    public static void main(String[] args)throws IOException
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the String:");

        String S = myObj.nextLine();
        S = S.toLowerCase();
        int count = 0;
        String vow ="aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if(vowels.contains(S.charAt(i))){
                count++;
            }
        }

        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
    }
}
