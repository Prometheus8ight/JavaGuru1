package students.julija_katukova.lesson_14.level_3;

import java.util.List;
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

}