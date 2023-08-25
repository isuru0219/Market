import Entities.Item;
import Repositories.ItemDAO;

public class Main {
    public static void main(String[] args)
{

    
   try {
            Item item = new Item();
    
            item.name = "sis";
            item.description = "des";
            item.quantity = 2;
            item.price = 2000;
           
    
            ItemDAO itemRepo = new ItemDAO();
    
            itemRepo.createItem(item);
    
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class not found: " + e.getMessage());
        }
    
    }
}
