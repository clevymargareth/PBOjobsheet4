
public class Main {
    public static void main(String[] args) {
        Meja meja5 = new Meja(5, 4);

        Menu m1 = new Menu("MN01", "Nasi Goreng Spesial", 25000);
        Menu m2 = new Menu("MN02", "Es Teh Manis", 5000);
        Menu m3 = new Menu("MN03", "Ayam Bakar", 30000);

        Pesanan pesananMeja5 = new Pesanan("ORD-005", meja5);

        pesananMeja5.tambahMenu(m1);
        pesananMeja5.tambahMenu(m2);
        pesananMeja5.tambahMenu(m3);

        pesananMeja5.cetakStruk();
    }
}