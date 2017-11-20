package sorting;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {  
        int lenght = 3;
//        int c = 0;
        int pilih;
        String nama[] = {"fauzi","ilham","taufik", "nurudin"};
        String jabatan[] = {"manager", "karyawan", "supervisor", "karyawan"};
        float lama[] = {6, 6, 6, 3};
        int gaji[] = new int[nama.length];
        Scanner scan = new Scanner(System.in);
        Gaji staff = new Gaji();
        for (int c = 0; c < nama.length; c++) {
            staff.gaji(nama[c], jabatan[c], lama[c]);
            gaji[c] = staff.gaji;
        }
        
        
//    do{
//        try{
//            System.out.println("Masukkan Nama Pegawai!");
//            nama[c] = scan.nextLine();
//            System.out.println("Masukkan Jabatan Pegawai!(KARYAWAN/ MANAGER/ SUPERVISOR");
//            jabatan[c] = scan.next().toLowerCase();
//            System.out.println("Masukkan Lama Kerja Pegawai!");
//            lama[c] = scan.nextFloat();
//            staff.gaji(nama[c], jabatan[c], lama[c]);
//            gaji[c] = staff.gaji;
//        } catch(java.util.InputMismatchException a){
//            System.err.println("INPUTAN SALAH, LAMA KERJA HARUS ANGKA!");
//        }
//        System.out.println("apakah anda ingin memasukkan data lagi ?");
//        System.out.println("Jika ya masukkan tombol 1");
//        pilih = scan.nextInt();
//        c++;
//    }
//        while(pilih == 1);
        
        
        System.out.println("1. Selection Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.print("Pilih Pengurutan = ");
        int sort;
        sort = scan.nextInt();
        sortingtype st = new sortingtype();
        sortingtypenama sp = new sortingtypenama();
        System.out.println("Hasil : ");
        System.out.print("Hasil = ");
        
        switch (sort){
            case 1 :
                sp.selectionSort(nama);
                System.out.println("");
                st.selectionSort(gaji);
                break;
            case 2 :
                sp.insertionSort(nama);
                System.out.println("");
                st.insertionSort(gaji);
                break;
            case 3 :
                sp.bubbleSort(nama);
                System.out.println("");
                st.bubbleSort(gaji);
                break;
            case 4 :
                sp.mergeSort(nama);
                System.out.println("");
                st.mergeSort(gaji);
                break;
            case 5 :
                sp.quickSort(nama);
                System.out.println("");
                st.quickSort(gaji);
                break;
            default :
                break;
        }
        
            System.out.println("");
            System.out.println("1. Ascending ");
            System.out.println("2. Descending ");
            System.out.println("Masukkan metode = ");
            int metode;
            metode = scan.nextInt();
            System.out.println("Hasil : ");
                
        SelectionSortAngka ssa = new SelectionSortAngka(); 
        SelectionSortHuruf ssh = new SelectionSortHuruf();
        switch(metode){
            case 1:
                ssh.sortAsc(nama);
                System.out.println("");
                ssa.sortAsc(gaji);
                break;
            case 2:
                ssh.sortDsc(nama);
                System.out.println("");
                ssa.sortDsc(gaji);
                break;
            default:
                break;
        }
    }
}