public class MLLDriver{
  public static void main(String[] args){
    MyLinkedList mll = new MyLinkedList();
    System.out.println(mll.toString());
    mll.add(3);
    System.out.println(mll.toString());
    mll.add(4);
    System.out.println(mll.toString());
    mll.add(5);
    System.out.println(mll.toString());
    System.out.println(mll.removeFront());
    MyLinkedList nll = new MyLinkedList();
    nll.add(11);
    nll.add(12);
    nll.add(13);
    System.out.println(nll.toString());
    mll.extend(nll);
    System.out.println(mll.toString());
  }
}
