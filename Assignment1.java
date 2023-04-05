package April05IO;



//public class Assignment1 {
class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        notify(); 
        try {
            wait(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void withdraw(int amount) {
        if (balance < amount) {
            try {
                System.out.println("Waiting for deposit...");
                wait(); // wait for deposit before withdrawing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        notify(); // wake up any waiting thread
    }
}

class Depositor extends Thread {
   BankAccount account;

    public Depositor(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            account.deposit(i * 100);
        }
    }
}

class Withdrawer extends Thread {
    private BankAccount account;

    public Withdrawer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            account.withdraw(i * 50);
        }
    }
}

public class Assignment1{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        Depositor depositor = new Depositor(account);
        Withdrawer withdrawer = new Withdrawer(account);

        depositor.start();
        withdrawer.start();
    }
}
