package medium;
import java.util.*;

public class ZigzagConvo{
    public String convert(String s, int numRows) {
        if (numRows == 1) {
        return s;
    }
    String[] rows = new String[numRows];
    for (int i = 0; i < numRows; i++) {
        rows[i] = "";
    }
    int currRow = 0;
    boolean goingDown = false;
    for (int i = 0; i < s.length(); i++) {
        rows[currRow] += s.charAt(i);
        if (currRow == 0 || currRow == numRows - 1) {
            goingDown = !goingDown;
        }
        currRow += goingDown ? 1 : -1;
    }
    StringBuilder sb = new StringBuilder();
    for (String row : rows) {
        sb.append(row);
    }
    return sb.toString();
    }
}