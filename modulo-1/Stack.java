public class Stack implements IStack {

  private Node headNode;
  private int stackSize;

  public Stack() {
    headNode = new Node(0);
    stackSize = 0;
  }

  public void push(int data) {
    addNewNode(data);
    incrementStackSize();
  }

  public int pop() {

    checkIfStackIsEmptyError();

    int data = getDataOnTop();
    removeHeadNode();
    decrementStackSize();

    return data;
  }

  public int top() {
    checkIfStackIsEmptyError();
    return headNode.data;
  }

  public boolean isEmpty() {
    return stackSize == 0;
  }

  public int size() {
    return stackSize;
  }

  private void addNewNode(int data) {
    if (isEmpty()) {
      addFirstNode(data);
    } else {
      addNextNode(data);
    }
  }

  private int getDataOnTop() {
    return headNode.data;
  }

  private void removeHeadNode() {
    headNode = headNode.previewsNode;
  }

  private void checkIfStackIsEmptyError() {
    if (isEmpty()) {
      throw new RuntimeException("The stack is empty.");
    }
  }

  private void incrementStackSize() {
    stackSize++;
  }

  private void decrementStackSize() {
    stackSize--;
  }

  private void addFirstNode(int data) {
    headNode.data = data;
  }

  private void addNextNode(int data) {
    addNewHeadNodeOnTop(new Node(data));
  }

  private void addNewHeadNodeOnTop(Node newHeadNode) {
    newHeadNode.previewsNode = headNode;
    headNode = newHeadNode;
  }

  private class Node {
    public int data;
    public Node previewsNode;

    public Node(int data) {
      this.data = data;
      this.previewsNode = null;
    }
  }
}
