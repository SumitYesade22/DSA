
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        helper(digits, 0, 0, 0, used, set);
        return set.size();
    }

    void helper(int[] digits, int num, int count, int start, boolean[] used, Set<Integer> set) {
        if (count == 3) {
            if (num % 2 == 0) set.add(num);
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (used[i]) continue;
            if (count == 0 && digits[i] == 0) continue; // no leading zero

            used[i] = true;
            helper(digits, num * 10 + digits[i], count + 1, i + 1, used, set);
            used[i] = false;
        }
    }
}
