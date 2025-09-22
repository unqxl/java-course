package Classes;

import java.util.Objects;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public String get(int index) {
        return array[index];
    }

    public void add(String el) {
        array[size] = el;
        size++;

        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }

        array[size] = null;
        size--;
    }

    public void remove(String el) {
        for (int i = 0; i < size; i++) {
            if (el.equals(array[i])) {
                remove(i);
                break;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
