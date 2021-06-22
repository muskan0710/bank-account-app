package bankAccountApp;

public class Checking extends Account {
    //list properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //constructor
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    //list methods specific to checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    //list methods specific to checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account features: " +
                "\n > Debit Card Number: " + debitCardNumber +
                "\n > Debit Card Pin: " + debitCardPin);
    }
}
