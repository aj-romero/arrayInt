package com.ajromero;

import com.ajromero.Interfaces.ICalcArray;

public class CalcArray implements ICalcArray {
  @Override
  public double arrayAverage(int[] arr) {
    if (arr != null && arr.length > 0) {
      int avg = 0;
      for (int x = 0; x < arr.length; x++) {
        avg += arr[x];
      }
      return (Double.valueOf(avg) / Double.valueOf(arr.length));
    } else return 0;
  }

  @Override
  public int arrayMax(int[] arr) {
    if (arr != null && arr.length > 0) {
      int max = arr[0];
      for (int x = 1; x < arr.length; x++) {
        if (arr[x] > max) max = arr[x];
      }
      return max;
    } else return 0;
  }

  @Override
  public int arrayMin(int[] arr) {
    if (arr != null && arr.length > 0) {
      int min = arr[0];
      for (int x = 1; x < arr.length; x++) {
        if (arr[x] < min) min = arr[x];
      }
      return min;
    } else return 0;
  }
}
