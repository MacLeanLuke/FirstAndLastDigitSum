public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int firstDigit = number % 10;
        while (number >= 10){
            number /= 10;
            if (number % 10 == 0){
                return (number / 10) + firstDigit;
            }
        }
        int lastDigit = number % 10;
        return firstDigit + lastDigit;
    }
}
