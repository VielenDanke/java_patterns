package kz.danke.patterns.behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        Iterator<ThemeColor> iterator = ThemeColor.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
