import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        Person tenth = new Person("Fedya", "Smolov", 3);
        Person seventieth = new Person("Kostya", "Tyukavin", 5);
        Person fortySeventh = new Person("Arsen", "Zakharyan", 7);
        Person seventh = new Person("Dima", "Skopintsev", 8);
        Person first = new Person("Anton", "Shunin", 1);
        List<Person> fcdin = new LinkedList<>();
        fcdin.add(tenth);
        fcdin.add(seventieth);
        fcdin.add(fortySeventh);
        fcdin.add(first);
        fcdin.add(seventh);
        return fcdin;
    }

    public static void main(String[] agrs) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person riding = queue.poll();
            System.out.println(riding + " прокатился на аттракционе!");
            int ticets = riding.wasted();
            if (ticets > 0) {
                queue.offer(riding);
                continue;
            }
            continue;
        }
    }
}
