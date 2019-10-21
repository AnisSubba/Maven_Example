package com.spartaglobal.mavenexample.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {

    private List<String> hobbies = new ArrayList<>();

    public ExampleLists(){
        workingWithOutList();
    }

    public void workingWithOutList(){
        hobbies.add("MMA");
        hobbies.add("Football");
        hobbies.add("Cooking");
        hobbies.add("Coding");
    }

    public void printList(){
        System.out.println("we're using the iterator ..... ");
        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}