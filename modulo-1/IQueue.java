public interface IQueue{

  void add(int data);

  int remove();

  int front();

  int tail();

  int size(); 

  boolean isEmpty();

  void print();
}
