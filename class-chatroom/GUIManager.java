import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUIManager {
  public String courseName;
  public int selectedCategory;
  
  ArrayList<Category> categ;

  JFrame window;
  JPanel categories, posts;
  JLabel courseNameLabel, peopleLabel;
  JTextArea information;
  JButton addPostButton;
  //refresh Jpanel when set visible
  
  static boolean popUpIsOpen;

  public GUIManager(ArrayList<Category> cat)
  {
    categ = cat;  
          
    window = new JFrame();
    window.setSize(2000, 1000);
    window.setTitle(courseName);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new BorderLayout());

    categories = new JPanel();
    categories.setBackground(Color.white);

    window.add(categories, BorderLayout.NORTH);

    posts = new JPanel(new GridLayout(15, 1));
    //posts.setComponentOrientation(ComponentOrientation.UP_AND_DOWN);
    window.add(posts, BorderLayout.WEST);
    
    addPostButton = new JButton("Add Post");
    posts.add(addPostButton);
    ListenForButton li = new ListenForButton();
    addPostButton.addActionListener(li);

    information = new JTextArea(5, 20);
    information.setEditable(true);

    JScrollPane scrollPane = new JScrollPane(information);


    window.add(scrollPane, BorderLayout.CENTER);

    for (Category c : cat)
    {
      JButton b = new JButton(c.getClass().getName());
      categories.add(b);
      ListenForButton l = new ListenForButton();
      b.addActionListener(l);
    }

    window.setVisible(true);
  }
  
  public void makeNewPost(String title, String description)
  {
    categ.get(selectedCategory).add(title, description);
    JButton b = new JButton(title);
    posts.add(b);
    window.revalidate();
    window.repaint();
  }


  public class ListenForButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

          
          if (((JButton)e.getSource()).getText().equals("Announcements")) selectedCategory = 0;
          else if(((JButton)e.getSource()).getText().equals("Assignments")) selectedCategory = 1;
          else if(((JButton)e.getSource()).getText().equals("Resources")) selectedCategory = 2;
          else if(((JButton)e.getSource()).getText().equals("Grades")) selectedCategory = 3;
          else if(((JButton)e.getSource()).getText().equals("Add Post"))
          { 
            String title = JOptionPane.showInputDialog(null, "Enter title.", "Add Post", 0);
            String desc = JOptionPane.showInputDialog(null, "Enter description.", "Add Post", 0);
            makeNewPost(title, desc);
          }
          else 
          {
              ArrayList<TextPost> a = (categ.get(selectedCategory)).itemList;
              information.append(((JButton)e.getSource()).getText());
              //System.out.println("fnaf");
              TextPost p = null;
              for (TextPost t : a)
              {
                //System.out.println(t.getTitle());
                if ((t.getTitle()).equals (((JButton)e.getSource()).getText()))
                {
                    p = t;
                    break;
                }
              }
              
              //information. selectAll();
              //information. replaceSelection(""); 
              information.append(p.getDesc());
          }
          String buttonText = ((JButton)e.getSource()).getText();
          
          System.out.println(buttonText);
          
          //System.out.println((categ.get(selectedCategory).itemList).get(0).getDesc());
          
          //System.out.println (selectedCategory);
          
          //System.out.println(buttonText);
          
          
        }
    }
}