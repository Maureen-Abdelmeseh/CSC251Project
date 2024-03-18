
import java.util.Scanner;
import java.io.*;

public class Project_2_Demo 
{   
   public static void main(String[] args) throws IOException
   {
      //declare variables
      // change: had to initialize the variables
      String policyNumber = "N/A";
      String providerName = "N/A";
      String firstName = "N/A";
      String lastName = "N/A";
      int age = 0;
      String smokingStatus = "N/A";
      double height = 0.0;
      double weight = 0.0;
      int smoker = 0;
      int noneSmoker = 0; 
      // change: has to add a file object to access the file
      File file = new File("PolicyInformation.txt");
      // change: put a validation 
      if(!file.exists())
      {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      // change: the system.in to file
      Scanner inputFile = new Scanner(file);
      
      
      // change: creat a while loop to read all the inputs from the file
      while (inputFile.hasNext())
      {
      // change: removed the prompt from inputd 
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         // change: add line clearers with if ststments to read the file correctly 
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
         // change: add count for the numbers of smokers and non-smokers 
         if (smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            noneSmoker ++;
         }
         else
         {
            smoker ++;
         }
      
      //create a Policy object
      // change: had to be moved inside the while loop
      Project_2_Policy policy = new Project_2_Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      //put a blank line before the output
      // change: had to be moved inside the while loop
      System.out.println();
      
      //display information about the Policy
      // change: had to be moved inside the while loop
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
      // change: added print outs for the new asked for data 
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + smoker);
      System.out.println("The number of policies with a non-smoker is:  " + noneSmoker);
      }
      // change: to close the file
      inputFile.close();
   }
   
}