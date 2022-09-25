/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	//public static void main(String[] args) {
        
        static  Scanner sc=new Scanner (System.in); //for taking input
        static Random ran = new Random ();
        static double balance=46562.000;
        static float Amount;
        static double sum,Sub;
        static int credit_score=999;
        static long AccountNo;
          
          // method to check the length of AccountNo
          static  boolean check(long num){
                 int length = 0;
                 while (num != 0){
	                length++;
                	num = num / 10;
                 }
                 if (length == 10)
            return true;
            return false;
          }
            //method for cash Deposit
            static void CashDeposit(){
                System.out.println("Enter The Amount you want to deposit - ");
                Amount=sc.nextFloat();
                sum=balance+Amount;
                System.out.println(sum);
            }
            
           //method for cash Withdrawl
            static double CashWithdrawl(){
              System.out.println("Enter the Amount you want to Withdrawl- ");
              Amount=sc.nextFloat();
              if(balance>Amount){
              Sub=balance-Amount;
              System.out.println(Sub);
              }
              else{
                  System.out.println("Sorry, You have low Balance ");
              }
              return Sub;
            }
            
            //method for Fixed deposit
            static void FixedDeposit(){
                System.out.println("Enter the Amount you want to do FD - ");
                Amount=sc.nextFloat();
                System.out.println("For How Many year you want to do FD for - ");
                int Year=sc.nextInt();
                int rate=ran.nextInt(15);
                double tot= balance/rate*100;
                double totalAmount=tot+Amount;
                System.out.println("Your Final Amount is "+totalAmount+", You will get this amount after "+Year+"Years");
                
            }
            
            //method for loans
           static void Loan(){
               if(credit_score<800){
                   System.out.println("Sorry, we can't grant loan because You have Low credit_score.");
               }
               else{
                    System.out.println("Which type of Loan you want- "+"\n"+ "1. Education Loan"+"\n"+"2. House Loan" +"\n"+
                    "3. Personal Loan"+"\n"+"4. Car Loan");
                    int a=sc.nextInt();
                    System.out.println("For How many Years you want this loan- ");
                    int tanure=sc.nextInt();
                    System.out.println("How much you amount you want to aprrove- ");
                    double loan=sc.nextDouble();
                    int rate=ran.nextInt(15);
                    double tot=(loan*tanure*rate)/100;
                    double totalAmount=tot+loan;
                    System.out.println("Your Final Amount is "+totalAmount+", You will get this amount after "+ tanure+"Years. ");
                    System.out.println("Sir/Ma'am, Please Confirm Do you want this loan or terminate- " +"\n"+"1. Yes" +"\n"+"2. NO");
                    int c=sc.nextInt();
                       if(c==1){
                            System.out.println("Your Loan is approved.");
                
                       }
                       else{
                            System.out.println("Okay, If you are facing any problem,We will terminate this process.You can Check our website for more details regarding loan.");
                       }
               }
            
           }

            //method for Net Banking
            public static void netbank (){
               System.out.println ("Enter the account number of the reciever of 10 digits -");
               long Acc = sc.nextInt ();
               if (!check (acc)){
	                System.out.println ("Please enter the correct account number and try again");
	                return;
               }
               else if(AccountNo == Acc) {
	                System.out.println ("Money cannot be transffered to same account number");
	                return;
               }
               System.out.println ("Enter the amount you wanna tranfer to the account number:" +Acc);
               double amount = sc.nextInt ();
               if (amount > balance){
	                double t = amount - balance;
	                System.out.println ("Tranfer of money fails due to shortfall of" + t +"rupees in bank balance");
	                return;
               }
               balance =balance- amount;
               System.out.println (amount + " is tranferred to the account number " +Acc + " and your current balance is:" + balance);
            }

                
                
        
                
            
          
         
        public static void main(String[] args) {
         
            System.out.println( "\t"+  "\t"+"\t" +"\t"+  "\t"+"\t"+"Welcome to Lena Dena Bank!");
            System.out.println("Please Enter your name -");
            String name=sc.nextLine();
            System.out.println("Hello "+name+" Ma'am/Sir, Welcome to Lena Dena Bank.");
            System.out.println("Enter your Account NO. of 10 digit - ");
             AccountNo=sc.nextInt(); 
            if((!check(AccountNo))){
                System.out.println("you have entered a wrong acoount no.");
            }
            else{
                System.out.println("Do You Have Atm Card -"+ "\n"+"1. Yes"+ "\n"+"2. No");
                int atm=sc.nextInt();
                System.out.println("Do You Have Cheque Book"+"\n"+"1. Yes"+ "\n"+"2. No");
                int Cheque=sc.nextInt();
                System.out.println("Do You Use Net Banking Services"+"\n"+"1. Yes"+ "\n"+"2. No");
                int Net=sc.nextInt();
          
                System.out.println("Kindly Enter The Services You Would Like To Use -" +"\n"+"1. Cash Deposit "+"\n"+"2. Cash Withdrawl"+"\n"+
                "3. Fixed Deposit"+"\n"+"4. Loan"+"\n" +"5. Net Banking"+"\n"+"6. ATM Cash Withdrawl" +"\n"+"7. Money Tranfer Via NEFT"+
                "\n"+"8. Money Tranfer Via RTGS"+"\n"+"9. Card Issues"+"\n");
                int num=sc.nextInt();
            
              
                  switch(num){
                     case 1: CashDeposit();
                     break;
                     case 2: CashWithdrawl();
                     break;
                     case 3: FixedDeposit();
                     break;
                     case 4: Loan();
                     break;
                     case 5: netbank();
                     
                         
                  }
            
              
              System.out.println("\n"+"\n"+"THANK YOU HAVE A NICE DAY!");
            }
        }
        
          
}    
	



