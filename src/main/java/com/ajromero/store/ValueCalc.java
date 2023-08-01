package com.ajromero.store;

public class ValueCalc extends IntArray {

  private final int min;
  private final int max;
  private final double avg;

  public ValueCalc(int[] arr, int min, int max, double avg) {
    super(arr);
    this.min = min;
    this.max = max;
    this.avg = avg;
  }
  @Override
  public String getValues() {
    return "{ \n\t min: "
        + String.format("%d", this.min)
        + ",\n\t max: "
        + String.format("%d", this.max)
        + ",\n\t average: "
        + String.format("%.2f", this.avg)
        + "\n}";
  }
}
