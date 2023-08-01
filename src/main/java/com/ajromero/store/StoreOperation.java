package com.ajromero.store;

public class StoreOperation {

  private int min;
  private int max;
  private double avg;

  public StoreOperation(int min, int max, double avg) {
    this.min = min;
    this.max = max;
    this.avg = avg;
  }

  public String getOperationValue() {
    return "{ \n\t min: "
        + String.format("%d", this.min)
        + ",\n\t max: "
        + String.format("%d", this.max)
        + ",\n\t average: "
        + String.format("%.2f", this.avg)
        + "\n}";
  }
}
