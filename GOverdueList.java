import java.util.ArrayList;

public class GOverdueList<E extends LibraryItem> {
    // OverdueList<E> overdueItems = new OverdueList<E>();
    ArrayList<E> overdueItems;

    GOverdueList() {
        overdueItems = new ArrayList<>();
    }

    public void addOverdueItem(E item) {
        overdueItems.add(item);
    }

    public void removeOverdueItem(E item) {
        overdueItems.remove(item);
    }

    public void printOverdueItems() {
        for (E item : overdueItems) {
            System.out.println(item);
        }
    }
}