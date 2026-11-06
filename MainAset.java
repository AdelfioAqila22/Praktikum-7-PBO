import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        ArrayList<AsetDigital> asetList = new ArrayList<>();
        asetList.add(new Gambar("G001", "Pemandangan.jpg", 3.5, "1920x1080"));
        asetList.add(new Video("V001", "Tutorial_java.mp4", 150.0, 45));
        asetList.add(new Dokumen("D001", "Laporan_PBO.pdf", 2.1, 20));
        asetList.add(new VideoPromosi("VP001", "Teaser_Project.mp4", 85.0, 5));

        System.out.println("==== DAFTAR SEMUA ASET DIGITAL ====");
        for (AsetDigital aset : asetList) {
            aset.getInfo();
            aset.tampilkanPreview();

            if (aset instanceof DapatDipromosikan) {
                System.out.print("[INFO] ");
                DapatDipromosikan dp = (DapatDipromosikan) aset;
                dp.promosikan();
            }
            System.out.println("-------------------------------------");
        }

        System.out.println("\n==== KELOMPOK ASET YANG DIPOMOSIKAN ====");
        ArrayList<DapatDipromosikan> promoList = new ArrayList<>();
        promoList.add((VideoPromosi) asetList.get(3));

        for (DapatDipromosikan promo : promoList) {
            promo.promosikan();
            promo.infoPromosi();
        }
    }
}
