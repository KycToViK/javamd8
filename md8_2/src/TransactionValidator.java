public class TransactionValidator {
    // объявите константы
    public static final int MIN_AMOUNT = 1;
    public static final int MAX_AMOUNT = 5000;

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    public static boolean isValidAmount(Double amount) {
        if (amount > MIN_AMOUNT && amount < MAX_AMOUNT)
            return true;
        else if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT){
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
        return false;
        }
        else
            return false;

    }
}
