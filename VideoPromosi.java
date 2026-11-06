public class VideoPromosi extends Video implements DapatDipromosikan {
    public VideoPromosi(String id, String namaFile, double ukuranMB, int durasiMenit) {
        super(id, namaFile, ukuranMB, durasiMenit);
    }

    @Override
    public void promosikan() {
        System.out.println(">> Video Promosi sedang disiarkan di halaman utama!");
        infoPromosi();
    }
}