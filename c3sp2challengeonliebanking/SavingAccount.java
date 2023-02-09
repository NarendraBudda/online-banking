public class SavingAccount {
    long accountNumber;
    String accHolderName;
    double accountBalance;
    String accountStatus;

    public SavingAccount(long accountNumber,String accHolderName,double accountBalance,String accountStatus){
        this.accountNumber=accountNumber;
        this.accHolderName=accHolderName;
        this.accountBalance=accountBalance;
        this.accountStatus=accountStatus;
    }

    public double checkbalance(){

        return accountBalance;
    }

    public double withdrawCashfromaccount( double withdrawcash) {

        accountBalance = accountBalance - withdrawcash;
        System.out.println("Amount Debited from your account "+withdrawcash);

        return accountBalance;
    }

    public double depositingcashtoaccount(double depositcash) {

        accountBalance = accountBalance + depositcash;
        System.out.println("Successfully cash deposit to Your account "+depositcash);

        return accountBalance;
    }
    public void displaydetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Account Balance: "+accountBalance);
        System.out.println("Account Status: "+accountStatus);
    }
}

