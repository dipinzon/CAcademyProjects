public class Nosey {
    int age;
    static int age2 = 43;  //Static Variable declaration 
    
    public Nosey(int myAge)
    { age = myAge;  }
    public static void main(String[] args)
    {   Nosey years = new Nosey(44);
        System.out.println("Your age is: " + years.age);
        System.out.println("Other age: " + age2);
    }
}
