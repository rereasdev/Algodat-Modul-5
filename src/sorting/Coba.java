/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author asus
 */
public class Coba {
    public static void main(String[] args) {
        sortingtype st = new sortingtype();
        int a[] = new int[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        st.mergeSort(a);
        
    }
    
}
