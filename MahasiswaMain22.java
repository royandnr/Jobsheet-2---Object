public class MahasiswaMain22 {
    public static void main(String[] args) {

        Mahasiswa22 mhs1 = new Mahasiswa22();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkaninformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkaninformasi();

        Mahasiswa22 mhs2 = new Mahasiswa22("Annisa Nabila", "2241720160", "SI 2J", 3.25);
        mhs2.updateIPK(3.30);
        mhs2.tampilkaninformasi();

        Mahasiswa22 mhsRoyan = new Mahasiswa22("Royan Danar Sadewa", "254107060133", "SIB 1F", 3.80);
        mhsRoyan.tampilkaninformasi();
    }
}