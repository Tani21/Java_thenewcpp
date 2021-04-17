class Account
{
    int accountid,age;
    double balance;
    
    Account(int accountid, double balance, int age)
    {
        this.accountid=accountid;
        this.balance=balance;
        this.age=age;
        
        if(age<10)
        {
            System.out.println("Please open a joint account");
        }
        
        if(balance<100)
        {
            System.out.println("The minimum account balance should be 100 rs");
        }
    }
    
    class moneyWithdrawException extends Exception
    {
        public String toString()
        {
            return ("You have low balance in your account");
        }
        
    }
    
    double moneyWithdraw(double money) throw moneyWithdrawException
    {
        moneyWithdrawException mwe = new moneyWithdrawException ();
        if(balance<money)
        {
            throw mwe;
        }
        
        else{
            balance=balance-money;
            return balance;
        }
            
        
    }
    
    double moneyDeposit(double money)
    {
        balance=balance+money;
        return balance;
    }
}

public class Main
{
	public static void main(String[] args) {
		Account myaccount = new Account(001, 1000.0, 19);
		double newbalance = myaccount.moneyDeposit(1000.0);
		newbalance = myaccount.moneyWithdraw(500.0);
		System.out.println("balance after transactions: "+newbalance);
		
	}
}
