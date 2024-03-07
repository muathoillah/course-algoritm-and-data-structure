
public class Buku17 {
String namapengarang, judul;
int halaman,stok,harga;

public Buku17() {
}
public Buku17 (String jud, String pg, int hal, int stok, int har) {
judul = jud;
namapengarang = pg;
halaman = hal;
this.stok = stok;
harga = har;
}
    void tampilInformasi() {
        System.out.println("Judul" + judul);
        System.out.println("Pengarang" + namapengarang);
        System.out.println("Jumlah halaman" + halaman);
        System.out.println("Sisa stok" + stok);
        System.out.println("Harga Rp" + harga);
        System.out.println("total harga" + hitungtotal(harga) );
        }
        void terjual(int jml) {
            if (stok > 0) {
                stok -= jml;
            } else {
                System.out.println("Stok habis.");
            }
        }
        
        void restock(int jml) {
        stok += jml;
        }
        void gantiHarga (int hrg) {
        harga = hrg;
        }
        
        int hitungtotal(int jml){
        return jml*harga;
        }
        int hitungDiskon (int jml){
            int diskon =0;
            int hargatotal= hitungtotal(jml);
            if (hargatotal>150000) {
                diskon=(int)(0.12*hargatotal);
            }else if (hargatotal<150000 && hargatotal>=75000)
            diskon =(int)(0.05*hargatotal);
            else
            diskon=0;
            
            return diskon;
        }
        

    
    }