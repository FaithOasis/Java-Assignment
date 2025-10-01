public class AccountTest {

        public static void main(String[] args) throws InvalidDepositAmount, AmountExceedsBalance {

            Bank user = new Account("Faith-Oasis", 5000);


            user.deposit(300);
            user.withdraw(200);
            user.getBalance();
        }
    }

