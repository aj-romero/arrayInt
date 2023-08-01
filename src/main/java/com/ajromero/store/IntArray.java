package com.ajromero.store;

public class IntArray extends StoreOperation {
  private int[] inputArray;

  public IntArray(int[] inputArray, int min, int max, double avg) {
    super(min, max, avg);
    this.inputArray = inputArray;
  }

  public int[] getInputArray() {
    return this.inputArray;
  }
}
