public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Shrimayi";
        s1.rollno = 256;

        System.out.println("This is Default Constructor: ");
        System.out.println("Name: " +s1.name);
        System.out.println("Roll Number: "+s1.rollno);
        
        Student s2 = new Student();
        
        s2.name = "Swarali";
        s2.rollno = 298;
        System.out.println("-----------------------------------------");
        System.out.println("This is Parameterized Constructor");
        System.out.println("Name: " +s2.getname());
        System.out.println("Roll Number: " +s2.getrollno());
        
        
    }
}

//Default Constructor 
class Student  {
    String name;
    int rollno;

    Student() {
        name = "NULL";
        rollno = 0;
    }
    
    
//Parameterized Constructor

Student(String name , int rollno) {
    this.name = name;
    this.rollno = rollno;
    
}
    void setname(String name) {
        this.name = name;
    }
    
    void setrollno(int rollno) {
        this.rollno = rollno;
    }
    
    String getname() {
        return this.name;
    }
    
    int getrollno() {
        return this.rollno;
    }
    
}

