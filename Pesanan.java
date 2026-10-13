import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private Meja meja; 
    private ArrayList<Menu> daftarMenu; 

    public Pesanan(String idPesanan, Meja meja) {
        this.idPesanan = idPesanan;
        this.meja = meja;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
        System.out.println(menu.getNamaMenu() + " ditambahkan ke pesanan.");
    }

    public double hitungTotal() {
        double total = 0;
        for (Menu m : daftarMenu) {
            total += m.getHarga();
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("\n=== Struk Pesanan: " + idPesanan + " ===");
        System.out.println("Nomor Meja: " + meja.getNomorMeja());
        System.out.println("Rincian Pesanan:");
        
        if (daftarMenu.isEmpty()) {
            System.out.println("- Belum ada menu dipesan.");
        } else {
            for (Menu m : daftarMenu) {
                System.out.println("- " + m.getNamaMenu() + " : Rp" + m.getHarga());
            }
            System.out.println("----------------------------------------");
            System.out.println("Total Bayar: Rp" + hitungTotal());
        }
    }
}