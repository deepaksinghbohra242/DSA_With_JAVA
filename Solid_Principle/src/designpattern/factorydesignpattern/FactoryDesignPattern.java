package designpattern.factorydesignpattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape obj = shapeFactory.getShape("Circle");
        obj.draw();
    }
}