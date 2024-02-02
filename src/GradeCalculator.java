import java.math.BigDecimal;
import java.math.RoundingMode;

public class GradeCalculator {
  // Point Total
  private int pointTotal;
  // Earned Points
  private int earnedPoint;
  // Assignment Percentage
  private double assignmentPercent;
  // Total Weighted Grade
  private double totalWeightgrade;

  // Point Total, Earned Points and Assignment Percentage are required to input when start the GradeCalculator
  public GradeCalculator(int totalPoint, int earnedPoint, double assignmentPercent) {
    this.pointTotal = totalPoint;
    this.earnedPoint = earnedPoint;
    this.assignmentPercent = assignmentPercent;
  }
  // Get the current Point Total
  public int getTotalPoint() {
    return this.pointTotal;
  }
  // Get the current Earned Points
  public int getEarnedPoint() {
    return this.earnedPoint;
  }
  // Get the current Assignment Percentage, this method will transform the integer percent to the decimal percentage foramt
  public double getAssignmentPercent() {
    return this.assignmentPercent / 100;
  }
  // Update the Point Total
  public void setPointTotal(int total_point) {
    this.pointTotal = total_point;
  }
  // Update the Earned Points
  public void setEarnedPoint(int earned_point) {
    this.earnedPoint = earned_point;
  }
  // Update the Assignment Percentage
  public void setAssignmentPercent(double assignment_percent) {
    this.assignmentPercent = assignment_percent / 100;
  }

  public double calTotalWeightGrade() {
    BigDecimal value = new BigDecimal(((double) this.earnedPoint / this.pointTotal) * (this.assignmentPercent / 100) * 100);
    value = value.setScale(4, RoundingMode.HALF_UP);
    this.totalWeightgrade = value.doubleValue();
    return this.totalWeightgrade;
  }
}
