package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("test");
        stringList.add("test2");

        List<String> strings = new ArrayList<>();
        strings.add("test");

        stringList.removeAll(strings);
        boolean b = strings.isEmpty();
        System.out.println(b);
    }
}
