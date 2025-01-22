public class Account {
    private int id;
    private String name;
    private int balance = 0;

    public Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Account(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance. Transfer failed. Printing current balance.");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance. Transfer failed. Printing current balance.");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
