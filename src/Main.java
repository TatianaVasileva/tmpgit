public class Main {


    public static void main(String[] args) {
        long[] sales = {35000, 45000, 28000, 36000, 47000, 54000};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
        System.out.println(manager.avgTrimmed());
    }
}
