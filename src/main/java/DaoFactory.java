public class DaoFactory {
private static Items itemsDao;

public static Items getItemsDao() {
    if(itemsDao == null) {
        itemsDao = new ListItemsDao();
    }
    return itemsDao;
}

}