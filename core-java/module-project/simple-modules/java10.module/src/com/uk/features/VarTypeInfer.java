package com.uk.features;

import java.util.HashMap;
import java.util.Map;

public class VarTypeInfer {
    //public var member1 = "Not allowed";//Cannot resolve symbol 'var'
    public static void main(String[] args) {
        String message = "Hello";
        var msg = "Hello";
        System.out.println(msg);
        Map<String, Integer> map = new HashMap<>();
        var varMap = new HashMap<String, Integer>();
        //var illegal1;//Cannot infer type: 'var' on variable without initializer
        //var illegal2 = null;//Cannot infer type: 'var' on variable without initializer
        //var illegal3 = (String s) -> s.length() > 0;//Cannot infer type: lambda expression requires an explicit target type
        //var illegal4 = {1,4,2};//Array initializer is not allowed here
    }
public static void method(
        //var illegal5//Cannot resolve symbol 'var'
 ){

}

}
