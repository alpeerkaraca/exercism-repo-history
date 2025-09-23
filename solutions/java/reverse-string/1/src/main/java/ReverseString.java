
class ReverseString {

    String reverse(String inputString) {
        if (inputString == null) {
            return null;
        }
        char[] charArray = inputString.toCharArray();
        int left = 0;
        int right = inputString.length() - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
        
        //        return new StringBuilder(inputString).reverse().toString();
        }
  
}
