import java.util.ArrayList;

class Announcements extends Category{
  public void printAn() {
    for (int i = 0; i < itemList.size(); i++) {
      System.out.println(itemList.get(i).getTitle());
      System.out.println(itemList.get(i).getDesc());
    }
  }
}