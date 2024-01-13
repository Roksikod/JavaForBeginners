package ru.itmo.basics.lesson11.prototype;

import java.util.Map;

public class Phonebook implements Copyable {
    private Map<String, Long> namesAndNums;

    public Phonebook(Map<String, Long> namesAndNums) {
        this.namesAndNums = namesAndNums;
    }

    public void setNamesAndNums(Map<String, Long> namesAndNums) {
        this.namesAndNums = namesAndNums;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "namesAndNums=" + namesAndNums +
                '}';
    }

    @Override
    public Object copy() {
        return new Phonebook(this.namesAndNums);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
