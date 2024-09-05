class Cat{
    String name;
    int age;
    // Constructor overloading
    // A default constuctor
    Cat(){}
    //one more consructor
    Cat(String n){
        name = n;
    }
    //a default constructor -> Triggered upon creatinng an instance of Cat class
   /* Cat()
    {
        System.out.println("Hey you created a new instance of this class");
    }*/
    // A parametric constructor
    Cat(String n,int a){
        name = n;
        age = a;
    }
    void printCatDetails()
    {
        System.out.println("Name is: "+name);
        System.out.println("Age is :"+age);
    }
}
public class ExampleCat3 {
    public static void main(String[] args) {
        
   /* Cat c1 = new Cat("Bob",7);
    c1.printCatDetails();
    Cat c2 = new Cat("Stella",4);
    c2.printCatDetails();
    Cat c3 = new Cat("Richard",2);
    c3.printCatDetails();*/
    Cat c1 = new Cat();
    c1.printCatDetails();
    Cat c2 = new Cat("Stella");
    c2.printCatDetails();
    Cat c3 = new Cat("Richard",2);
    c3.printCatDetails();
    }

    
}