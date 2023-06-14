package Bank;

public class Bank{
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
  
    public Bank(){
      accountOne = new CheckingAccount("Zeus", 100);
      accountTwo = new CheckingAccount("Hades", 200);
    }
  
    public static void main(String[] args){
      Bank bankOfGods = new Bank();
      //System.out.println(bankOfGods.accountOne.name); //Not accessible because the instance vble is private
      
      //Define Seeter / Getter
      System.out.println(bankOfGods.accountOne.getBalance());
      
      bankOfGods.accountOne.setBalance(5000);
      System.out.println(bankOfGods.accountOne.getBalance()); 

      //bankOfGods.accountOne.addFunds(5);

      bankOfGods.accountOne.printInfo();
  
    }
  
  }