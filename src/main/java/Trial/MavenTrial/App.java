package Trial.MavenTrial;

import java.util.Scanner;
import java.util.NoSuchElementException;

import java.util.*;
/**
 * Hello world!
 */
public class App {
  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello World!");
       String name=scanner.nextLine();
        System.out.println("Enter your name:"+name);
       scanner.close();
         
    }
}
