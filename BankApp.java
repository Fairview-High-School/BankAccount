public class BankApp {

    public static void main(String[] args)
    {

        BankAccount checking = new BankAccount("011111", "Gesell-checking",
                                                1000.00, "password");

        System.out.println(checking);

    }
}
