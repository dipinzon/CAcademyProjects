package Bank;

public class CheckingAccount{
    private String name;
    private int balance;
  
    public CheckingAccount(String inputName, int inputBalance){
      name = inputName;
      balance = inputBalance;
    }

    public int getBalance()
    {
      return balance;
    }

    public void setBalance(int newBalance)
    {
       this.balance = newBalance; 
    }
  
    private void addFunds(int fundsToAdd){
      balance += fundsToAdd;
    }
  
    private void getInfo(){
      System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

    public void printInfo()
    {
      this.getInfo();
    }
  
    public static void main(String[] args){
     CheckingAccount myAccount = new CheckingAccount("Diego", 0); 
     System.out.println(myAccount.balance);
     myAccount.addFunds(5);
     System.out.println(myAccount.balance);
      
    }
  
  }