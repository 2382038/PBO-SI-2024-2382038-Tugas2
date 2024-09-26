import java.util.Scanner; //impor kelas scanner dar java util utk baca input
public class BangunDatar { //deklarasi


    // Method untuk menghitung luas dan keliling persegi
    public static void persegi(double sisi) { //deklarasi method persegi, yg terima parameter sisi (tipe double)
        double luas = sisi * sisi; //menghitung luas persegi dan di simpan variabel luas
        double keliling = 4 * sisi; //menghitung keliling dan disimpan jd variabel keliling
        System.out.println("Luas Persegi: " + luas); //menampilkan luas persegi
        System.out.println("Keliling Persegi: " + keliling);//menampilkan keliling persegi
    }

    // Method untuk menghitung luas dan keliling persegi panjang
    public static void persegiPanjang(double panjang, double lebar) { //deklarasi method, menerima parameter panjang dan lebar, utk hitung luad dan keliling
        double luas = panjang * lebar; //menghitung dan menyimpan dlm variabel
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    // Method untuk menghitung luas dan keliling lingkaran
    public static void lingkaran(double radius) {//deklarasi method lingkaran, yg menerima parameter radius
        double luas = Math.PI * radius * radius; //menghitung luas
        double keliling = 2 * Math.PI * radius; //menghitung keliling
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    public static void main(String[] args) { //deklarasi method main, bertipe void tidak mengembalikan nilai
        Scanner scanner = new Scanner(System.in); //membuat objek scanner bernama scanner buat membaca input
        int pilihan; //deklarasi variabel pilihan utk menyimpan input
        double sisi, panjang, lebar, radius; //utk menyimpan nilai parameter yg diperlukan

        do { //looping do while
            System.out.println("\nPilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt(); //utk menhyimpan input dalam variabel pilihan

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    sisi = scanner.nextDouble();
                    persegi(sisi);
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    lebar = scanner.nextDouble();
                    persegiPanjang(panjang, lebar);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    radius = scanner.nextDouble(); //utk membaca input angka desimal (tipe data double) dan disimpan dlm variabel radius
                    lingkaran(radius);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4); //loopnya akan terus berjalan sampai memilih opsi 4 (keluar)

        scanner.close(); //utk mengakhiri input dr pengguna
    }
}
