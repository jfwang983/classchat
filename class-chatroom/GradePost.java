class GradePost extends TextPost {
  private double grade;

  public GradePost (String title, String desc, double grade) {
    super(title, desc);
    this.grade = grade;
  }

  public double getGrade() {
    return grade;
  } 
}