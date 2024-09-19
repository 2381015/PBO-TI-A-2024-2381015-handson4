public class contohParameterMethod {
    public static int kaliDuA(int angka) {
        return angka * 2;
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        int hasilKaliDua = kaliDuA(5);
        System.out.println("5 x 2 = " + hasilKaliDua);

        double luasSegitiga = hitungLuasSegitiga(5, 2);
        System.out.println("Luas segitiga = " + luasSegitiga);
    }
}
