package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        names.add("test3");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
