package com.company.EffectiveJava;

import java.util.Objects;

public class AutoGenerate {
    private int a;
    private int b;


    public AutoGenerate(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoGenerate that = (AutoGenerate) o;
        return a == that.a &&
                b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "AutoGenerate{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
