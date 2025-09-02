import java.util.ArrayList;

public class Anggota {
    private String nama;
    private ArrayList<Buku> bukuDipinjam;

    public Anggota(String nama) {
        this.nama = nama;
        this.bukuDipinjam = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.isDipinjam()) {
            buku.pinjam();
            bukuDipinjam.add(buku);
        } else {
            System.out.println("Buku \"" + buku.getJudul() + "\" tidak tersedia.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (bukuDipinjam.contains(buku)) {
            buku.kembalikan();
            bukuDipinjam.remove(buku);
        } else {
            System.out.println("Buku \"" + buku.getJudul() + "\" tidak dipinjam oleh " + nama);
        }
    }

    public void tampilkanBukuDipinjam() {
        System.out.println("Buku yang dipinjam oleh " + nama + ":");
        for (Buku buku : bukuDipinjam) {
            System.out.println("- " + buku.getJudul());
        }
    }
}
