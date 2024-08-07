public class Account {
    private String accountHolder;
    private double balance;
    
    public Account(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double ammount){
        if(ammount > 0) {
            balance += ammount;
            System.out.println("Deposited : " + ammount);
        }else{
            System.out.println("Deposit Invalid");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }else{
            System.out.println("Balance amount is insuficient");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

}
