import java.util.*;
import java.io.*;
@SuppressWarnings("unchecked")
public class Radix{

  private static int getDigit(int number, int digitNum){
    return (number%((int) Math.pow(10,digitNum)))/ (int) Math.pow(10,digitNum-1);
  }
  private static void  sort(int digit, int[] data){
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for(int i = 0; i < 20; i ++){
      buckets[i] = new MyLinkedList<Integer>();

    }
    for(int i = 0; i < data.length; i ++){
      buckets[10 + getDigit(data[i],digit)].add(data[i]);
    }
    int counter = 0;
    for(int i = 0; i < 20; i ++){
      int size = buckets[i].getSize();
      while(size>0){
        System.out.println(size);
        System.out.println(buckets[i].toString());
        data[counter] = buckets[i].removeFront();
        size--;
      }
    }



  }
  public static void radixsort(int[]data){
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < data.length; i ++){
      if(Math.abs(data[i])>max){
        max = Math.abs(data[i]);
      }
    }
    int max_digits = (int) Math.ceil((int) Math.log(max) / (int) Math.log(10));
    for(int i = 1; i < max_digits + 1; i++){
      sort(i,data);
    }

  }
  public static String toString(int[]data){
    String to_return = "";
    for(int i =0; i < data.length; i ++){
      to_return+= data[i]+" ";
    }
    return to_return;
  }
  public static void main(String[] args){

    System.out.println(Radix.getDigit(123456789,1));
    System.out.println(Radix.getDigit(123456789,2));
    System.out.println(Radix.getDigit(123456789,3));
    System.out.println(Radix.getDigit(123456789,4));
    System.out.println(Radix.getDigit(123456789,5));
    System.out.println(Radix.getDigit(123456789,6));
    System.out.println(Radix.getDigit(123456789,7));
    System.out.println(Radix.getDigit(123456789,8));
    System.out.println(Radix.getDigit(123456789,9));
    int list_size = 10;
    int max = 10;
    int[] data = new int[list_size];
    Random r = new Random();
    for(int i =0; i < list_size; i ++){
      data[i]=Math.abs(r.nextInt()%max);
    }
    System.out.println(Radix.toString(data));
    Radix.radixsort(data);
    System.out.println(Radix.toString(data));
  }
}
