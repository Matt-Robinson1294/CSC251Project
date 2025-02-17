public class Policy
{
   //create each field
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokerStatus;
   private double height;
   private double weight;
   private double bmi;
   
   //create no-arg constructor
   public Policy()
   {
      policyNumber = 0000;
      providerName = "unknown";
      firstName = "unknown";
      lastName = "unknown";
      age = 18; //minimum age of policy holder
      smokerStatus = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }
   
   //create constructor that accepts arguments
   public Policy(int num, String provider, String first, String last, int age, String smoker, double h, double w)
   {
      policyNumber = num;
      providerName = provider;
      firstName = first;
      lastName = last;
      age = age;
      smokerStatus = smoker;
      height = h;
      weight = w;
   }
   
   //create mutator methods for each field
   public void setNumber(int num)
   {
      policyNumber = num;
   }
   
   public void setProvider(String provider)
   {
      providerName = provider;
   }
   
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   public void setLastName(String last)
   {
      lastName = last;
   }
   
   public void setAge(int age)
   {
      age = age;
   }
   
   public void setSmoker(String smoker)
   {
      smokerStatus = smoker;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   //create accessor methods for each field
   
   public int getNumber()
   {
      return policyNumber;
   }
   
   public String getProvider()
   {
      return providerName;
   }
   
   public String getFirst()
   {
      return firstName;
   }
   
   public String getLast()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmoker()
   {
      return smokerStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   //create a method to calculate and return BMI
   public double getBMI()
   {
      double bmi = (weight * 703.0) / (height * height);
      return bmi;
   }
   
   //create a method to calculate and return price of the policy
   public double getPrice()
   {
      double baseFee = 600.0;
      double policyCost;
      getBMI();
      double ageFee;
      if(age>50)
      {
         ageFee = 75.0;
      }
      else
      {
         ageFee = 0.0;
      }
      double smokerFee;
      if(smokerStatus.equals("smoker"))
      {
         smokerFee = 100.0;
      }
      else
      {
         smokerFee = 0.0;
      }
      double bmiFee;
      if(bmi>35)
      {
         bmiFee = ( bmi - 35 ) * 20;
      }
      else
      {
         bmiFee = 0.0;
      }
      policyCost = baseFee + ageFee + smokerFee + bmiFee;
      return policyCost;
   }
}