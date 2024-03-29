package ua.kpi.tef.ti71.util;

/**
 * {@link MutableInt} Is a class that wraps {int} basic type and
 *  provides an ability to work with integers as a mutable object.
 */
public class MutableInt {
    private int value;

    public MutableInt(int value) {
        this.value = value;
    }

    public void increment() { this.value++; }

    public void decrement() {
        this.value--;
    }

    public void set(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }

    public int getAsInt() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
