package com.banking;
import java.util.*;

public class SavingAccountImpl {
    public static void main(String args[]) {
        SavingAccount savingAccount = new SavingAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Holder Name ");
        savingAccount.setAccountHolderName(sc.next());

        System.out.println("Enter Account Number ");
        savingAccount.setAccountNumber(sc.nextLong());
        savingAccount.setAccountOpeningDate("15/10/2005");
        savingAccount.setAvailableBalance(20000);
        savingAccount.setAccountStatus("Active");
        savingAccount.setInternetAndMobileBankingEnabled(true);
        savingAccount.setInterestRate(6.5f);
        savingAccount.setModeOfOperation("Self");
        savingAccount.displaydetails();
        System.out.println("enter 1 for checking Balance,2 for withdraw or transfer,3 for deposit ");
        int choice=sc.nextInt();
        if(choice==1){
            savingAccount.getCheckBalance();
        } else if (choice==2) {
            System.out.println("Enter amount for withdraw or transfer ");
            double withdrawAmount=sc.nextDouble();
            savingAccount.setWithdrawCashFromAccount(withdrawAmount);
        } else if (choice==3) {
            System.out.println("Enter depositing amount ");
            double depositAmount=sc.nextDouble();
            savingAccount.setDepositingCashToAccount(depositAmount);
        }
        else {
            System.out.println("Out of choice ");
        }
        System.out.println("Available Balance in Account "+savingAccount.getAvailableBalance());


    }
}