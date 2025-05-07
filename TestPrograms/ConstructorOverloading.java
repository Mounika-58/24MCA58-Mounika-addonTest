package TestPrograms;

public class ConstructorOverloading {
    private int length;
    private int breadth;

    // Default constructor
    public ConstructorOverloading() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    public ConstructorOverloading(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + area());
    }

  
    public static void main(String[] args) {
        ConstructorOverloading rect1 = new ConstructorOverloading();        // Default constructor
        ConstructorOverloading rect2 = new ConstructorOverloading(5, 10);   // Parameterized constructor

        System.out.println("Rectangle 1:");
        rect1.display();

        System.out.println("Rectangle 2:");
        rect2.display();
    }
}
