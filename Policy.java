public class Policy
{
   //create each field
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //create no-arg constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   //create constructor that accepts arguments
   /**
      @param pNumber The policy number
      @param pName The policy provider's name
      @param first The first name of the policyholder
      @param last The last name of the policyholder
      @param a The age of the policyholder
      @param sStatus The smoking status of the policyholder
      @param h The height of the policyholder
      @param w The weight of the policyholder
   */
   public Policy(String pNumber, String pName, String first, String last, int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //create mutator methods for each field
   /**
      @param pNumber The policy number
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
      @param pName The policy provider's name
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   /**
      @param first The first name of the policyholder
   */
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   /**
      @param last The last name of the policyholder
   */
   public void setLastName(String last)
   {
      lastName = last;
   }
   
   /**
      @param a The age of the policyholder
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
      @param sStatus The smoking status of the policyholder
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
      @param h The height of the policyholder
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      @param w The weight of the policyholder
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   //create accessor methods for each field
   /**
      @return policyNumber The number of the policy
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      @return providerName The name of the provider
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      @return firstName The first name of the policyholder
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      @return lastName The last name of the policyholder
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      @return age The age of the policyholder
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      @return smokingStatus The smoking status of the policyholder
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
      @return height The height of the policyholder
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      @return weight The weight of the policyholder
   */
   public double getWeight()
   {
      return weight;
   }
   
   //create a method to calculate and return BMI
   /**
      @return The calculated BMI of the policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR) / (height * height);
   }
   
   //create a method to calculate and return price of the policy
   /**
      return price The final cost of the policy after fees are added if needed
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600.0;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //if policymember is over 50
      {
         price += ADDITIONAL_FEE_AGE;
      }
      
      if(smokingStatus.equalsIgnoreCase("smoker")) //if policymember is a smoker
      {
         price += ADDITIONAL_FEE_SMOKING;
      }
      
      if(getBMI() > BMI_THRESHOLD) //if policymember BMI is over 35
      {
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
      }
      
      return price;
   }
}