package com.javapapo;

import java.util.Arrays;
import java.util.Optional;

public class CustomService {

  public CustomService () {
  }

  /**
   * Given 2 strings it should return an {@linkplain Optional<String>} containing the 2 strings concatenated.
   * If one of the parameters is null, the result should return only the non null value
   * If both the params are null, then the method should through an {@linkplain IllegalArgumentException}
   * If any of the parameters are empty '', then the result should return only the non empty value}
   *
   * @return {@linkplain Optional<String>}
   */
  public Optional<String> concatStrings (String firstStr, String secondStr) {
    Optional<String> result = Optional.empty();

    if (firstStr == null && secondStr != null) {
      result = Optional.of(secondStr);
    } else if (firstStr != null && secondStr == null) {
      result = Optional.of(firstStr);
    } else if (firstStr == null && secondStr == null) {
      throw new IllegalArgumentException("You should not provide 2 null parameters to the method");
    }else{
      result = Optional.of(firstStr+secondStr);
    }

    return result;
  }

  public Optional<Integer> addNums (int... nums) {
    return Optional.of(Arrays.stream(nums).sum());
  }
}
