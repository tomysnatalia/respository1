class Wrapper {
public static void main (String[] args) {
        int a = 30;
        char b  =  'N';
        boolean c = true;

        Integer a2 = a;
        Character b2 = b;
        Boolean c2 = c;

        System.out.println( a == a2);
        System.out.println( b == b2);
        System.out.println( c == c2);
        }
}