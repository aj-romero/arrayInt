package com.ajromero;

import com.ajromero.Interfaces.ICalcArray;
import com.ajromero.store.IntArray;
import com.ajromero.store.ValueCalc;

public class AppArray {
  private ICalcArray calcArray;
  private IntArray intArray;

  public AppArray(int[] arr, ICalcArray iCalcArray) {
    this.calcArray = iCalcArray;
    intArray =
        new ValueCalc(
            arr, calcArray.arrayMin(arr), calcArray.arrayMax(arr), calcArray.arrayAverage(arr));
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
