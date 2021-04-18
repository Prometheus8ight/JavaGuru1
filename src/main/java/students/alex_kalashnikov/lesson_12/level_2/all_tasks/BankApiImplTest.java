package students.alex_kalashnikov.lesson_12.level_2.all_tasks;

import java.util.ArrayList;
import java.util.Optional;

class BankApiImplTest {

    public static void main(String[] args) throws AccessDeniedException {

        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.testFindByUid1();
        bankApiImplTest.testFindByUid2();
        bankApiImplTest.testFindByUid3();
        bankApiImplTest.testFindByUid4();

    }

    void test(Optional<BankClient> expectedResult, Optional<BankClient> realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByUid1() throws AccessDeniedException {
        BankApiImpl victim = new BankApiImpl(new ArrayList<>());
        victim.getClients().add(new BankClient("1", "A"));
        victim.getClients().add(new BankClient("15", "F"));
        victim.getClients().add(new BankClient("1567", "G"));
        victim.getClients().add(new BankClient("23", "X"));
        victim.getClients().add(new BankClient("435", "J"));
        Optional<BankClient> expectedResult = Optional.of(new BankClient("1567", "G"));
        UserCredentials user = new UserCredentials(new ArrayList<>());
        user.getRoles().add(Role.CAN_SEARCH_CLIENTS);
        test(expectedResult, victim.findByUid(user, "1567"));
    }

    void testFindByUid2() {
        BankApiImpl victim = new BankApiImpl(new ArrayList<>());
        victim.getClients().add(new BankClient("1", "A"));
        victim.getClients().add(new BankClient("15", "F"));
        victim.getClients().add(new BankClient("1567", "G"));
        victim.getClients().add(new BankClient("23", "X"));
        victim.getClients().add(new BankClient("435", "J"));
        UserCredentials user = new UserCredentials(new ArrayList<>());
        try {
            victim.findByUid(user, "1567");
            System.out.println("Test is FAILED!");
        } catch (AccessDeniedException ex) {
            System.out.println("Test is OK!");
        }
    }

    void testFindByUid3() throws AccessDeniedException {
        BankApiImpl victim = new BankApiImpl(new ArrayList<>());
        victim.getClients().add(new BankClient("1", "A"));
        victim.getClients().add(new BankClient("15", "F"));
        victim.getClients().add(new BankClient("1567", "G"));
        victim.getClients().add(new BankClient("23", "X"));
        victim.getClients().add(new BankClient("435", "J"));
        Optional<BankClient> expectedResult = Optional.empty();
        UserCredentials user = new UserCredentials(new ArrayList<>());
        user.getRoles().add(Role.CAN_SEARCH_CLIENTS);
        test(expectedResult, victim.findByUid(user, "465"));
    }

    void testFindByUid4() throws AccessDeniedException {
        BankApiImpl victim = new BankApiImpl(new ArrayList<>());
        Optional<BankClient> expectedResult = Optional.empty();
        UserCredentials user = new UserCredentials(new ArrayList<>());
        user.getRoles().add(Role.CAN_SEARCH_CLIENTS);
        test(expectedResult, victim.findByUid(user, "465"));
    }

}