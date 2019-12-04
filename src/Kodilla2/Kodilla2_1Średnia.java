import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;

class Averge {
    public static void main (String[] args) {

        int [] number = new int [22];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 10;
        number[10] = 11;
        number[11] = 12;
        number[12] = 13;
        number[13] = 14;
        number[14] = 15;
        number[15] = 16;
        number[16] = 17;
        number[17] = 18;
        number[18] = 19;
        number[19] = 20;
        number[20] = 21;


        double sum = 0;
        double averge = 0;

        for(int i=0; i< number.length; i++) {
        System.out.println(i);

        sum += number[i];
        }
        averge = sum / number.length;
        System.out.println("Averge = "+ averge);
        }
    }