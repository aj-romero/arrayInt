package com.ajromero;

import com.ajromero.Interfaces.ICalcArray;
import com.ajromero.store.IntArray;
import com.ajromero.store.ValueCalc;

public class AppArray {
  private final IntArray intArray;

  public AppArray(int[] arr, ICalcArray iCalcArray) {

    intArray =
        new ValueCalc(
            arr, iCalcArray.arrayMin(arr), iCalcArray.arrayMax(arr), iCalcArray.arrayAverage(arr));
  }

  public String getOperationValues(){
    return this.intArray.getValues();
  }

  public String inputArray() {
    if (this.intArray.getInputArray().length > 0) {
      int[] arr = intArray.getInputArray();
      StringBuilder p = new StringBuilder();
      p.append("{");
      for (int j : arr) {
        p.append(j).append(", ");
      }

      return (p.substring(0, p.length() - 2) + "}");
    } else return " 0 int array";
  }
}
