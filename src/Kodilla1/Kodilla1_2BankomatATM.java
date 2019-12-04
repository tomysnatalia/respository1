package Kodilla1;

interface CashATM {
    void cashDeposit();
    void cashWithdraw();
    void callTo(String bankName);
    default void canceled() {
        System.out.println("Transaction canceled");
    }
    static String compledTransaction()  {
        return "Transacon compled, please take your card";
    }
}


class ATMImpl implements CashATM {
    public void cashDeposit() {
        System.out.println("Please insert your card and press money amount");
    }
    public void cashWithdraw() {
        System.out.println("Please insert your card and press PIN");
    }
    public void callTo(String bankName) {
        System.out.println("...Connection to the" + " " + bankName + "..." );
    }
}



class Application {

    public static void main (String [] args) {


        ATMImpl cash = new ATMImpl();
        cash.cashWithdraw();
        cash.callTo("MBank");

        System.out.println(CashATM.compledTransaction());

    }
}




