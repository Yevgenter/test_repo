package oca;

import java.util.Arrays;
import java.util.List;

public class ConvertListToArr {



  public static void main(String[] args) {
    String[] arr = {"hawk", "robin"};

    List<String> list = Arrays.asList(arr);

    list.set(1, "test");
    arr[0] = "new";

    for (String str: arr) {
      System.out.print(str + " ");

    }
    System.out.println(list);
  }



}
