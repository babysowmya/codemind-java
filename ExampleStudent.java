class Student{
    String rollNumber,name,gender;
    int age,passOutYear;
    double cgpa;
    void setAllValues(String roll,String n,String g,int a,int p,double c)
    {
        rollNumber = roll;
        name = n;
        gender = g;
        age = a;
        passOutYear = p;
        cgpa = c;
    }
    void printStudentDetails()
    {
        System.out.println("RollNumber:"+rollNumber);
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Pass out Year:"+passOutYear);
        System.out.println("CGPA:"+cgpa);
    }
}
public class ExampleStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAllValues("23P31A4444", "sowmya", "female", 18, 2027, 8.81);
        s1.printStudentDetails();
        Student s2 = new Student();
        s2.setAllValues("23P31A4434", "neeraja", "female", 18, 2027, 9.2);
        s2.printStudentDetails();

    }
}
