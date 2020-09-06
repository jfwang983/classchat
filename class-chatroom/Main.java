import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class Main {
    public static ArrayList<Category> categories;
    
  public static void main(String[] args) {
    Announcements an = new Announcements();
    // Scanner sc = new Scanner(System.in);
    // System.out.println("input announcement title: ");
    // String anTitle = sc.nextLine();
    // System.out.println("input announcement description: ");
    // String anDesc = sc.nextLine();
    // an.add(anTitle, anDesc);
    // System.out.println("Announcements: ");
    // an.printAn(); 
    Assignments as = new Assignments();
    // System.out.println("input assignment title: ");
    // String asTitle = sc.nextLine();
    // System.out.println("input assignment description: ");
    // String asDesc = sc.nextLine();
    // System.out.println("input assignment grade: ");
    // double asGrade =  sc.nextDouble();
    // sc.nextLine();
    // as.add(asTitle, asDesc, asGrade);
    // System.out.println("Assignments: ");
    // as.printAs(); 
    Resources re = new Resources();
    // System.out.println("input resource title: ");
    // String reTitle = sc.nextLine();
    // System.out.println("input resource description: ");
    // String reDesc = sc.nextLine();
    // re.add(reTitle, reDesc);
    // System.out.println("Resources: ");
    // re.printRe();

    categories = new ArrayList<>();
    categories.add(an);
    categories.add(as);
    categories.add(re); 

    GUIManager guiMan = new GUIManager(categories);

    // while(sc.nextLine() != "done")
    // {

    // }
  }
}
