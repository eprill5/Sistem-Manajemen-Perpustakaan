public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
        } else {
            System.out.println("Buku \"" + judul + "\" sedang dipinjam.");
        }
    }

    public void kembalikan() {
        if (dipinjam) {
            dipinjam = false;
            System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
        } else {
            System.out.println("Buku \"" + judul + "\" belum dipinjam.");
        }
    }

    public String getJudul() {
        return judul;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + " | Penulis: " + penulis + " | Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }
}
