import java.util.Scanner;

public class MataKuliahMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Input Data Mata Kuliah ===");
        System.out.print("Masukkan Kode MK: ");
        String kodeMK = scanner.nextLine();
        
        System.out.print("Masukkan Nama MK: ");
        String namaMK = scanner.nextLine();
        
        System.out.print("Masukkan SKS: ");
        int sks = scanner.nextInt();
        scanner.nextLine();
        
        Matakuliah matakuliah = new Matakuliah(kodeMK, namaMK, sks);
        
        System.out.println();
        System.out.println("=== Test Method cetakInfo() ===");
        matakuliah.cetakInfo();
        
        System.out.println();
        System.out.println("=== Test Method ubahNamaMK() ===");
        System.out.print("Masukkan Nama MK baru: ");
        String namaBaru = scanner.nextLine();
        matakuliah.ubahNamaMK(namaBaru);
        
        System.out.println();
        System.out.println("=== Test Method ubahSKS() ===");
        System.out.print("Masukkan SKS baru: ");
        int sksBaru = scanner.nextInt();
        scanner.nextLine();
        matakuliah.ubahSKS(sksBaru);
        
        System.out.println();
        System.out.println("=== Test Method tambahDosen() ===");
        System.out.println("Masukkan data dosen pengampu:");
        System.out.print("NIDN: ");
        String nidn = scanner.nextLine();
        
        System.out.print("Nama: ");
        String namaDosen = scanner.nextLine();
        
        System.out.print("Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Jenjang Pendidikan (S1/S2/S3): ");
        String jenjangPendidikan = scanner.nextLine();
        
        System.out.print("Program Studi: ");
        String prodi = scanner.nextLine();
        
        Dosen dosen = new Dosen(nidn, namaDosen, tahunMasuk, jenjangPendidikan, prodi);
        matakuliah.tambahDosen(dosen);
        
        System.out.println();
        System.out.println("=== Info Mata Kuliah Setelah Semua Perubahan ===");
        matakuliah.cetakInfo();
        
        scanner.close();
    }
}

