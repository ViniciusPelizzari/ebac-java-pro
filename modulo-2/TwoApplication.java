public class TwoApplication {
  public static void main(String[] args){
    int n = 7;
    System.out.println(standardFactorial(n));
    System.out.println(dynamicFactorialTopDown(n));
    System.out.println(dynamicFactorialBottomUp(n));
  }
  
  public static int standardFactorial(int n){
    if(n < 2) return 1;
    return n * standardFactorial(n - 1);
  }

  public static int dynamicFactorialTopDown(int n){
    int arr[] = new int[n + 1];
    return dynamicFactorialCoreTopDown(n, arr);
  }

  public static int dynamicFactorialBottomUp(int n){
    int arr[] = new int[n + 1];
    return dynamicFactorialCoreBottomUp(n, arr);
  }

  private static int dynamicFactorialCoreBottomUp(int n, int[] arr) {
    arr[0] = 1;

    for (int i = 1; i <= n; i++) {
        arr[i] = i * arr[i - 1];
    }

    return arr[n];
  }

  public static int dynamicFactorialCoreTopDown(int n, int[] arr){
    if(n < 2) {
      arr[0] = 1;
    }
    
    if(arr[n] > 0) return arr[n];

    arr[n] = n * dynamicFactorialCoreTopDown(n - 1, arr);
    return arr[n];
  }
}
