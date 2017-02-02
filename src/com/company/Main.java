package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("OG contents of list: ");
        ListIterator itr = al.listIterator(al.size());
        while(itr.hasPrevious())
        {
            Object element = itr.previous();
            System.out.print(element + " ");
        }
    }
}
