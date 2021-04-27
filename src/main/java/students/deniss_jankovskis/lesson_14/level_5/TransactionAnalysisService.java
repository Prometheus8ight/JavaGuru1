package students.deniss_jankovskis.lesson_14.level_5;

import java.util.List;

public class TransactionAnalysisService {

    public boolean isAnyTraderBasedInCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }
}
