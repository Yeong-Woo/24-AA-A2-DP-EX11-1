package Visitor.interfaceVisitor;

interface ICarElement {
    abstract public void accept(ICarElementVisitor visitor);
}