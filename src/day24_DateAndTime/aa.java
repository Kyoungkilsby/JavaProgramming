package day24_DateAndTime;

public class aa {
  public static void main(String[] args) {
    Integer [][] items = {{1,2,3},{4,5,6},{7,8,9}};

    for (Integer[] each : items) {
      for (int element: each){
        System.out.print(element);
      }
      System.out.println();
     }
    System.out.println("__________1_______________");
    for (int i = 0; i < items.length; i++) {
      for (int j = 0; j < items[i].length; j++) {
        System.out.print(items[j][i]);

      }
      System.out.println();
    }
      System.out.println("________2___________-");

    for (Integer i = 0; i < items.length; i++) {
      for (Integer j =items[i].length-1;j>=0; j--) {
        System.out.print(items[i][j]);

      }
      System.out.println();

    }
    System.out.println("______________________");

    for (int i = items.length - 1; i >= 0; i--) {
      for (int j = 0; j < items[i].length ; j++) {
        System.out.print(items[i][j]);
      }
      System.out.println();
    }
    }

    }

