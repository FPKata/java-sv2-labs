package mathproblems;

public class Division {
    public void getDivisors(int number){
        for (int i =1; i <= number; i++){
            if (number % i == 0){
                System.out.println(number + " osztója: " + i);
            }
        }
    }

    public void getRightNumbers(int[] numbers){
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] % i == 0){
                System.out.println(numbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(60);
        System.out.println("----------");
        int[] numbers = {11, -2, 4, 9, 5, -10, 6, 2};
        division.getRightNumbers(numbers);
    }
}
