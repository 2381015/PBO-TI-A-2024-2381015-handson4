public class contohMethodStaticDanNonStatic {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        double luasPersegi = contohMethodStaticDanNonStatic.hitungLuasPersegi(20);
        System.out.println("Luas persegi: " + luasPersegi);

        contohMethodStaticDanNonStatic object = new contohMethodStaticDanNonStatic();
        object.tampilkanPesanSelamatDatang("Daniel Hutabarat");
    }

    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang, " + nama + " !");
    }
}
