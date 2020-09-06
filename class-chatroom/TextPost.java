class TextPost {
  private String title;
  private String desc;

  public TextPost (String title, String desc) {
    this.title = title;
    this.desc = desc;
  }

  public String getTitle () {
    return title;
  }

  public String getDesc() {
    return desc;
  }

  public double getGrade() {
    return 0;
  } 
}