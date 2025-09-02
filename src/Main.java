public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new Buku("Bumi", "Tere Liye");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Anggota anggota1 = new Anggota("Rina");

        perpustakaan.tampilkanDaftarBuku();
        anggota1.pinjamBuku(perpustakaan.cariBuku("Laskar Pelangi"));
        anggota1.tampilkanBukuDipinjam();

        anggota1.kembalikanBuku(perpustakaan.cariBuku("Laskar Pelangi"));
        anggota1.tampilkanBukuDipinjam();

        perpustakaan.tampilkanDaftarBuku();
    }
}
