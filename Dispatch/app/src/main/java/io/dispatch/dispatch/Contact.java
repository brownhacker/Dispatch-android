package io.dispatch.dispatch;

/**
 * Created by Daniel on 5/16/2015.
 */
public class Contact {
    private final String name;
    private final String number;

    public Contact(final String name, final String number) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, number);
    }
}