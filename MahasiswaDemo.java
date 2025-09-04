public class MahasiswaDemo {

    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        mahasiswa m2 = new mahasiswa();
        m2.nim = "123456";
        m2.nama = "Budi Santoso";
        m2.alamat = "Jakarta, Indonesia";
        m2.kelas = "2D";

        mahasiswa m3 = new mahasiswa();
        m3.nim = "654321";
        m3.nama = "Siti Aminah";
        m3.alamat = "Bandung, Jawa Barat";
        m3.kelas = "2B";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}