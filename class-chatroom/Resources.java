import java.util.ArrayList;

class Resources extends Category{
  public void printRe() {
    for (int i = 0; i < itemList.size(); i++) {
      System.out.println(itemList.get(i).getTitle());
      System.out.println(itemList.get(i).getDesc());
    }
  }
}