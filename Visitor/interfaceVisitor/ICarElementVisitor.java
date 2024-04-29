package Visitor.interfaceVisitor;

interface ICarElementVisitor {
    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);

    void visit(Trunk trunk);
}