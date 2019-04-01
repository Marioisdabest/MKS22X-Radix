public class Radix{
  private static int getDigit(int number, int digitNum){
    return (number%((int) Math.pow(10,digitNum)))/ (int) Math.pow(10,digitNum-1);
  }
  private void sort(int digit, int[] data){
    MyLinkedList[] buckets = new MyLinkedList[20];
  }
  public static void radixsort(int[]data){
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < data.length; i ++){
      if(Math.abs(data[i])>max){
        max = Math.abs(data[i]);
      }
    }
    int max_digits = (int) Math.ciel((int) Math.log(max) / (int) Math.log(10));
    for(int i = 1; i < max_digits + 1; i++){
      sort(i,data);
    }

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
  }
}
