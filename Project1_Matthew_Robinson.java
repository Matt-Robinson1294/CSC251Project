import java.util.Scanner;
import java.io.*;

public class Project1_Matthew_Robinson
{
   public static void main(String[] args)
   {
      //declare variables and create Scanner
      Scanner keyboard = new Scanner(System.in);
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      //ask the user for all input
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //create an instance of the Policy class using the input
      Policy userPolicy = new Policy(policyNumber,providerName,firstName,lastName,age,smokingStatus,height,weight);
      
      System.out.println("\nPolicy Number: " + userPolicy.getPolicyNumber());
      System.out.println("Provider Name: " + userPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + userPolicy.getFirstName());
      System.out.println("Policyholder's Last Name: " + userPolicy.getLastName());
      System.out.println("Policyholder's Age: " + userPolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + userPolicy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + userPolicy.getHeight() + " inches.");
      System.out.println("Policyholder's Weight: " + userPolicy.getWeight() + " pounds.");
      System.out.printf("Policyholder's BMI: %.2f", userPolicy.getBMI());
      System.out.printf("\nPolicy Price: $%.2f", userPolicy.getPrice());
   }
}