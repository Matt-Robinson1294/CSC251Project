import java.util.Scanner;

public class Project1_Matthew_Robinson
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num;
      String provider;
      String first;
      String last;
      int age;
      String smoker;
      double h;
      double w;
      
      //ask the user for all input
      System.out.print("Please enter the Policy Number: ");
      num = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Provider Name: ");
      provider = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      first = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      last = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoker = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      h = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      w = keyboard.nextDouble();
      
      //create an instance of the Policy class using the input
      Policy userPolicy = new Policy(num,provider,first,last,age,smoker,h,w);
      
      System.out.println("\nPolicy Number: " + userPolicy.getNumber());
      System.out.println("Provider Name: " + userPolicy.getProvider());
      System.out.println("Policyholder's First Name: " + userPolicy.getFirst());
      System.out.println("Policyholder's Last Name: " + userPolicy.getLast());
      System.out.println("Policyholder's Age: " + userPolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + userPolicy.getSmoker());
      System.out.println("Policyholder's Height: " + userPolicy.getHeight());
      System.out.println("Policyholder's Weight: " + userPolicy.getWeight());
      System.out.printf("Policyholder's BMI: %.2f", userPolicy.getBMI());
      System.out.printf("\nPolicy Price: $%.2f", userPolicy.getPrice());
   }
}