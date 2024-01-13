package ru.itmo.basics.lesson11.decorator;

public class DecoratorSpace extends Decorator{
    public DecoratorSpace(Component c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}