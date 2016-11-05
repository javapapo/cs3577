package com.optexample;

import java.util.Optional;

/**
 * Created by javapapo on 27/10/2016.
 */
public class ExamplesWithOptional {


    public static void main(String[] args) {

//        //--
//        Person peter = new Person();
//        if(peter.getName().isPresent()){
//            System.out.println(peter.getName().get());
//        };
//
//        Person george = new Person("george");
//        if(george.getName().isPresent()){
//            System.out.println(george.getName().get());
//        };

        //--map
        String result = Optional.of("Something")
                            .map(paris -> paris.toUpperCase())
                            .get();
        System.out.println(result);

//        String result2 = Optional.of("Som et hing")
//                .map(s -> s.toLowerCase())
//                .map(s -> s.trim())
//                .get();
//
//        System.out.println(result2);
//
//        //--filter
//        Optional<Integer> optNum = Optional.of(222);
//        optNum.filter(num -> num>10)
//                .ifPresent(theNum -> System.out.println("The number :"+theNum+"  is greater than 10"));
//
//
//        //--get or else
//        Optional<Integer> anotherNum = Optional.empty();
//        Optional<Integer> aRealNum = Optional.of(20000);
//
//        Integer resultNum = anotherNum.orElse(1000);
//        System.out.println(resultNum);
//
//        Integer resultNum2 = aRealNum.orElse(1000);
//        System.out.println(resultNum2);
//
//        //-- null check
//
//        Long aLongNum = null;
//        String msg =
//                Optional.ofNullable(aLongNum).map(l -> l.toString()).orElse("NO VALUE");
//        System.out.println(msg);
//
//        Long aLongNum2 = 1000L;
//        String msg2 =
//                Optional.ofNullable(aLongNum2).map(l -> l.toString()).orElse("NO VALUE");
//        System.out.println(msg2);
//
//        Long aLongNum3 = null;
//        String msg3 =
//                Optional.ofNullable(aLongNum3)
//                        .map(l -> l.toString())
//                        .orElseThrow(IllegalArgumentException::new);
//        System.out.println(msg3);





    }
}
