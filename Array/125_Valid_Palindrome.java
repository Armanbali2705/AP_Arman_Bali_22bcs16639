public static boolean isAlpha(char c) {
    if ((c >= '0' && c <= '9') || (Character.toLowerCase(c) >= 'a' && Character.toLowerCase(c) <= 'z')) {
        return true;
    }
    return false;
}

public static boolean isPalindrome(String str) {
    int s = 0;
    int e = str.length() - 1;
    while (s < e) {
        if (!isAlpha(str.charAt(s))) {
            s++;
            continue;
        }
        if (!isAlpha(str.charAt(e))) {
            e--;
            continue;
        }
        if (Character.toLowerCase(str.charAt(s)) != Character.toLowerCase(str.charAt(e))) {
            return false;
        } else {
            s++;
            e--;
        }
    }
    return true;
}

