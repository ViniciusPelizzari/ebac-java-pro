  public class Queue implements IQueue {

    private Node head = new Node(0);
    private Node tail = new Node(0);
    private int size = 0;

    public Queue() {
    }

    public void add(int data) {
      addNode(data);
      incrementSize();
    }

    public int remove() {

      checkIfQueueIsEmptyError();

      int data = getDataFromHeadNode();
      removeHeadNode();
      decrementSize();
      return data;
    }

    public int front() {
      checkIfQueueIsEmptyError();
      return head.data;
    }

    public int tail() {
      checkIfQueueIsEmptyError();
      return tail.data;
    }

    public int size() {
      return size;
    }

    public boolean isEmpty() {
      return size == 0;
    }

  public void print() {
    Node n = head;
    for (int i = 0; i < size; i++) {
      System.out.print(n.data + " ");
      n = n.nextNode;
    }
  }

  private void incrementSize() {
    size++;
  }

  private void decrementSize() {
    size--;
  }

  private void addNode(int data) {
    if (isEmpty()) {
      addFirstNode(data);
    } else {
      addNextNode(data);
    }
  }

  private void addNextNode(int data) {
    Node newTail = new Node(data);
    tail.nextNode = newTail;
    tail = newTail;
  }

  private void addFirstNode(int data) {
    head.data = data;
    tail = head;
  }

  private int getDataFromHeadNode() {
    return head.data;
  }

  private void removeHeadNode() {
    head = head.nextNode;
  }

  private void checkIfQueueIsEmptyError() {
    if (isEmpty()) {
      throw new RuntimeException("The queue is empty.");
    }
  }

  public class Node {
    public int data;
    public Node nextNode;

    public Node(int data) {
      this.data = data;
      this.nextNode = null;
    }

  }

}
