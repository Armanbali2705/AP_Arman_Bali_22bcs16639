public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> charMap = new HashMap<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
        if (charMap.containsKey(s.charAt(right))) {
            left = Math.max(left, charMap.get(s.charAt(right)) + 1);
        }
        charMap.put(s.charAt(right), right);
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
}
