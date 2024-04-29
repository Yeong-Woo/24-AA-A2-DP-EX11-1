package Visitor.interfaceVisitor;

class CarElementDestroyVisitor implements ICarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("Fire my " + wheel.getName() + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Eat my engine");
    }

    public void visit(Body body) {
        System.out.println("Crash my body");
    }

    public void visit(Car car) {
        System.out.println("Sell my car");
    }
}