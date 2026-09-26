package full;

public abstract class Payment {
    abstract void pay();

    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new Card();

        upi.pay();
        card.pay();

        Customer customer = new Customer("Praneeth", 5000.0);
        customer.addMoney(1500.0);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Current Balance: " + customer.getBalance());
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment Done using UPI");
    }
}

class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Payment Done using Card");
    }
}

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
