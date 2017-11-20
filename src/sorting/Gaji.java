package sorting;

public class Gaji extends Pegawai {
    @Override
    public void gaji(String nama, String jabatan, float lama){
        if(nama.matches("[a-zA-Z]*")){
            if(jabatan.matches("[a-zA-Z]*")){
                switch (jabatan) {
                    case "karyawan":
                        if(lama < 2){
                            gaji = 3000000;
                        }
                        else if(lama <= 5){
                            gaji = 6000000;
                        }
                        else if(lama > 5){
                            gaji = 12000000;
                        }       
                        break;
                    case "supervisor":
                        if(lama < 2){
                            gaji = 4000000;
                        }
                        else if(lama<= 5){
                            gaji = 8000000;
                        }
                        else if(lama > 5){
                            gaji = 16000000;
                        }       
                        break;
                    case "manager":
                        if(lama < 2){
                            gaji = 5000000;
                        }
                        else if(lama <= 5){
                            gaji = 10000000;
                        }
                        else if(lama > 5){
                            gaji = 20000000;
                        }   
                        break;
                    default:
                            gaji = 0;
                            jabatan = jabatan+" (tidak ada)";
                        break;
                }
                
                System.out.println("Nama:\t\t"+nama);
                System.out.println("Jabatan:\t"+jabatan);
                System.out.println("Gaji:\t\t"+gaji);
            }
            else{
                System.out.println("JABATAN Harus Huruf");
            }
        }
        else{
            System.out.println("NAMA harus Huruf");
        }
    }
}
