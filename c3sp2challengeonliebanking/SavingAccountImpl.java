import java.util.*;
public class SavingAccountImpl {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number ");
        long accountNumber=sc.nextLong();
        System.out.println("enter account holder name ");
        String accHolderName=sc.next();

        SavingAccount savingAccount=new SavingAccount(accountNumber,accHolderName,25000,"Active");

          System.out.println("enter 1 for checking Balance,2 for withdraw or transfer,3 for deposit ");
          int choice=sc.nextInt();
          if(choice==1){
              savingAccount.checkbalance();
          } else if (choice==2) {
              System.out.println("Enter amount for withdraw or transfer ");
              double withdrawamount=sc.nextDouble();
              savingAccount.withdrawCashfromaccount(withdrawamount);
          } else if (choice==3) {
              System.out.println("Enter depositing amount ");
              double depositamount=sc.nextDouble();
              savingAccount.depositingcashtoaccount(depositamount);
          }
          else {
              System.out.println("Out of choice ");
          }
          savingAccount.displaydetails();
    }
}
