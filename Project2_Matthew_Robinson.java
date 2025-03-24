import java.util.Scanner;
import java.io.*;

public class Project2_Matthew_Robinson
{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
   public static void main(String[] args)
=======
   public static void main(String[] args) throws IOException
>>>>>>> Stashed changes
=======
   public static void main(String[] args) throws IOException
>>>>>>> Stashed changes
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int smokerY = 0, smokerN = 0;
      
      //open file and create scanner for it
      File file = new File("PolicyInformation.txt");
      
      if(!file.exists())
      {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
      
      //use a loop to process contents of the file
      while(inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         if(smokingStatus.equalsIgnoreCase("smoker"))
         {
            smokerY += 1;
         }
<<<<<<< Updated upstream
<<<<<<< Updated upstream
         if(smokingStatus.!equalsIgnoreCase("non-smoker"))
=======
         if(smokingStatus.equalsIgnoreCase("non-smoker"))
>>>>>>> Stashed changes
=======
         if(smokingStatus.equalsIgnoreCase("non-smoker"))
>>>>>>> Stashed changes
         {
            smokerN += 1;
         }
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
      }
=======
=======
>>>>>>> Stashed changes
         System.out.println("\n");
      }
      
      System.out.println("\nThe number of policies with a smoker is: " + smokerY);
      System.out.println("The number of policies with a non-smoker is: " + smokerN);
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
   }
}