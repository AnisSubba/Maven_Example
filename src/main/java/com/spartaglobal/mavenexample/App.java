package com.spartaglobal.mavenexample;

import com.spartaglobal.mavenexample.collectionexamples.ExampleLists;
import com.spartaglobal.mavenexample.collectionexamples.ExampleSets;
import com.spartaglobal.mavenexample.mavenexample.JavaAPIExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

//        JavaAPIExample javaAPIExample = new JavaAPIExample();
//        javaAPIExample.mathExamples();
//        javaAPIExample.dateTime();

        ExampleSets newExample = new ExampleSets();
        newExample.workingWithOutSet();
        newExample.printSet();

        ExampleLists newList = new ExampleLists("MMA");









    }
}
