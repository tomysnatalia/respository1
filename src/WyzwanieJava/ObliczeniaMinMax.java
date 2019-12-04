class Main2 {
    public static void main(String[] args) {
        Flight2 airport = new Flight2 (" KTW ", " KRK ");


        String Flight = airport.getDetails();
        System.out.println(Flight);

        airport.isDivived(4,18);
        airport.getEvenSum(5,9);
        airport.getNumber(5,-2);


    }
}

class Flight2 {
    String departure;
    String arrival;

    public Flight2 (String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDetails() {
        return ("Flight from" + this.departure + "to" + this.arrival);
    }

    public void isDivived(int min, int max) {
        for (int i=min; i<max; i++) {
            if(i%3==0) {
                System.out.println(i);
            }
            else if (i%5==0) {
                System.out.println(i);
            }
            else {
                System.out.println();
            }
        }
    }

    public void getEvenSum (int min, int max) {
        for (int i=min; i<max; i++) {
            if(i%2==0) {

                int a = min;
                int b = max;
                int c = a + b;

                System.out.println(c);
            }
        }
    }

    public void getNumber(int max,int min) {
        for (int i=min; i<max; i++) {
            System.out.println(i);
        }
    }
}





