package ru.itmo.basics.lesson11.decorator;

public class DecoratorComma extends Decorator{
    public DecoratorComma(Component c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}
