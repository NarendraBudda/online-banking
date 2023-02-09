package com.banking;

public class BankAccountImpl {
    public static void main(String args[]) {
        SavingAccount savingAccount = new SavingAccount(987654321, "12/08/2015", "self", true, 100000, 25000, 6.5f);
        RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount(1234567890, "15/10/2021", "self", true, 500000, 75000, 8.5f);
        System.out.println("Saving account details ");
        System.out.println("Account number " + savingAccount.getAccountNumber());
        System.out.println("account opening date " + savingAccount.getAccountOpeningDate());
        System.out.println("account mode of operation " + savingAccount.getModeOfOperation());
        System.out.println("account balance " + savingAccount.SowAccountBalance());
        System.out.println("balance after debited amount " + savingAccount.DebitAmount(15000));
        System.out.println("balance after credited amount " + savingAccount.CreditAmount(30000));
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Recurring  account details ");
        System.out.println("Account number " + recurringDepositAccount.getAccountNumber());
        System.out.println("account opening date " + recurringDepositAccount.getAccountOpeningDate());
        System.out.println("account mode of operation " + recurringDepositAccount.getModeOfOperation());
        System.out.println("available balance " + recurringDepositAccount.SowAccountBalance());
        System.out.println("balance after debited amount " + recurringDepositAccount.DebitAmount(15000));
        System.out.println("balance after credited amount " + recurringDepositAccount.CreditAmount(30000));
    }
}
