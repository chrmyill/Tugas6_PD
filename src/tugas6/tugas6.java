package tugas6;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class tugas6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi string
        String[][] toko = new String[5][4];
        //deklarasi variabel
        int quantity, harga, totalharga, grandtotal=0, uangbayar, uangkembalian;

        try{
            //input data
            for (int i = 0; i < toko.length; i++) {
                System.out.print("Masukan Nama Barang   : ");
                toko[i][0] = br.readLine();
                System.out.print("Masukan Jumlah Barang : ");
                toko[i][1] = br.readLine();

                //konversi tipe data dari ips[i][1] (string) ke double
                quantity = Integer.parseInt(toko[i][1]);
                System.out.print("Harga Barang  : ");
                toko[i][2] = br.readLine();
                harga = Integer.parseInt(toko[i][2]);

                //rumus menghitung total harga
                totalharga = quantity * harga;

                toko[i][3] = String.valueOf(totalharga);
                System.out.println("Total : "+toko[i][3]);

                //rumus menghitung grandtotal
                grandtotal = grandtotal + totalharga;
                System.out.println("------------TERIMAKASIH---------------");


            }

            System.out.println("Grand total : " +grandtotal);
            System.out.print("Uang yang dibayarkan: ");
            uangbayar = Integer.parseInt(br.readLine());

            //Rumus menghitung uang kembalian
            uangkembalian = uangbayar - grandtotal;
            System.out.print("Uang kembali Rp."+uangkembalian);

        }catch (Exception e){

        }



    }

}