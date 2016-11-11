package com.javapapo;

import java.util.Optional;

public class CustomService {

  public CustomService(){
  }

/**
   * Given 2 strings it should return an {@linkplain Optional<String>} containing the 2 strings concatenated.
   * If one of the parameters is null, the result should return only the non null value
   * If both the params are null, then the method should through an {@linkplain IllegalArgumentException}
   * If any of the parameters are empty '', then the result should return only the non empty value}
   * @param firstStr
   * @param secondStr
   * @return {@linkplain Optional<String>}
   */
  public Optional<String> concatStrings(String firstStr, String secondStr){
    return Optional.empty();
  }

  public Optional<Integer> addNums(int... nums){
    return Optional.empty();
  }


}
