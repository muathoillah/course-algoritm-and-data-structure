import java.util.HashMap;

public class job4 {
    private static int[][] stockBunga = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
    };

    private static HashMap<String, Integer> hargaBunga = new HashMap<>();

    static {
        hargaBunga.put("Aglonema", 75000);
        hargaBunga.put("Keladi", 50000);
        hargaBunga.put("Alocasia", 60000);
        hargaBunga.put("Mawar", 10000);
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public static void pendapatanPerCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga.get(getNamaBunga(j));
            }
            System.out.println("Pendapatan cabang " + stockBunga[i][0] + ": Rp " + pendapatan);
        }
    }

    // Fungsi untuk mengetahui jumlah stock setiap jenis bunga pada cabang royalgarden 4
    public static void stockPerJenisBunga(int cabang) {
        System.out.println("Jumlah stock bunga di cabang RoyalGarden " + cabang + ":");
        for (int i = 1; i < stockBunga[cabang - 1].length; i++) {
            System.out.println(getNamaBunga(i) + ": " + stockBunga[cabang - 1][i]);
        }
    }

    private static String getNamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema";
            case 2:
                return "Keladi";
            case 3:
                return "Alocasia";
            case 4:
                return "Mawar";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        // Panggil fungsi-fungsi yang telah dibuat
        pendapatanPerCabang();
        stockPerJenisBunga(4);
    }
}
