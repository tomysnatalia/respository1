abstract class BankTransactions {

    private void insertCard() {
        System.out.println("Please insert your card");
    }
    private void codePIN() {
        System.out.println("Please put 4 digit of your PIN");
    }
    private void moneyAmount() {
        System.out.println("Please press the money amount or choose other amount");
    }
    abstract protected void paymentChecking();

    abstract protected void accountBalance();

    abstract protected void cashWithdrawal();

    private void completedTransaction() {
        System.out.println("Transaction competed. Please take card and recipt. HAVE A NICE DAY!");
    }

    public void run() {
        this.insertCard();
        this.codePIN();
        this.moneyAmount();
        this.paymentChecking();
        this.accountBalance();
        this.cashWithdrawal();
        this.completedTransaction();
    }
}


class BankTransactionsRunner extends BankTransactions {
    protected void paymentChecking() {
        System.out.println("Acceptance of the payment request by the Bank");
    }

    protected void accountBalance() {
        System.out.println("Checking balance account....");
    }
    protected void cashWithdrawal() {
        System.out.println("Please take your money");
    }

}



class App {

    public static void main (String args[]) {

        BankTransactionsRunner bankomat =  new BankTransactionsRunner();
        bankomat.run();
    }
}