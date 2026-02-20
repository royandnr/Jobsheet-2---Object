public class MataKuliahMain22 {

    public static void main(String[] args) {

        // Objek 1 → Konstruktor Default
        MataKuliah22 mk1 = new MataKuliah22();

        // Objek 2 → Konstruktor Berparameter
        MataKuliah22 mk2 = new MataKuliah22("IF101", "Pemrograman Dasar", 3, 6);

        System.out.println("=== DATA MATA KULIAH 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(3);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        System.out.println("\n=== DATA MATA KULIAH 2 ===");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(10); // contoh gagal
        mk2.kurangiJam(3);  // contoh berhasil
        mk2.tampilInformasi();
    }
}