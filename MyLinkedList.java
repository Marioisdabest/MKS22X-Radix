public class MyLinkedList<E>{
  private Node first;
  private Node last;
  private int size;
  private class Node{
    private E value;
    private int previous;
    private int next;
  }
  public String toString(){
    String to_return = "";
    
  }
    //not REQUIRED, but it would be crazy of you not to have this
  public MyLinkedList(){

  }
    //construct an empty list
  public void clear(){

  }
    //reset the list to an empty state. Very similar to the constructor.
  public void add(E){

  }
    //add an element to the end of the list (the boolean would be true all the time if you want to conform to list standards)
  public void extend(MyLinkedList<E> other){

  }
     //in O(1) time, connect the other list to the end of this list.
    //The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
    //This is how you will merge lists together for your radix sort.
  public E removeFront(){

  }
}
