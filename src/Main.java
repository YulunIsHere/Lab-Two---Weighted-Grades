import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO code application logic here

    // Interaction with the user using Scanner class
    Scanner sc = new Scanner(System.in);
    // Using exitCode variable to control interaction mode
    boolean exitCode = false;

    System.out.println("Hi, welcome to use the GradeCalculator, Please pick an option and input the selected option:");
    System.out.println("Please input the assignment's (1) Point Total (2) Earned Points (3) Assignment Percentage");

    System.out.print("The assignment's Point Total (Please input Integer amount eg. 200): ");
    int totalPoint = sc.nextInt();
    System.out.print("The your Earned Points for the assignment (Please input Integer amount eg. 190): ");
    int earnedPoint = sc.nextInt();
    System.out.print("The assignment's Assignment Percentage (Please input amount with decimal eg. 40.5, 87.0): ");
    double assignmentPercent = sc.nextDouble();
    GradeCalculator gradeCalculator = new GradeCalculator(totalPoint, earnedPoint, assignmentPercent);
    
    while (!exitCode) {
      System.out.println("Input a to get this assignment's Total Weighted Grade");

      String input = sc.next();

      double res = gradeCalculator.calTotalWeightGrade();

      if (input.equals("a")) {
        System.out.println("Your Total Weighted Grade for this assignment is " + res);
        System.out.println("Please input exit to exit or input others for other options");
        String response = sc.next();
        if (response.equals("exit")) {
          exitCode = true;
        } else if (response.equals("others")) {
          System.out.println("Please pick an option: input b to edit Point Total / input c to edit Earned Points / input d to edit Assignment Percentage");
          input = sc.next();
        }
      }

      if (input.equals("b")) {
        totalPoint = gradeCalculator.getTotalPoint();
        System.out.println("This is your current Point Total: " + totalPoint);
        System.out.println("Please input the updated Point Total (Please input Integer amount eg. 100)");
        gradeCalculator.setPointTotal(sc.nextInt());
        totalPoint = gradeCalculator.getTotalPoint();
        System.out.println("This is your updated Point Total: " + totalPoint);
        res = gradeCalculator.calTotalWeightGrade();
        System.out.println("Your updated Total Weighted Grade for this assignment is " + res);
        exitCode = true;
      }

      if (input.equals("c")) {
        earnedPoint = gradeCalculator.getEarnedPoint();
        System.out.println("This is your current Earned Points: " + earnedPoint);
        System.out.println("Please input the updated Earned Points (Please input amount eg. 89)");
        gradeCalculator.setEarnedPoint(sc.nextInt());
        earnedPoint = gradeCalculator.getEarnedPoint();
        System.out.println("This is your updated Earned Points: " + earnedPoint);
        System.out.println("Your updated Total Weighted Grade for this assignment is " + gradeCalculator.calTotalWeightGrade());
        exitCode = true;
      }

      if (input.equals("d")) {
        assignmentPercent = gradeCalculator.getEarnedPoint();
        System.out.println("This is your current Assignment Percentage: " + assignmentPercent + " %");
        System.out.println("Please input the updated Assignment Percentage (Please input amount eg. 52.5)");
        gradeCalculator.setAssignmentPercent(sc.nextDouble());
        assignmentPercent = gradeCalculator.getAssignmentPercent();
        System.out.println("This is your updated Assignment Percentage: " + assignmentPercent + " %");
        System.out.println("Your updated Total Weighted Grade for this assignment is " + gradeCalculator.calTotalWeightGrade());
        exitCode = true;
      }
    }
  }
}
