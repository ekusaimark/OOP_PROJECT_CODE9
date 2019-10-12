package org.iuea.oop.modal;

import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.iuea.oop.views.LoginView;

public class Student extends JFrame{
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int courseId;

    public Student() {
    //JFrame mm = new JFrame();.......another method to design a JfFrame
        //mm.setSize(500,400);
      //mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //mm.setVisible(true);
      this.setSize(650,450);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes entire run program
      this.setLocation(450,200);
      
      //creating action menu
      JMenuItem item1= new JMenuItem("run");
      JMenuItem item2= new JMenuItem("inspect");
      JMenuItem item3= new JMenuItem("Logout");
      
      item3.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               setVisible(false);
             new LoginView().setVisible(true);
          }
        
      } );
      JMenu action= new JMenu("Action");  //holds items listed
      action.add(item1);
      action.add(item2);
      action.add(item3);
      
      
       //creating Help menu
       JMenuItem item4= new JMenuItem("shortcuts");
       JMenuItem item5 = new JMenuItem("anything");
       JMenu help = new JMenu("Help");
       help.add(item4);
       help.add(item5);
       
                    
      JMenuBar menu = new JMenuBar();// adding to the Menu bar
      menu.add(action);
      menu.add(help);
      
      //creating a left navigation panel
      JPanel leftNav = new JPanel();
      leftNav.setLayout(null);
      
      //creating buttons on the navigation pane
      JButton std = new JButton("Students");
      std.setBounds(0,0,100,30);   //for button meaurements
      leftNav.add(std);
      
      //students panel
      JPanel studentsPanel = new JPanel();
      studentsPanel.setBackground(Color.white);
      studentsPanel.setLayout(null);
      studentsPanel.setBounds(100,0,530,450);
      
      
      //buttons for the students panel.........
      JButton add = new JButton("Add");
      add.setBackground(Color.green);
       add.setForeground(Color.white);
      add.setBounds(30,30,100,30);
      
      JButton edit = new JButton("Edit");
      edit.setBackground(Color.orange);
      edit.setForeground(Color.white);
      edit.setBounds(160,30,100,30);
      
      JButton delete = new JButton("Delete");
      delete.setForeground(Color.white);
      delete.setBackground(Color.red);
      delete.setBounds(290,30,100,30);
      
      
           //TABLE FOR INSERTING DUMMY DATA
      JPanel tablePanel = new JPanel();
      tablePanel.setBackground(Color.white);
      tablePanel.setBounds(20,80,500,300);
      JTable table = new JTable();
      Object[] columns = {"First Name","Last Name","Sex","Course","Registration","Date of birth"};
      table.setBackground(Color.white);
      //creating the table model here
      DefaultTableModel model = new DefaultTableModel();
      model.setColumnIdentifiers(columns);
      //Addition of modals to the table
      table.setModel(model);
      Object rowData [] = new Object[6];
     // rowData [0] = "me";
     //addition of row data 
      //model.addRow(rowData);
      JScrollPane tablePane = new JScrollPane();
      //tablePane.setBounds(0,80,350,200);
      tablePane.getViewport().add(table);
      tablePanel.add(tablePane);
      
      // students form to insert data
      JPanel studentsForm = new JPanel();
     studentsForm.setLayout(null);
      studentsForm.setBounds(20,20,500,300);
      studentsForm.setBackground(Color.WHITE);
      JLabel FnameLabel = new JLabel("First Name:");
      FnameLabel.setBounds(20,30,100,30);
      JTextField FName = new JTextField();
      FName.setBounds(110,30,200,25);
      JLabel LnameLabel = new JLabel("Last Name:");
      LnameLabel.setBounds(20,60,100,30);
      JTextField LName = new JTextField();
      LName.setBounds(110,60,200,25);
      JLabel SexLabel = new JLabel("Sex:");
      SexLabel.setBounds(20,90,100,30);
      String[] options = {"M","F"};
      JComboBox Sex = new JComboBox(options);
      Sex.setBounds(110,90,200,25);
      JLabel courseLabel = new JLabel("Course:");
      courseLabel.setBounds(20,120,100,30);
      JTextField course = new JTextField();
      course.setBounds(110,120,200,25);
       JLabel regLabel = new JLabel("Registration");
      regLabel.setBounds(20,150,100,30);
      JTextField reg = new JTextField();
      reg.setBounds(110,150,200,25);
      JLabel dobLabel = new JLabel("Date of Birth:");
      dobLabel.setBounds(20,180,100,30);
      JDateChooser dob = new JDateChooser();
      dob.setBounds(110,180,200,25);
      
      JButton submit = new JButton("Submit");
      submit.setBounds(90,250,100,25);
      submit.setBackground(Color.green);
      submit.setForeground(Color.white);
      
      JButton cancel = new JButton("Cancel");
      cancel.setBounds(280,250,100,25);
      cancel.setBackground(Color.red);
      cancel.setForeground(Color.white);
      
      studentsForm.add(FnameLabel);
      studentsForm.add(FName);
      studentsForm.add(LnameLabel);
      studentsForm.add(LName);
      studentsForm.add(SexLabel);
      studentsForm.add(Sex);
      studentsForm.add(courseLabel);
      studentsForm.add(course);
      studentsForm.add(regLabel);
      studentsForm.add(reg);
      studentsForm.add(dobLabel);
      studentsForm.add(dob);
      studentsForm.add(submit);
      studentsForm.add(cancel);
      //adding buttons to studentspanel
      studentsPanel.add(add);
      studentsPanel.add(edit);
      studentsPanel.add(delete);
      studentsPanel.add(tablePanel);
      //studentsPanel.add(studentsForm);
      
     
      leftNav.add(studentsPanel);
      
      JButton crs = new JButton("Course");
      crs.setBounds(0,30,100,30);
      leftNav.add(crs);
      //course panel
      JPanel crsPanel = new JPanel();
      crsPanel.setBackground(Color.blue);
      crsPanel.setLayout(null);
      crsPanel.setBounds(100,0,400,350);
      leftNav.add(crsPanel);
     
      JButton crsu= new JButton("Course Units");
      crsu.setBounds(0,60,100,30);
      leftNav.add(crsu);
      //courseunit panel
      JPanel crsuPanel = new JPanel();
      crsuPanel.setBackground(Color.pink);
      crsuPanel.setLayout(null);
      crsuPanel.setBounds(100,0,400,350);
      leftNav.add(crsuPanel);
    
      JButton lec = new JButton("Lecturers");
      lec.setBounds(0,90,100,30);
      leftNav.add(lec);
      JPanel lecPanel = new JPanel();
      lecPanel.setBackground(Color.orange);
      lecPanel.setLayout(null);
      lecPanel.setBounds(100,0,400,350);
      leftNav.add(lecPanel);
     
      
      //EVENTS FOR PANEL NAVIGATIONS
      
      std.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              studentsPanel.setVisible(true);
              crsPanel.setVisible(false);
              crsuPanel.setVisible(false);
              lecPanel.setVisible(false);
          }
          });
          
       crs.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              studentsPanel.setVisible(false);
              crsPanel.setVisible(true);
              crsuPanel.setVisible(false);
              lecPanel.setVisible(false);
          }
          
          
      });
         
        crsu.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              studentsPanel.setVisible(false);
              crsPanel.setVisible(false);
              crsuPanel.setVisible(true);
              lecPanel.setVisible(false);
          }
         });
        
         lec.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              studentsPanel.setVisible(false);
              crsPanel.setVisible(false);
              crsuPanel.setVisible(false);
              lecPanel.setVisible(true);
          }
         });
          
          submit.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
             
              add.setVisible(true);
              edit.setVisible(true);
              delete.setVisible(true);
              rowData[0] = FName.getText();
              rowData[1] = LName.getText();
              rowData[2] = Sex.getSelectedItem();
              rowData[3] = course.getText();
              rowData[4] = reg.getText();
              rowData[5] = dob.getDate();
              model.addRow(rowData);
               tablePanel.setVisible(true);
              studentsForm.setVisible(false);
              studentsPanel.add(tablePanel);
          }
         });
        
             cancel.addActionListener(newActionListener(){
             @override
             public void actionPerformed(ActionEvent e){
                 tablePanel.setVisible(true);
                 studentsForm.setVisible(false);
                 add.setvisible(true);
                 edit.setVsible(true);
                 delete.setVisible(true);
             }
          });
          
          add.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              tablePanel.setVisible(false);
              studentsForm.setVisible(true);
              studentsPanel.add(studentsForm);
              add.setVisible(false);
              edit.setVisible(false);
              delete.setVisible(false);
          }
         });
        
        
                 
      //creating footer panel
      JPanel footer = new JPanel();
      footer.setBackground(Color.white);
      JLabel footerLabel = new JLabel("Copy right Code9 2019");
      footer.add(footerLabel);
      
      this.setJMenuBar(menu);
      this.add(leftNav);
     this.add(footer, BorderLayout.SOUTH);
      this.setVisible(true);
    }
    public Student (String name){
    //this.name = name;
    }
    public static void main(String [] args){
        Student s = new Student();
    
    }
    

    public Student(int id, String firstName, String lastName, String email, int courseId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

  

}
