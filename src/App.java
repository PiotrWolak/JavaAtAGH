public class App {
    public static void main(String[] args) {
        Item item1 = new Item("ziemniak", 2.5, 5);
        Item item2 = new Item("ziemniak", 2.5, 5);
        Item item3 = new Item("gabryska", 2.5, 5);
        Item item4 = new Item("kotlety", 2.5, 5);
        System.out.println(item1.compare(item2));
        System.out.println(item3.compare(item2));
        System.out.println(item3.compare(item4));

    }
}
