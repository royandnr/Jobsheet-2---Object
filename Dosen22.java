public class Dosen22 {
    // Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Dosen22() {
        idDosen = "";
        nama = "";
        statusAktif = false;
        tahunBergabung = 0;
        bidangKeahlian = "";
    }

    // Konstruktor Berparameter
    public Dosen22(String idDosen, String nama, boolean statusAktif, 
                   int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method tampilInformasi()
    void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("-----------------------------");
    }

    // Method setStatusAktif()
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    // Method hitungMasaKerja()
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method ubahKeahlian()
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}