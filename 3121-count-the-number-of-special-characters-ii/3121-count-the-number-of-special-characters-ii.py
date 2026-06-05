class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        last_small = [-1] * 26
        first_capital = [-1] * 26

        # Step 1: Record indices of characters
        for i, ch in enumerate(word):
            if ch.islower():
                idx = ord(ch) - ord('a')
                last_small[idx] = i
            else:
                idx = ord(ch) - ord('A')
                # Only set if it hasn't been encountered before (first occurrence)
                if first_capital[idx] == -1:
                    first_capital[idx] = i

        count = 0

        # Step 2: Check conditions for special characters
        for i in range(26):
            if last_small[i] != -1 and first_capital[i] != -1 and last_small[i] < first_capital[i]:
                count += 1

        return count
        