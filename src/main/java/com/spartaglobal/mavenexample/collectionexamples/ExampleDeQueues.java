package com.spartaglobal.mavenexample.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueues {

    private Deque<String> capPark = new LinkedList<>();

    public ExampleDeQueues(){
        capPark.add("car1");
        capPark.add("car2");
        capPark.add("car3");
    }

    public void workingWithOurDeQueue(){
      /*  for(String car : capPark){
            System.out.println(car);*/
        System.out.println(capPark.poll());
        System.out.println(capPark.peek());
        }
    }

