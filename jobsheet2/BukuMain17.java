/**
 * BukuMain17
 */
public class BukuMain17 {

    public static void main(String[] args) {
        Buku17 bk1= new Buku17();
        bk1.judul ="sejarah dunia yang disrembunyikan";
        bk1.namapengarang ="fais";
        bk1.halaman=100;
        bk1.stok=10;
        bk1.harga=150000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(10000);
        bk1.tampilInformasi();

        Buku17 bk2= new Buku17("fais","fais",10,100,100000);
        bk2.terjual(10);
        bk2.tampilInformasi();
        bk2.hitungtotal(1);

        /*Buku17 athoillah = new Buku17("Java Programming", "Andi", 200, 20, 100000);
        athoillah.hitungHargaBayar();
        athoillah.tampilInformasi();*/
        

    }
}