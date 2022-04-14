package com.skillsup;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<>();
        ml.add(1);
        ml.add(4);

        ml.add(6);
        ml.add(25);

        System.out.println(ml);
        System.out.println(ml.largest());
        System.out.println(ml.smallest());

        MyList<String> ml_str = new MyList<>();
        ml_str.add("one");
        ml_str.add("two");

        ml_str.add("smallest");
        ml_str.add("largest");
        System.out.println(ml_str);
    }
}

class MyList<T> {
    private ArrayList<T> list;

    MyList() {
        this.list = new ArrayList<T>();
    }

    public void add(T item) {
        this.list.add(item);
    }

    public T smallest() {
        this.list.sort(null);
        return this.list.get(0);
    }

    public T largest() {
        this.list.sort(Collections.reverseOrder());
        return this.list.get(0);
    }

    public String toString() {
        return "MyList=" + list;
    }
}
