public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public Policy ()
   {
      this.policyNumber = -999;
      this.providerName = "N/A";
      this.firstName = "N/A";
      this.lastName = "N/A";
      this.age = -1;
      this.smokingStatus = "N/A";
      this.height = -1.0;
      this.weight = -1.0;
   }
   
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   
   public int setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   
   public String setProviderName(String providerName)
   {
      this.providerName = providerName;
   }


   public String setFirstName(String firstName)
   {
      this.firstName = firstName;
   }


   public String setLastName(String lastName)
   {
      this.lastName = lastName;
   }


   public int setAge(int age)
   {
      this.age = age;
   }


   public String setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }


   public double setHeight(double height)
   {
      this.height = height;
   }


   public double setWeight(double weight)
   {
      this.weight = weight;
   }

   
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   
   public String getProviderName()
   {
      return providerName;
   }


   public String getFirstName()
   {
      return firstName;
   }


   public String getLastName()
   {
      return lastName;
   }


   public int getAge()
   {
      return age;
   }


   public String getSmokingStatus()
   {
      return smokingStatus;
   }


   public double getHeight()
   {
      return height;
   }


   public double getWeight()
   {
      return weight;
   }
   
   
   public double BMICalculation()
   {
      return  (weight * 703 ) / (height * height);
   }
   
   
   public double insurancePrice()
   {
      double baseFee = 600;
      double additionalFee = 0;
      double BMI = BMICalculation();
      
      if (age > 50)
      {
         additionalFee += 75;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         additionalFee += 100;
      }
      
      if (BMI > 35)
      {
         additionalFee = ( BMI - 35 ) * 20;
      }
      
      return baseFee + additionalFee;
   }
}

