import java.util.*;

class WhileLoop {
    public static void main (String[] args) {

        int counter = 0;
        int sumA = 1000;
        int sumB = 0;

        Random sum = new Random();
        do {
            System.out.println("Couting in progress: [attempt " + counter + "]" + "\n" + "sumA = " + sumA + " sumB = " + sumB + "\n");
            counter++;
            sumA = sumA + sum.nextInt(9);
            sumB = sumB + sum.nextInt(49);
        }
        while (sumA > sumB);
    }
}