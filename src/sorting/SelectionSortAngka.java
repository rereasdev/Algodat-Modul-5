
package sorting;

public class SelectionSortAngka{
    void sortAsc(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    void sortDsc(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] > arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    
    void sortDsc2(int arr[]){
        int n = arr.length;
        for (int i=n-1; i>=0; --i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
    public static void main(String args[])
    {
        SelectionSortAngka ag = new SelectionSortAngka();
        int arr[] = {2, 5, 9, 6, 9, 7, 1};
        System.out.print("Data :\t\t");
        ag.printArray(arr);
        System.out.print("\nAscending :\t");
        ag.sortAsc(arr);
        System.out.print("Descending :\t");
        ag.sortDsc2(arr);
    }
}