package bankAccountApp;

public class Savings extends Account {
    //list properties specific to Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //constructor
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //list methods specific to Savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account features: " +
                "\n > Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n > Safety Deposit Box Key: " + safetyDepositBoxKey);
    }
}
