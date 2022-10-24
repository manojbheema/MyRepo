package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("test");
        stringList.add("test2");

        List<String> strings = new ArrayList<>();
        strings.add("test1");
        strings.add("test2");
        stringList.removeAll(strings);
        boolean b = stringList.isEmpty();
        System.out.println(b);
        System.out.println(stringList);
    }
}
