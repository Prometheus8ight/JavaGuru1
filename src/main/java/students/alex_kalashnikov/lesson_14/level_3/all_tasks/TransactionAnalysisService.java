package students.alex_kalashnikov.lesson_14.level_3.all_tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> sortByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    /*
    если параметр year не указан,
    то возвращает все транзакции
     */
    List<Transaction> sortByYear(List<Transaction> transactions) {
        return new ArrayList<>(transactions);
    }

    List<Transaction> sortByIncreasingValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortByDecreasingValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> sortByYearAndIncreasingValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

}