package students.rodion_afanasjev.lesson_14.level_3.task_18;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findByYear(List<Transaction> transactions, int year){
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortFromMinToMaxValue(List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortFromMaxToMinValue(List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findAndSortYear2011TransactionFromMinToMax(List<Transaction> transactions, int year){
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

}
