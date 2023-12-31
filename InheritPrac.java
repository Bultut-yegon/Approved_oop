class BankAccount{
    double acBal;
    int acNo;
    String acName,acEmail,acPhone;
    public BankAccount(double acBal,int acNo,String acEmail,String acPhone, String acName){
        this.acBal=acBal;
        this.acName=acName;
        this.acPhone=acPhone;
        this.acEmail=acEmail;
        this.acNo=acNo;

    }
    public void accountHolder()
    {
        System.out.println("Account Number: "+acNo);
        System.out.println("Account Holder Name: "+acName);
        System.out.println("Account Holder Address: "+acEmail);
        System.out.println("Account Holder phone: "+acPhone);
        System.out.println("Account Holder balance: "+acBal);
    }
    public void deposit(double amount){
        acBal+=amount;
        System.out.println("Deposited: $"+amount);
    }
    public void displayBalance(){
        System.out.println("Account number : "+acNo+" Balance: "+acBal);
    }
}
class SavingAccount extends BankAccount{
    public SavingAccount(double acBal,int acNo,String acEmail,String acPhone,String acName ){
        super(acBal,acNo,acEmail,acPhone,acName);
    }
}
class CurrentAccount extends BankAccount{
    public CurrentAccount (String acName,String acEmail,String acPhone,int acNo,double acBal){
        super(acBal,acNo,acEmail,acPhone,acName);
    }
} 
class InheritPrac{
    public static void main(String[] args) {
        SavingAccount save=new SavingAccount(2000, 234567, "t@gmail.com", "7864278732", "NCBA");
        System.out.println("SAVINGS ACCOUNT DETAILS\t");
        save.accountHolder();
        save.deposit(3000);
        save.displayBalance();
        System.out.println("CURRENT ACCOUNT DETAILS\t");
        CurrentAccount current=new CurrentAccount("Bultut", "bult@gmail.com", "0784623737", 234865, 240);
        current.accountHolder();
        current.deposit(300);
        current.displayBalance();
    }
}