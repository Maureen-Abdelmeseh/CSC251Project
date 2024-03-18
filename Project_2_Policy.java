public class Project_2_Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   //no arg constructors
   public Project_2_Policy()
   {
      policyNumber = "N/A";
      providerName = "N/A";
      firstName = "N/A";
      lastName = "N/A";
      age = 0;
      smokingStatus = "N/A";
      height = 0;
      weight = 0;
   }
   /*
   this method is another step to make sure there are no stagnant data
   @param pNumber the policy number
   @param pName the Provider Name
   @param fName the first name 
   @param lName the last name
   @param a the age of the Provider
   @param sStatus the smoking statuse. either smoker or non-smoker
   @param h the height of the Provider
   @param w the weight of the Provider
   */
   public Project_2_Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //setters//

   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }

   
   //getters//
   
   public String getPolicyNumber()
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
   
      
   /*
   Calculates the Policyholder's BMI
   @param h the height of the Provider
   @param w the weight of the Provider
   @param CONVFACTOR a constant for calculating the BMI
   @return the BMI that was calsulated with Policyholder's height, weight and CONVFACTOR
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /*
   Calculates the Policy's price
   @param BASE_PRICE the price the provider gets if they don't have any of the requirments that raises the price
   @param ADDITIONAL_FEE_AGE added fee if the their age is upove 50
   @param ADDITIONAL_FEE_SMOKING added fee if they are a smoker
   @param ADDITIONAL_FEE_PER_BMI added fee if their BMI is higher than 35
   @param AGE_THRESHOLD if the age is upove 50, the ADDITIONAL_FEE_AGE will be charged 
   @param BMI_THRESHOLD if the BMI is upve 35, the ADDITIONAL_FEE_AGE will be charged
   @return the price calculated based on the requirements specified
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }

}