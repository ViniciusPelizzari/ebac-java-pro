import java.util.ArrayList;
import java.util.List;

public class Backtraking {
  public static void main(String arg[]){

    List<List<Integer>> subSets = getSubsets(new int[]{1, 2, 3}, 2);
    subSets.forEach(System.out::println);

  }
  
  public static List<List<Integer>> getSubsets(int[] intputArray, int subsetSize){
    List<List<Integer>> listOfSubsets = new ArrayList<>();
    
    backtrack(listOfSubsets, new ArrayList<>(), intputArray, 0, subsetSize);

    return listOfSubsets;
  }

  private static void backtrack(List<List<Integer>> listOfSubsets, List<Integer> temporarySet, int[] inputArray, int startIndex, int subsetSize){
    if(temporarySet.size() == subsetSize){
      listOfSubsets.add(new ArrayList<>(temporarySet));
    }
   
    for(int i = startIndex; i < inputArray.length; i++){
      temporarySet.add(inputArray[i]);

      backtrack(listOfSubsets, temporarySet, inputArray, i + 1, subsetSize);

      temporarySet.remove(temporarySet.size() - 1);
    }
  }

}
