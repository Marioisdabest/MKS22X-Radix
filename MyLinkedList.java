@SuppressWarnings("unchecked")
public class MyLinkedList<E>{

  private Node first;
  private Node last;
  private int size;
  private class Node{
    private E value;
    private Node previous;
    private Node next;
    public Node(E valu, Node nex, Node prev){
      value = valu;
      next = nex;
      previous = prev;
    }
    private E getValue(){
      return value;
    }
    private Node getNext(){
      return next;
    }
    private Node getPrev(){
      return previous;
    }
    private void setValue(E val){
      value = val;
    }
    private void setNext(Node nex){
      next = nex;
    }
    private void setPrev(Node prev){
      previous = prev;
    }
    public String toString(){
      return "Value: "+value.toString()+"\n";
    }
  }
  public String toString(){
    if(size == 0){
      return "";
    }
    else{
      return toString(first);
    }
  }
  private String toString(Node node){


    if(node.getNext() == null){
      E nodeValue = node.getValue();
      //System.out.println(nodeValue);
      return nodeValue.toString();
    }
    else{
      E nodeValue = node.getValue();
      System.out.println(node.getValue());
      return nodeValue.toString() + " " + toString(node.getNext());
    }

  }
    //not REQUIRED, but it would be crazy of you not to have this
  public MyLinkedList(){
    size = 0;

  }
  private Node getFirst(){
    return first;
  }
  private Node getLast(){
    return last;
  }
  public int getSize(){
    return size;
  }
    //construct an empty list
  public void clear(){
    size = 0;
    first = null;
    last = null;
  }
    //reset the list to an empty state. Very similar to the constructor.
  public void add(E E){
    if(size == 0){
      Node newNode = new Node(E,null,null);
      first = newNode;
      last = newNode;
      //System.out.println(last.toString());
    }
    else{
      if(size == 1){
        last = new Node(E,null,first);
        first.setNext(last);
      }
      else{
        Node newNode = new Node(E,null,last);
        E oldVal = last.getValue();
        //last.setValue(E);
        //System.out.println(last.toString());
        last.setNext(newNode);
        //System.out.println(newNode.toString());
        //System.out.println(last.toString());

        Node tempNode = new Node(last.getValue(), newNode, last.getPrev());
        last.getPrev().setNext(tempNode);
        last = newNode;
      }
    }
    size++;
  }
    //add an element to the end of the list (the boolean would be true all the time if you want to conform to list standards)
  public void extend(MyLinkedList<E> other){
    other.getFirst().setPrev(last);
    last.setNext(other.getFirst());
    size += other.getSize();
  }
     //in O(1) time, connect the other list to the end of this list.
    //The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
    //This is how you will merge lists together for your radix sort.
  public E removeFront(){
    Node toReturn = new Node(first.getValue(), null, null);
    first = first.getNext();
    first.setPrev(null);
    size--;
    return toReturn.getValue();

  }

}
