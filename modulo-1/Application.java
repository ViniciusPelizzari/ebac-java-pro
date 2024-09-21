public class Application {
  public static void main(String[] args) {

// Stack
    System.out.println("----------------- Stack ----------------");
    IStack s = new Stack();

    s.push(6);
    s.push(53);

    s.pop();

    s.push(7);
    s.push(22);
    s.push(9);
    s.push(1);
    System.out.println("Size: " + s.size());
    
    System.out.print("Stack data: ");
    while (!s.isEmpty()) {
      System.out.print(s.pop() + " ");
    }

// Queue
  System.out.println("\n\n----------------- Queue ----------------");
  IQueue q = new Queue();

  q.add(2);
  q.add(3);
  q.add(6);
  q.add(0);
  q.add(-8);
  q.add(1);

  q.remove();

  System.out.print("Queue data: ");
  q.print();
  System.out.println("\nTail: " + q.tail());
  System.out.println("Front: " + q.front());
  System.out.println("Size: " + q.size());

// Linkedlist
  System.out.println("\n-------------- LinkedList --------------");

  ILinkedList l = new LinkedList();
  l.push(2);
  l.push(-9);
  l.push(34);
  l.push(11);
  l.push(23);
  l.push(99);
  l.push(1);

  l.pop();
  l.insert(3, -24348);

  System.out.print("Linkedlist data: ");
  l.print();
  System.out.println();
  System.out.println("Size: " + l.size());

  }
}
