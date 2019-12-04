
import java.util.*;
import java.lang.*;
import java.io.*;

class LetterA {

    public static void main (String[] args) throws java.lang.Exception {
        String sumA = "a";
        String a = "a";

        ArrayDeque<String> letterA = new ArrayDeque<String>();
        Random theGenerator = new Random();

        int numberA = 0;

        while(letterA.size() < 50) {
            numberA = theGenerator.nextInt(51);
            if(numberA != 0) {
                for(int i=0; i<=numberA; i++)
                    sumA += a;
            }

            letterA.add(sumA);
        }
        System.out.println(sumA);

        SplitLetters aLetter = new SplitLetters();
        aLetter.splitEven(letterA);
    }
}

class SplitLetters {
    String letter = null;

    ArrayList<String> even = new ArrayList<String>();
    ArrayList<String> unEven = new ArrayList<String>();

    public void splitEven (ArrayDeque<String> letterA) {
        while(letterA.size()>0) {
            letter = letterA.poll();
            if(letter.length() % 2 == 0) {
                even.add(letter);
                System.out.println("even letters: " + letter);
            }else{
                unEven.add(letter);
                System.out.println("uneven letters: " +letter);
            }
        }
    }
}






