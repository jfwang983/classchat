import java.util.ArrayList;

class Category {
  public ArrayList<TextPost> itemList;
  private boolean visible = false;

  public Category() {
    itemList = new ArrayList<TextPost>();
  }

  public void add(String title, String desc) {
    TextPost t = new TextPost(title, desc);
    itemList.add(t);
  }

  public void setVisible(boolean visible) {
    this.visible = visible;
  }

  public boolean getVisible(boolean visible) {
    return visible;
  }
}