
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck < 0)
            return false;
        
        int length = 0;
        int temp = numberToCheck;
        int sum = 0;

        if (numberToCheck == 0) {
            length = 1;
        }
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        temp = numberToCheck;
        while (temp > 0) {
            int digit = temp % 10;

            int pow = 1;
            for (int i = 0; i < length; i++) {
                pow *= digit; 
            }

            sum += pow;

            temp /= 10;

        }
        return sum == numberToCheck;
    }

}
