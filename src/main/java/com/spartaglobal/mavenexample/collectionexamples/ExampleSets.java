package com.spartaglobal.mavenexample.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    private Set<String> newSet = new HashSet<String>();

public void workingWithOutSet(){
    newSet.add("milk");
    newSet.add("meat");
    newSet.add("rice");
}
public void printSet(){
    System.out.println(newSet.contains("meat"));

    for (String shoppingItem: newSet){
        System.out.println(shoppingItem);
    }
}
}
