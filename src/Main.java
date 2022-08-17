public class Main {

    public static void main(String [] args) {
        int [] sales={34200, 45000, 28600, 35800, 44800};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
