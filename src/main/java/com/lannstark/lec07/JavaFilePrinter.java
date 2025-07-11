package com.lannstark.lec07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

  //java의 경우 checked exception의 경우 표시를 해주어야 함
  public void readFile(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }

}
