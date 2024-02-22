import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        int jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'L') ? "laki-laki" : "perempuan";

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = scanner.next();

        // Menghitung umur menggunakan java.time
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, DateTimeFormatter.ISO_DATE);

        LocalDate tanggalSekarang = LocalDate.now();
        float umur = tanggalSekarang.getYear() - tanggalLahir.getYear();

        // Output data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();


    }
}