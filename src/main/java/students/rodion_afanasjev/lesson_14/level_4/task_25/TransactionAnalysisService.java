package students.rodion_afanasjev.lesson_14.level_4.task_25;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
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

    public List<Integer> findAllTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findTransactionTraderName(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toSet());
    }

    public Set<String> findTransactionTraderCity(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    public Set<String> findTransactionTraderFromCamp(List<Transaction> transactions, String city){
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public boolean ifTradersFromMilan(List<Transaction> transactions, String city){
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    public Optional<Integer> findMaxTransactionValue(List<Transaction> transactions){
        return transactions.stream()
                .max(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue);
    }

    public Optional<Integer> findMinTransactionValue(List<Transaction> transactions){
        return transactions.stream()
                .min(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue);
    }

    public String findAndSortTradersName(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String findAndSortTraderCities(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(","));
    }

}
