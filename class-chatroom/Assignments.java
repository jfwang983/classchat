import java.util.ArrayList;

class Assignments extends Category{
  public void add(String title, String desc, double grade) {
    GradePost g = new GradePost(title, desc, grade);
    itemList.add(g);
  }

  public void printAs() {
    for (int i = 0; i < itemList.size(); i++) {
      System.out.println(itemList.get(i).getTitle());
      System.out.println(itemList.get(i).getDesc());
    }
  }
}