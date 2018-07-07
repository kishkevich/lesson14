import java.util.Queue;

public class Cashbox {
        private final Queue<Customer> customers;
        private int id;
        private double money;

        public Cashbox(int id, Queue<Customer> customers) {
            this.id = id;
            this.customers = customers;
        }

        public void add(double money) {
            this.money += money;
        }
}
