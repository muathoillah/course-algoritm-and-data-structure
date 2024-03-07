import java.util.Scanner;

public class job3{
    // Method untuk mengkonversi nilai huruf menjadi nilai setara
    public static double konversiNilai(String nilaiHuruf) {
        double nilaiSetara = 0.0;
        switch (nilaiHuruf) {
            case "A":
                nilaiSetara = 4.0;
                break;
            case "A-":
                nilaiSetara = 3.7;
                break;
            case "B+":
                nilaiSetara = 3.3;
                break;
            case "B":
                nilaiSetara = 3.0;
                break;
            case "B-":
                nilaiSetara = 2.7;
                break;
            case "C+":
                nilaiSetara = 2.3;
                break;
            case "C":
                nilaiSetara = 2.0;
                break;
            case "C-":
                nilaiSetara = 1.7;
                break;
            case "D+":
                nilaiSetara = 1.3;
                break;
            case "D":
                nilaiSetara = 1.0;
                break;
            case "E":
                nilaiSetara = 0.0;
                break;
        }
        return nilaiSetara;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah yang diambil pada semester lalu: ");
        int jumlahMatkul = input.nextInt();

        double totalSKS = 0;
        double totalBobot = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            String namaMatkul = input.next();
            System.out.print("Bobot SKS: ");
            int bobotSKS = input.nextInt();
            System.out.print("Nilai huruf: ");
            String nilaiHuruf = input.next();

            // Hitung nilai setara
            double nilaiSetara = konversiNilai(nilaiHuruf);

            // Hitung total SKS dan total bobot
            totalSKS += bobotSKS;
            totalBobot += (nilaiSetara * bobotSKS);
        }

        // Hitung IP Semester
        double ipSemester = totalBobot / totalSKS;

        // Tampilkan IP Semester
        System.out.println("IP Semester Anda adalah: " + String.format("%.2f", ipSemester));
    }
}
