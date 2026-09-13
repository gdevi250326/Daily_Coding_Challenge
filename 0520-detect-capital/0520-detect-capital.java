class Solution {

    public boolean detectCapitalUse(String word) {

        int upper = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            }
        }

        return upper == 0
            || upper == word.length()
            || (upper == 1 && Character.isUpperCase(word.charAt(0)));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna