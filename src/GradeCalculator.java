public class GradeCalculator {
  private int pointTotal;
  private int earnedPoint;
  private double assignmentPercent;
  private double totalWeightgrade;

  public GradeCalculator(int totalPoint, int earnedPoint, double assignmentPercent) {
    this.pointTotal = totalPoint;
    this.earnedPoint = earnedPoint;
    this.assignmentPercent = assignmentPercent;
  }

  public int getTotalPoint() {
    return this.pointTotal;
  }

  public int getEarnedPoint() {
    return this.earnedPoint;
  }

  public double getAssignmentPercent() {
    return this.assignmentPercent / 100;
  }

  public void setPointTotal(int total_point) {
    this.pointTotal = total_point;
  }

  public void setEarnedPoint(int earned_point) {
    this.earnedPoint = earned_point;
  }

  public void setAssignmentPercent(double assignment_percent) {
    this.assignmentPercent = assignment_percent;
  }

  public double calTotalWeightGrade() {
    this.totalWeightgrade =  ((double) this.earnedPoint / this.pointTotal) * (this.assignmentPercent / 100) * 100;
    return this.totalWeightgrade;
  }
}
