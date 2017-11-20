
package sorting;

public class SelectionSortHuruf{
    public void sortAsc(String[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        printArray(arr);
    }
    
    public void sortDsc(String[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        printArray(arr);
    }
    
    public void sortDsc2(int arr[]){
        int n = arr.length;
        for (int i=n-1; i>=0; --i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    void sortDsc2(String arr[]){
        int n = arr.length;
        for (int i=n-1; i>=0; --i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public void printArray(String arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
    public static void main(String args[]){
        SelectionSortHuruf hr = new SelectionSortHuruf();
        String arr[] = {"d", "r", "g", "a", "z", "y", "m"};
        System.out.print("Data :\t\t");
        hr.printArray(arr);
        System.out.print("\nAscending :\t");
        hr.sortAsc(arr);
        System.out.print("Descending :\t");
        hr.sortDsc(arr);
    }
}