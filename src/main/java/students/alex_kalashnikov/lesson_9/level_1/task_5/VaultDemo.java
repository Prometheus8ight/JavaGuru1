package students.alex_kalashnikov.lesson_9.level_1.task_5;

class VaultDemo {

    public static void main(String[] args) {

        Vault newVault = new Vault("1234", 25000.0);
        System.out.println(newVault.getMoney());

        newVault.setMoney(50000); // внос денег
        System.out.println(newVault.getMoney());

        newVault.setMoney(-30000); // снятие денег
        System.out.println(newVault.getMoney());

        newVault.setMoney(-100000);
        System.out.println(newVault.getMoney());

    }

}