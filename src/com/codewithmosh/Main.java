package com.codewithmosh;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
     //LinkedList list = new LinkedList();
     //list.addLast(10);
     //list.addLast(20);
	 //array
        Array numbers = new Array(1);

        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(0);
        numbers.print();

        //built in dynamic array has built in add, remove  and indexOf function
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(200);
        list.remove(0);
        list.indexOf(0);
        list.toArray();
        System.out.println(list);
    }
}
