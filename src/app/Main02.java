package app;

public class Main02 {
    static int number;
    static int Day;
    static double totalsale;
    static double res;
    private static final String EUR = "EUR";
    static String device;
    public static void main(String[] args) {
        number = 1;
        totalsale = 12153.41;
        Day = 5;
        device = "smartphone";
        res = totalsale / Day;
        System.out.print("Product No " + number + ":" + device + "," +
                "\ntotal sales for " + Day + " days is " + EUR + " " + totalsale + "," +
                "\nsales by day is " + EUR + " " +Math.round(res) + ".");
        number = 2;
        totalsale = 10486.85;
        Day = 7;
        device = "laptop";
        res = totalsale / Day;
        System.out.print("\nProduct No " + number + ":" + device + "," +
                "\ntotal sales for " + Day + " days is " + EUR + " " + totalsale + "," +
                "\nsales by day is " + EUR + " " +Math.round(res) + ".");
    }
}
