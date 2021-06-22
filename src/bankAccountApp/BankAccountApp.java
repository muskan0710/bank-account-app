package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        String file = "C:\\Users\\Muskan\\Documents\\ProjectDocuments\\NewBankAccounts.csv";
        // read csv file and create accounts based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        newAccountHolders.forEach(accountHolder -> {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            switch (accountType) {
                case "Savings":
                    accounts.add(new Savings(name, ssn, initDeposit));
                    break;
                case "Checking":
                    accounts.add(new Checking(name, ssn, initDeposit));
                    break;
                default:
                    System.out.println("Error: Reading Account Type");
                    break;
            }
        });

        accounts.forEach(acct -> {
            System.out.println("\n--------------------------------------");
            acct.showInfo();
        });
    }
}
