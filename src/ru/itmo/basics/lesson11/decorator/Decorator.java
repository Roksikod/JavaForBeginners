package ru.itmo.basics.lesson11.decorator;

public abstract class Decorator implements Component {
    protected Component component;

    protected Decorator(Component c) {
        component = c;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}