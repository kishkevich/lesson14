import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Shop {
    private Queue<Customer> customerQueue = new LinkedList<Customer>();
    private Set<Cashbox> cashboxes = new HashSet<Cashbox>();

    public Shop() {
        cashboxes.add(new Cashbox(1,customerQueue));
        cashboxes.add(new Cashbox(2, customerQueue));
    }

    public void start (){
        for (Cashbox cashbox : cashboxes) {

        }
    }

    public void add (Customer customer){
        customerQueue.add(customer);
    }

    public void remove (Customer customer){
        customerQueue.remove(customer);
    }

}
