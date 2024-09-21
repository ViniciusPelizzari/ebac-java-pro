public class LinkedList implements ILinkedList{

  private Node tail = new Node(0);
  private int size = 0;

  public LinkedList() {

  }

  public int size() {
    return size;
  }

  public void push(int data) {
    addNewNode(data);
    incrementSize();
  }

  public int pop() {
    int data = tail.data;

    removeTail();
    decrementSize();

    return data;
  }

  public void insert(int index, int data) {
    checkIfIndexIsOutOfRangeError(index);

    Node currentNodeAtPositionOfIndex = findNodeAt(index);
    addNodeBeforeCurrentNode(new Node(data), currentNodeAtPositionOfIndex);

    incrementSize();
  }

  public int elementAt(int index) {
    checkIfIndexIsOutOfRangeError(index);

    Node n = tail;
    int indexToStopToSearch = size - index - 1;
    for (int i = 0; i < indexToStopToSearch; i++) {
      n = n.nextNode;
    }

    return n.data;
  }

  public void print() {
    int listContent[] = fillArrayWithListContent(tail);
    printList(listContent);
  }

  private void addNewNode(int data) {
    if (isListEmpty()) {
      addDataToNode(tail, data);
    } else {
      addNodeNextToTail(data);
    }
  }

  private void addNodeNextToTail(int data) {
    Node newTail = new Node(data);
    newTail.nextNode = tail;
    tail = newTail;
  }

  private void addDataToNode(Node n, int data) {
    n.data = data;
  }

  private boolean isListEmpty() {
    return size == 0;
  }

  private void removeTail() {
    tail = tail.nextNode;
  }

  private void addNodeBeforeCurrentNode(Node newNode, Node currentNodeAtPositionOfIndex) {
    newNode.nextNode = currentNodeAtPositionOfIndex.nextNode;
    currentNodeAtPositionOfIndex.nextNode = newNode;
  }

  public void remove(int index) {
    checkIfIndexIsOutOfRangeError(index);
    removeNode(index);
  }

  private void checkIfIndexIsOutOfRangeError(int index) {
    if (index < 0 || index >= size) {
      throw new RuntimeException("Index out of range.");
    }
  }

  private void removeNode(int index) {
    if (isIndexOfTail(index)) {
      pop();
    } else {
      removeNodeBeforeTail(index);
    }
  }

  private void removeNodeBeforeTail(int index) {
    bypassNodeOnePositionBefore(findNodeAt(index + 1));
    decrementSize();
  }

  private Node findNodeAt(int index) {
    Node n = tail;
    for (int i = 0; i < size - index - 1; i++) {
      n = n.nextNode;
    }
    return n;
  }

  private void bypassNodeOnePositionBefore(Node n) {
    n.nextNode = n.nextNode.nextNode;
  }

  private boolean isIndexOfTail(int index) {
    return index == size - 1;
  }

  private void printList(int list[]) {
    for (int i = 0; i < size; i++) {
      System.out.print(list[i] + " ");
    }
  }

  private int[] fillArrayWithListContent(Node n) {
    int listContent[] = new int[size];

    for (int i = 0; i < size; i++) {
      listContent[size - i - 1] = n.data;
      n = n.nextNode;
    }

    return listContent;
  }

  private void incrementSize() {
    size++;
  }

  private void decrementSize() {
    size--;
  }

  private class Node {
    public int data;
    public Node nextNode;

    public Node(int data) {
      this.data = data;
      nextNode = null;
    }

  }
}
