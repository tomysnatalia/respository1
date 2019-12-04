package Kodilla4;

public class Kodilla4_7Algorytm {

    int a = 0;
    int b = 0;


    public static int NWD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }



    public static void main (String[] args) {

        System.out.println(NWD(100, 20));
    }
}