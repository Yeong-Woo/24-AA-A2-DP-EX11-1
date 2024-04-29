package Visitor.interfaceVisitor;

public class Trunk implements ICarElement {
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
