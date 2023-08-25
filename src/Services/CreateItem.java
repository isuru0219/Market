package Services;

public class CreateItem {
    public int CreatItem(int price,String name,String description,int quantity)
    {
        Item item = new Item;

        item.price = price;
        item.name = name;
        item.description = description;
        item.quantity = quantity;


        ItemDAO itemDAO = new ItemDAO();
        itemDAO.creatItem(Item);

    }
     public int ReadTtem(int price,String name,String description,int quantity)
    {
        Item item = new Item;

        item.price = price;
        item.name = name;
        item.description = description;
        item.quantity = quantity;


        ItemDAO itemDAO = new ItemDAO();
        itemDAO.readItem(Item);

    }
     public int UpdateItem(int price,String name,String description,int quantity)
    {
        Item item = new Item;

        item.price = price;
        item.name = name;
        item.description = description;
        item.quantity = quantity;


        ItemDAO itemDAO = new ItemDAO();
        itemDAO.updateItem(Item);
        
    }
    public int DeleteItem(int price,String name,String description,int quantity)
    {
        Item item = new Item;

        item.price = price;
        item.name = name;
        item.description = description;
        item.quantity = quantity;


        ItemDAO itemDAO = new ItemDAO();
        itemDAO.deleteItem(Item);
        
    }

    
}
