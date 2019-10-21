package com.spartaglobal.mavenexample.maps;

import com.spartaglobal.mavenexample.collectionexamples.ExampleDeQueues;

import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    private Map<Integer, String> studentsInClass = new HashMap<>();

    public ExampleMaps(){
        studentsInClass.put(1,"Anis");
        studentsInClass.put(2,"Pav");
        studentsInClass.put(3,"naz");
    }

    public String returnValue (int keyNum){
        return studentsInClass.get(keyNum);
    }
}
