import model.entities.Deparment;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Deparment obj = new Deparment(1, "Books");
        Seller seller = new Seller(21, "Matheus", "matheus@gmail.com", new Date(), 3000.0, obj);;

        System.out.println(obj);
    }
}
