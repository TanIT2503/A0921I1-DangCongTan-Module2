package ss9_list.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
        }
    }

    public E remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
        }
        return (E) elements;
    }

    public int size(){
        return size;
    }

    public E clone(){
        Object arrayTemp[]=new Object[size];
        for (int i=0; i<size; i++){
            arrayTemp[i]=elements[i];
        }
        return (E) arrayTemp;
    }

    public boolean contains(E o){
        for (Object x:elements){
            if (o.equals((E) x))
                return true;
        }
        return false;
    }

    public int indexOf(E o){
        for (int i=0; i<size; i++){
            if (elements[i].equals(o))
                return i;
        }
        return -1;
    }

    public E get(int i){
        if (i > size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i +", Size" + i);
        }
        return (E) elements[i];
    }

    public void clear(){
        elements=new Object[DEFAULT_CAPACITY];
        size=0;
    }
}