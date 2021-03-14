import java.util.Random;

public class BankAccount {

    private String accountnumber;
    private double checkingbalance;
    private double savingsbalance;

    private static int numofaccounts = 0;
    private static int moneyinaccounts = 0;

    private static String accnum(){
        Random num = new Random();
        String accnum = "";
        for ( int i = 0; i<30; i++){
            accnum += num.nextInt(5);
        }
        return accnum;
    }

    public BankAccount() {
        this.accountnumber = BankAccount.accnum();
        this.checkingbalance = 0;
        this.savingsbalance = 0;
        numofaccounts += 1;
        moneyinaccounts += (checkingbalance + savingsbalance);

    }

    public int getCheckingBalance(){
        return this.checkingbalance;
    }

    public int getSavingsBalance(){
        return this.savingsbalance;
    }

    public void deposit(double amt, String account){
        if (account.equals("savings")){
            this.savingsbalance += amt;
        }else if(account.equals("checking")){
            this.checkingbalance += amt;
        }
    }

    public void withdrawal(double amt, String account){
        if (account.equals("savings")){
            if (amt <= this.savingsbalance){
                this.savingsbalance -= amt;
            }else{
                System.out.println("insufficent funds");
            }
        else if (account.equals("checking")){
            if (amt <= this.checkingbalance){
                this.checkingbalance -= amt;
            }else{
                System.out.println("insufficent funds");
            }
        }
    }

    public void displaybalance(){
        System.out.println("Savings: "+this.savingsbalance+ "Checking: " +this.checkingbalance);
    }
}