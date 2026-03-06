import java.util.Scanner;

public class Matakuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private Dosen[] dosenPengampu;
    private int jumlahDosen; 

    public Matakuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new Dosen[10];
        this.jumlahDosen = 0;
    }
    
    public void cetakInfo(){  
        System.out.println("=== Informasi Matakuliah ===");
        System.out.println("kodeMK          :"+ kodeMK);
        System.out.println("namaMK          :"+ namaMK);
        System.out.println("SKS             :"+ sks);
        if (jumlahDosen > 0) {
            System.out.println("Dosen Pengampu   :");
            for (int i = 0; i < jumlahDosen; i++) {
                Dosen d = dosenPengampu[i];                

            }
        }
    }
    
    public void ubahNamaMK(String namaMK){
        this.namaMK = namaMK;
        System.out.println("namaMK telah diubah menjadi: " + namaMK);
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru < 2) {
            System.out.println("SKS tidak boleh kurang dari 2. Perubahan dibatalkan.");
        } else {
            this.sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi: " + sksBaru);
        }
    }

    public void tambahDosen(Dosen dosen) {
        if (jumlahDosen == dosenPengampu.length) {
            Dosen[] newArr = new Dosen[dosenPengampu.length * 2];
            System.arraycopy(dosenPengampu, 0, newArr, 0, dosenPengampu.length);
            dosenPengampu = newArr;
        }
        dosenPengampu[jumlahDosen++] = dosen;
    }

    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Input Data Matakuliah ==");
        System.out.print("Masukkan kodeMK: ");
        String kodeMK = scanner.nextLine();

        System.out.print("Masukkan namaMK: ");
        String namaMK = scanner.nextLine();

        System.out.print("Masukkan SKS: ");
        int sks = scanner.nextInt();
        scanner.nextLine();

        Matakuliah matakuliah = new Matakuliah(kodeMK, namaMK, sks);

        System.out.println();
        matakuliah.cetakInfo();  

        System.out.println("\n=== Menu ===");
        System.out.print("Apakah Anda ingin mengubah Nama Mata Kuliah? (y/n): ");
        String pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan namaMK baru: ");
            String namaBaru = scanner.nextLine();
            matakuliah.ubahNamaMK(namaBaru);
        }

        System.out.print("Apakah Anda ingin mengubah SKS? (y/n): ");
        pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan SKS baru: ");
            int sksBaru = scanner.nextInt();
            scanner.nextLine();
            matakuliah.ubahSKS(sksBaru);
        }

        System.out.print("Apakah Anda ingin menambahkan dosen pengampu? (y/n): ");
        pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("y")) {
            System.out.println("Masukkan data dosen:");
            System.out.print("NIDN: ");
            String nidnD = scanner.nextLine();
            System.out.print("Nama: ");
            String namaD = scanner.nextLine();
            System.out.print("Tahun Masuk: ");
            int tahunD = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Jenjang Pendidikan: ");
            String jenjangD = scanner.nextLine();
            System.out.print("Program Studi: ");
            String prodiD = scanner.nextLine();

            Dosen dosenBaru = new Dosen(nidnD, namaD, tahunD, jenjangD, prodiD);
            matakuliah.tambahDosen(dosenBaru);
        }

        System.out.println();
        matakuliah.cetakInfo();  

        System.out.println("");
        scanner.close();
    }

}