public class BankAccount {
    static String bankName="gareeb bank";
    static int totalAccounts=0;
    final int accountNumber;
    String accountholderName;
    public BankAccount(String accountholderName,int accountNumber){
        this.accountholderName=accountholderName;
        this.accountNumber=accountNumber;
        
        totalAccounts++;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("bank name"+bankName);
            System.out.println("Account Holder Name: "+accountholderName);
            System.out.println("accountNumber  "+this.accountNumber);
        }
    }
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Guzzar",123);
        System.out.println(account1.getTotalAccounts());
        account1.displayDetails();
        BankAccount account2=new BankAccount("pradhan", 123466);
        System.out.println(account2.getTotalAccounts());
        account2.displayDetails();
    }

}
