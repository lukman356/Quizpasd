import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data dosen
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
        System.out.println("=== Test Method CetakInfo() ===");
        dosen.CetakInfo();
        
        System.out.println();
        System.out.println("=== Test Method ubahProdi() ===");
        System.out.print("Masukkan Program Studi baru: ");
        String prodiBaru = scanner.nextLine();
        dosen.ubahProdi(prodiBaru);
        
        System.out.println();
        System.out.println("=== Test Method ubahPendidikan() ===");
        System.out.print("Masukkan Jenjang Pendidikan baru: ");
        String pendidikanBaru = scanner.nextLine();
        dosen.ubahPendidikan(pendidikanBaru);
        
        System.out.println();
        System.out.println("=== Info Dosen Setelah Perubahan ===");
        dosen.CetakInfo();
        
        scanner.close();
    }
}
