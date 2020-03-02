import java.util.ArrayList;
import java.util.List;

public class ListItemsDao implements Items {
    private List<Item> items;

public List<Item> all() {
if(items == null) {
items = generateItems();
}
return items;
}

    private List<Item> generateItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Gum", 75));
        items.add(new Item(2, "Laffy Taffy", 99));
        items.add(new Item(3, "Reeses", 77));
        items.add(new Item(4, "Snickers", 60));
        items.add(new Item(5, "Nettle Tea", 90));
        items.add(new Item(6, "Shrimp", 72));
        items.add(new Item(7, "Pen", 50));

        return items;

    }

}
