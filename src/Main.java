public class Main {
    public static void main(String[] args) {
        RestService count = new RestService();
        int Month = count.calculate(100_000, 13_000);
        System.out.println(Month);

    }
}
