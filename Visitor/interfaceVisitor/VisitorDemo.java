package Visitor.interfaceVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ICarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
        car.accept(new CarElementDestroyVisitor());
    }
}