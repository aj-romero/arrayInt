package com.ajromero;

import java.util.Scanner;

public class App {
  private static final Scanner es = new Scanner(System.in);
  private static AppArray appArray;

  public static void main(String[] args) {
    buildIntArray();
    builResult();
    printInstructions();
    actions();
  }

  private static void builResult() {
    printf("Input: \t" + appArray.inputArray());
    printf("\nOuput: \n" + appArray.getIntArray().getOperationValue());
  }

  private static void buildIntArray() {
    int[] array = getIntegers();
    appArray = new AppArray(array, new CalcArray());
  }

  private static int[] getIntegers() {
    printf(String.format("%s", "Please type the number of elements in array: "));
    int x = checkInput();
    int[] result = new int[x];
    for (int i = 0; i < result.length; i++) {
      printf(String.format("%s", "Type the value of element [" + (i + 1) + "]: "));
      result[i] = checkInput();
    }
    return result;
  }

  private static int checkInput() {
    int acc = 0;
    boolean b = true;
    while (b) {
      try {
        acc = Integer.parseInt(es.nextLine());
        b = false;
      } catch (Exception e) {
        b = true;
        printf("Gring, Please type again a correct integer");
      }
    }
    return acc;
  }

  private static void printf(String print) {
    System.out.printf(print);
  }

  private static void printInstructions() {
    printf("%nPress: ");
    printf("%n0 - To quit the application");
    printf("%n1 - Try again");
    printf("%n2 - Show again the result");
    printf("%nEnter your choice[]: ");
  }

  private static void actions() {
    int action = 0;
    action = checkInput();
    if (action >= 0 && action <= 2) {
      switch (action) {
        case 0:
          printf("%n See you later!");
          System.exit(0);
          break;
        case 1:
          buildIntArray();
          builResult();
          printInstructions();
          actions();
          break;
        case 2:
          builResult();
          printInstructions();
          actions();
          break;
        default:
          printInstructions();
          actions();
      }
    } else {
      printInstructions();
      printf("%nPlease, type again your choice [0 - 2]: ");
      actions();
    }
  }
}
