package introexceptiontrace.numbers;

public class Change {
    RandomOperations randomOperations = new RandomOperations();

    public int[] changeNumbers() {
        int[] numbers = new RandomOperations().getNumbers();
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        return numbers;
    }
}
