import java.util.*;

public class SavingAccount {
    long accountNumber;
    String accHolderName;
    double accountBalance;
    String accountStatus;


public double checkaccountbalance(){
    return accountBalance;
}
    public double withdrawCashfromaccount(double withdrawcash){

        accountBalance=accountBalance-withdrawcash;

        return accountBalance;
    }
    public double depositingcashtoaccount(double depositcash){

        accountBalance=accountBalance+depositcash;
        System.out.println("Successfully cash deposit to Your account ");

        return accountBalance;
    }
    public double transferCash(double transfercash){
        accountBalance=accountBalance-transfercash;
        System.out.println("Successfully cash transfer ");


        return accountBalance;
    }
    public void displaydetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Account Balance: "+accountBalance);
        System.out.println("Account Status: "+accountStatus);
    }
    public static void main(String args[]){
        SavingAccount savingAccount=new SavingAccount();
        Scanner sc=new Scanner(System.in);
        savingAccount.accountNumber=123456789;
        savingAccount.accHolderName="narendra";
        savingAccount.accountStatus="Active";
        savingAccount.accountBalance=5000;

        System.out.println("enter 1 for checking account balance, 2 for withdraw cash, 3 for deposit cash, 4 for transfer cash");
        int key=sc.nextInt();
        switch (key){
            case 1: {
                savingAccount.checkaccountbalance();
                break;
            }
            case 2: {

                System.out.println("enter amount to withdraw ");
                double withdrawcash = sc.nextDouble();
                savingAccount.withdrawCashfromaccount(withdrawcash);
                break;
            }
            case 3: {

                System.out.println("enter  deposting cash ");
                double depositcash = sc.nextDouble();
                savingAccount.depositingcashtoaccount(depositcash);
                break;
            }
            case 4: {
                System.out.println("enter amount to transfer ");
                double transfercash = sc.nextDouble();
                savingAccount.transferCash(transfercash);
                break;
            }
            default: {
                System.out.println("Sorry wrong option select ");
            }
        }
        System.out.println();
        savingAccount.displaydetails();
    }


}