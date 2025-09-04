public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih(){
        return hargaKotor - diskon * hargaKotor;
    }

    public void displayInfo(){
        System.out.println("kode: " + kode);
        System.out.println("nama: " + nama);
        System.out.println("harga kotor: " + hargaKotor);
        System.out.println("diskon: " + diskon);
        System.out.println("harga bersih: " + getHargaBersih());
    }
}




