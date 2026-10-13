
public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;

    public Menu(String kodeMenu, String namaMenu, double harga) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public double getHarga() {
        return harga;
    }
}