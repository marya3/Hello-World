import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;
class Student
{
  private String name;
  private int age;
  public Student(String n, int a)
  {
    name = n;
    age = a;
  }

  public String getName()
  {
    return name;
  }
  public int getage()
  {
    return age;
  }

}
class StudentList
{
  private ArrayList<Student> StudentListArray = new ArrayList<>();
  private Scanner scanString;
  private String stringName;
  private int intAge;
  ListIterator<Student> it = StudentListArray.listIterator();

  public void addStudent()
  {
    //StudentListArray = new ArrayList<>();
    System.out.println("enter student name");
    scanString = new Scanner(System.in);
    stringName = scanString.next();
    System.out.println("enter student Age");
    scanString = new Scanner(System.in);
    String s = scanString.next();
    intAge = Integer.parseInt(s);
    Student obj = new Student(stringName,intAge);
    StudentListArray.add(obj);

  }
  public void viewFirst()
  {
    if (it == null){ it = StudentListArray.listIterator();
      {
        if (it.hasNext())
        {
        Student st = it.next();
        System.out.println("Student Name "+st.getName());
        System.out.println("Student age " +st.getage());
        }
      }
  }
    System.out.println("First Student Name "+StudentListArray.get(0).getName());
    System.out.println("First Student age " +StudentListArray.get(0).getage());
  }
  public void viewNext()
  {
    if(it == null){System.out.println("pointing to null");}
    if (it.hasNext())
    {
      System.out.println("inside hasNext "+ it.nextIndex());
      Student st = it.next();
      System.out.println("Student Name "+st.getName());
      System.out.println("Student age " +st.getage());
    }
  }
  public void viewAll()
  {
    it = StudentListArray.listIterator();
    while(it.hasNext())
    {

      System.out.println("inside viewall "+ it.nextIndex());
      Student st = it.next();
      System.out.println("Student Name "+st.getName());
      System.out.println("Student age " +st.getage());
    }
  }
  public void viewPrev()
  {
    System.out.println("First Student Name "+StudentListArray.get(0).getName());
    System.out.println("First Student age " +StudentListArray.get(0).getage());
  }
  public void removeS()
  {

  }
}
class TestArray
{
  public static void main(String[] args)
  {
    Scanner scanString;
    String stringName;
    int intAge;
    System.out.println("Press 1 to add");
    System.out.println("Press 2 to view first Student details");
    System.out.println("Press 3 to view next");
    System.out.println("Press 4 to view previous");
    System.out.println("Press 5 to remove current");
    System.out.println("Press 6 to view all");
    System.out.println("Press N to exit");
    scanString = new Scanner(System.in);
    String userInput = scanString.next();
    StudentList obj = new StudentList();


    while (!(userInput.equals("N")))
    {

      switch (userInput) {
        case "1": obj.addStudent();break;
        case "2": obj.viewFirst();break;
        case "3": obj.viewNext();break;
        case "4": obj.viewPrev();break;
        case "5": obj.removeS();break;
        case "6": obj.viewAll();break;

      }
      System.out.println("What next");
      scanString = new Scanner(System.in);
      userInput = scanString.next();
      System.out.println(userInput);
    }
  }
}
