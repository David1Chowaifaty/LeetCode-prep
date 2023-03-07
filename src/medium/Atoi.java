package medium;

public class Atoi {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;

        // ignore leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // handle sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // convert digits to integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            // check for integer overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        // apply sign and clamp to 32-bit range
        result *= sign;
        return result;
    }
}
