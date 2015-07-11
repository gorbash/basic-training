package com.mot.training.examplePackage;

/**
 * Created by gorbash on 11.07.15.
 */
public class ExampleObject {

    private int field;

    public ExampleObject() {
        this(0);
    }

    public ExampleObject(int field) {
        this.field = field;
        System.out.println("Created ExampleObject " + this.field);
    }

    public void setField(int field) {
        this.field = field;
    }

    public void doSomething() {
        System.out.println("ExampleObject " + this.field + " doing something");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExampleObject that = (ExampleObject) o;

        return field == that.field;

    }

    @Override
    public int hashCode() {
        return field;
    }


    @Override
    public String toString() {
        return "ExampleObject{" +
                "field=" + field +
                '}';
    }
}
