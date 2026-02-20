public class DosenMain22 {
    public static void main(String[] args) {

        // Objek 1 → menggunakan konstruktor default
        Dosen22 dosen1 = new Dosen22();
        dosen1.idDosen = "D001";
        dosen1.nama = "Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Pemrograman";

        // Objek 2 → menggunakan konstruktor berparameter
        Dosen22 dosen2 = new Dosen22(
                "D002",
                "Siti Aminah",
                true,
                2018,
                "Basis Data"
        );

        // Menampilkan informasi awal
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();

        // Mengubah status aktif dosen2
        dosen2.setStatusAktif(false);

        // Mengubah bidang keahlian dosen1
        dosen1.ubahKeahlian("Kecerdasan Buatan");

        // Menghitung masa kerja
        System.out.println("Masa kerja dosen1: " + 
                dosen1.hitungMasaKerja(2025) + " tahun");

        System.out.println("Masa kerja dosen2: " + 
                dosen2.hitungMasaKerja(2025) + " tahun");

        System.out.println("\nSetelah perubahan:");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
    }
}