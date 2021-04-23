package students.julija_katukova.lesson_14.level_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findTransactionsInSpecificYear(List<Transaction> transactions, TransactionPredicate p) {
        return transactions.stream().filter(p::test).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromSmallToBig(List<Transaction> transactions) {
        return transactions.stream().sorted(new TransactionComparatorFromSmallToBig()).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueFromBigToSmall(List<Transaction> transactions) {
        return transactions.stream().sorted(new TransactionComparatorFromBigToSmall()).collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsInSpecificYearAndSortByValueFromSmallToBig(List<Transaction> transactions, TransactionPredicate p) {
        return transactions.stream().filter(p::test)
                .sorted(new TransactionComparatorFromSmallToBig()).collect(Collectors.toList());
    }

    public List<Integer> findAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toList());
    }

    public Set<Integer> findTransactionYears(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toSet());
    }

    public Set<String> findTradersNames(List<Transaction> transactions) {
        return transactions.stream().map(transaction -> transaction.getTrader().getName()).collect(Collectors.toSet());
    }

    public Set<String> findTradersCities(List<Transaction> transactions) {
        return transactions.stream().map(transaction -> transaction.getTrader().getCity()).collect(Collectors.toSet());
    }

    public Set<String> findTradersFromSpecificCity(List<Transaction> transactions, String city) {
        return transactions.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }



}