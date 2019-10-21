package com.spartaglobal.mavenexample;

import com.spartaglobal.mavenexample.collectionexamples.ExampleDeQueues;
import com.spartaglobal.mavenexample.collectionexamples.ExampleLists;
import com.spartaglobal.mavenexample.collectionexamples.ExampleQueues;
import com.spartaglobal.mavenexample.collectionexamples.ExampleSets;
import com.spartaglobal.mavenexample.maps.ExampleMaps;
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

//        ExampleSets newExample = new ExampleSets();
//        newExample.workingWithOutSet();
//        newExample.printSet();
//
//        ExampleLists newList = new ExampleLists();
//        newList.printList();
//
//        ExampleQueues exampleQueues = new ExampleQueues();
//        exampleQueues.queueRunner();

        ExampleDeQueues exampleDeQueues = new ExampleDeQueues();
        exampleDeQueues.workingWithOurDeQueue();

        ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValue(2));

    }
}
