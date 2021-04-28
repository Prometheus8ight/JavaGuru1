package students.deniss_jankovskis.lesson_14.level_6;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {


    public Optional<Integer> findMaxValueFromAllTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(new ComparatorFromMaxToMin())
                .map(Transaction::getValue)
                .findAny();
    }

    public Optional<Integer> findMinValueFromAllTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(new ComparatorFromMinToMax())
                .map(Transaction::getValue)
                .findAny();
    }

    public String findAllNamesInAlphabetOrder(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String findAllCitiesInAlphabetOrder(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }
}
