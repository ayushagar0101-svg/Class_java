public class Bank_account {
    private String accountNumber;
    private double balance;
    
    public Bank_account(String accountNumber,double balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposite(double amount){
        if(amount>0){
       this.balance+=amount;
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public int withdraw(double amount){
        if(this.balance>=amount){
            this.balance-=amount;
            System.out.println("Withdrawal successful");
        }
        else{
            System.out.println("Insufficient funds");
        }
        return 0;
            
        }
        public void getbalance(){
            System.out.println(this.accountNumber);
            System.out.println(this.balance);
        }
    public static void main(String[] args) {
        Bank_account account = new Bank_account("123456789", 1000.0);
        account.deposite(500);
        account.withdraw(200);
        account.getbalance();
    }
}
