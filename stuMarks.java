import java.util.Scanner;
public class StuMarks 
{
 public static void main(String[] args) 
 {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of subjects: ");
  int numberOfSub = scanner.nextInt();
  int[] marks = new int[numberOfSub];
  System.out.println("Enter the marks obtained in each subject out of 100:");
  for (int i = 0; i < numberOfSub; i++) 
  {
   System.out.print("Marks in subject " + (i + 1) + ": ");
   marks[i] = scanner.nextInt();
  }
  int total_Marks = 0;
  for (int mark : marks) 
  {
   total_Marks += mark;
  }
  double avgPercentage = (double) total_Marks / numberOfSub;
  char grade;
        if (avgPercentage >= 90) 
        {
         grade = 'A';
        }
        else if (avgPercentage >= 80)
        {
         grade = 'B';
        }
        else if (avgPercentage >= 70)
        {
         grade = 'C';
        } 
        else if (avgPercentage >= 60) 
        {
         grade = 'D';
        }
        else
        {
         grade = 'F';
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total_Marks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}