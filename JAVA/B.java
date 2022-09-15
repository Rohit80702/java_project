import java.util.Scanner;

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname , String cid){
        customerName =  cname;
        customerId = cid;
    }

    void deposit(int amount)
    {
        if(amount!=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Deposited:" + previousTransaction);
        }
        else if (previousTransaction<0){
            System.out.println("Withdraw:" +    Math.abs(previousTransaction) );
        }
        else{
            System.out.println("No transaction occured");
        }
    }
    void Interest(int Am,int t)
    {
        int ch;
        int s,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FOLLOWING CHARACTER FOR FOLLOWING CHOICES:");
        System.out.println("1.HOME || 2.CAR || 3.EDUCATION");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: r=9;
                    s=(Am*r*t)/100;
                    System.out.println("INTEREST WILL BE"+s);
                    break;
            case 2: r=4;
                    s=(Am*r*t)/100;
                    System.out.println("INTEREST WILL BE"+s);
                    break; 
            case 3: r=7;
                    s=(Am*r*t)/100;
                    System.out.println("INTEREST WILL BE"+s);
                    break;
            default: System.out.println("WRONG CHOICE::");
        }
    }

    void showMenu(){
        char option = '\0';
        Scanner scanner =new Scanner(System.in);
        System.out.println("welcome" + customerName);
        System.out.println("your ID" + customerId);
        System.out.println("\n");

        System.out.println("A: Check your Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraws");
        System.out.println("D: Previous Transaction");
        System.out.println("E: LOAN CALCULATION");
        System.out.println("F: Exit The System");

        do{
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("enter your option ");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            option=scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A' :
                System.out.println("--------------------------------------------");
                System.out.println("Balance = " + balance);
                System.out.println("--------------------------------------------");
                System.out.println("\n");
                break;

                case 'B' :
                System.out.println("--------------------------------------------");
                System.out.println("Enter an amount to deposit");
                System.out.println("---------------------------------------------");

                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;

                case 'C' :
                System.out.println("--------------------------------------------");
                System.out.println("Enter an amount to withdraw");
                System.out.println("---------------------------------------------");

                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("----------------------------------------------");
                getPreviousTransaction();
                System.out.println("----------------------------------------------------");
                System.out.println("\n");
                break;
                
                case 'E':
                int Am,t;
                Scanner sc=new Scanner(System.in);
                System.out.println("ENTER THE AMOUNT:");
                Am=sc.nextInt();
                System.out.println("ENTER THE TIME:");
                t=sc.nextInt();
                Interest(Am,t);



                case 'F':
                System.out.println("===================================================================================");
                break;



                default:
                  System.out.println("Invalid Option!! Please enter the correct option........");
                  break;
            }
        }

        while(option !='F');
        System.out.println("thank you for using our service!!..........");





    }
} 
public class  B
{
    public static void main(String args[])
    {
       BankAccount obj = new BankAccount("HOLA ", " AN00000001");
       obj.showMenu();

    }
}
