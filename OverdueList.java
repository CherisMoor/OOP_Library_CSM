import java.util.ArrayList;

public class OverdueList<E extends LibraryItem> {
    // OverdueList<E> overdueItems = new OverdueList<E>();
    ArrayList<E> overdueItems;

    OverdueList() {
        overdueItems = new ArrayList<>();
    }

    public void addOverdueItem(E item) {
        overdueItems.add(item);
    }

    public void removeOverdueItem(E item) {
        overdueItems.remove(item);
    }
}