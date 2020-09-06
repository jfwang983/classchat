import java.util.ArrayList;

class Grades extends Category{
  public void add(String title, String desc, double grade) {
    GradePost g = new GradePost(title, desc, grade);
    itemList.add(g);
  }

  public void printGr() {
    for (int i = 0; i < itemList.size(); i++) {
      System.out.println(itemList.get(i).getTitle());
      System.out.println(itemList.get(i).getDesc());
    }
  }
}