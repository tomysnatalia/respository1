class Phone {
public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 700);
        System.out.println(phone.price);
        phone.displayValues();
        phone.discountPrice();
        phone.checkPrice();

        MobilePhone oldphone = new MobilePhone("4000g",100);
        System.out.println(oldphone.price);
        oldphone.displayValues();
        oldphone.discountPrice();
        oldphone.checkPrice();

        MobilePhone mediumphone = new MobilePhone("600g",340);
        System.out.println(mediumphone.price);
        mediumphone.displayValues();
        mediumphone.discountPrice();
        mediumphone.checkPrice();

        phone.displayEvenNumbers(17,33);



        }
        }
class MobilePhone {
    String weight;
    int price;

    public void discountPrice() {
        int a = price;
        int b = 9;
        int c = a * b/10;
        System.out.println(c);
    }
    public MobilePhone (String weight, int price) {
        this.weight = weight;
        this.price = price;


    }

    public void displayValues() {
        System.out.println(this.price+"-10%");
    }

    public void checkPrice() {
        if (this.price>500) {
            System.out.println("This phone is too expensive");
        }
        else if (this.price<200){
            System.out.println("price is very good");
        }
        else if (this.price<300) {
            System.out.println("price is good");
        }
        else if (this.price<550) {
            System.out.println("price could be lower");
        }
        else {
            System.out.println("this phone is too expensive");
        }
    }
    public void displayEvenNumbers (int min, int max) {
        for (int i=min; i<max; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}

