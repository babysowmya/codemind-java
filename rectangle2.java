class Rectangle{
    int length,breadth; //Instance variables
    void setLengthAndBreadth(int l,int b)
    {
        length = l;
        breadth = b;
    }
    void printAreaAndPerimeter()
    {
        System.out.println("Area is:"+(length+breadth));
        System.out.println("Perimeter is:"+(2*(length+breadth)));
    }
}
public class rectangle2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLengthAndBreadth(4,7);
        r1.printAreaAndPerimeter();

        Rectangle r2 = new Rectangle();
        r2.setLengthAndBreadth(10,20);
        r2.printAreaAndPerimeter();
    }
}
