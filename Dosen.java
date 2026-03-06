
import java.util.Scanner;

public class Dosen {
    private String nidn;
    private String nama;
    private int tahunMasuk;
    private String jenjangPendidikan;
    private String prodi;

    public Dosen(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    public void CetakInfo() {
        System.out.println("=== Informasi Dosen ===");
        System.out.println("NIDN                : " + nidn);
        System.out.println("Nama                : " + nama);
        System.out.println("Tahun Masuk         : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan  : " + jenjangPendidikan);
        System.out.println("Program Studi       : " + prodi);
    }

    public void ubahProdi(String prodi) {
        this.prodi = prodi;
        System.out.println("Program Studi telah diubah menjadi: " + prodi);
    }

    public void ubahPendidikan(String pendidikanBaru) {
        this.jenjangPendidikan = pendidikanBaru;
        System.out.println("Jenjang Pendidikan telah diubah menjadi: " + pendidikanBaru);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Input Data Dosen ===");
        System.out.print("Masukkan NIDN: ");
        String nidn = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Masukkan Jenjang Pendidikan (S1/S2/S3): ");
        String jenjangPendidikan = scanner.nextLine();
        
        System.out.print("Masukkan Program Studi: ");
        String prodi = scanner.nextLine();
        
        Dosen dosen = new Dosen(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
        
        System.out.println();
        dosen.CetakInfo();
        
        System.out.println("\n=== Menu ===");
        System.out.print("Apakah Anda ingin mengubah Program Studi? (y/n): ");
        String pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Program Studi baru: ");
            String prodiiBaru = scanner.nextLine();
            dosen.ubahProdi(prodiiBaru);
        }
        
        System.out.print("Apakah Anda ingin mengubah Jenjang Pendidikan? (y/n): ");
        pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Jenjang Pendidikan baru: ");
            String pendidikanBaru = scanner.nextLine();
            dosen.ubahPendidikan(pendidikanBaru);
        }
        
        System.out.println();
        dosen.CetakInfo();
        
        scanner.close();
    }
}