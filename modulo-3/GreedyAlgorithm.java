import java.util.LinkedList;
import java.util.Queue;

public class GreedyAlgorithm {

  public static void main(String[] args) {

   // Usage: showPickedCoins(<money to be count>, new int[]{<coin value>, <coin value>, ... , <coin value>});
    showPickedCoins(18, new int[]{5, 2, 1});
    showPickedCoins(20, new int[]{5, 1});
    showPickedCoins(25, new int[]{10, 2, 1});

   /* Disclaimer: 
   /
   / This solution won't stop you from being
   / funny by requesting impossible inputs like 
   / showPickedCoins(25, new int[]{10, 2});
   / or
   / showPickedCoins(5, new int[]{10, 20});
   / or even, 
   / showPickedCoins(5, new int[]{});
   / So, BE WARNED!!!
   /
  */

  }

  private static void showPickedCoins(int value, int availablesCoins[]){
    int originalValue = value;

    Queue<Coin> availableCoins = new LinkedList<>();
    Queue<Coin> pickedCoins = new LinkedList<>();
    
    // fill queue of available coins.
    for(int i = 0; i < availablesCoins.length; i++){
      availableCoins.add(new Coin(availablesCoins[i], 0));
    }
    
    // transfer coins from available coins queue to the picked coins queue 
    while(!availableCoins.isEmpty()){
      Coin c = availableCoins.element();
      if(c.value <= value){
        c.frequency++;
        value -= c.value;
      }else{
        pickedCoins.add(availableCoins.remove());
      }
    }
    
    // print picked coins 
    int total = 0;
    System.out.print("\n$" + originalValue + " = ");
    do {
      Coin c = pickedCoins.remove();
      total += c.value * c.frequency;

      if(c.frequency != 0){
        System.out.print(c.frequency + " x $" + c.value + ((total != originalValue) ? " + " : "") );
      }
    }while(!pickedCoins.isEmpty());
  }

  public static class Coin {
    public int value;
    public int frequency;

    public Coin(int value, int frequency) {
      this.value = value;
      this.frequency = frequency;
    }
  }

}
