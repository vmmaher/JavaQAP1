public class AccountTest {
    public static void main(String[] args) {
        // 3a: Create an Account object named acc1 with a balance of 5000, and an Account object named acc2 with a balance of 4000.
        Account acc1 = new Account("John", 1, 5000);
        Account acc2 = new Account("Jane", 2, 4000);

        // 3b: Print the balance for both accounts.
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());

        // 3c: Transfer 1000 from acc1 to acc2.
        acc1.transferTo(acc2, 1000);
        System.out.println("Transferred 1000 from acc1 to acc2.");

        // 3d: Print the balance for both accounts.
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
    }
}
