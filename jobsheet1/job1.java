import java.util.Scanner;

public class job1 {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
        if (nilaiAkhir == -1) {
            System.out.println("Nilai tidak valid");
            return;
        }

        String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
        String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "LULUS";

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
    }

    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        if (!(0 <= tugas && tugas <= 100 && 0 <= kuis && kuis <= 100 && 0 <= uts && uts <= 100 && 0 <= uas && uas <= 100)) {
            return -1;
        }


        return (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
    }

    public static String konversiNilaiHuruf(double nilaiAkhir) {

        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 75) {
            return "B+";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "C+";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}
