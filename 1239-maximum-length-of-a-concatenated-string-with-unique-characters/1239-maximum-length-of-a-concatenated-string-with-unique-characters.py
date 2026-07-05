from functools import cache

class Solution:
    def maxLength(self, arr: list[str]) -> int:
        n = len(arr)

        # @cache automatically uses (idx, temp) as the unique state key
        @cache
        def solve(idx, temp):
            # Base Case: Processed all words
            if idx >= n:
                return len(temp)

            # Option 1: Exclude the current word
            exclude = solve(idx + 1, temp)

            # Option 2: Include the current word (Using your Set Logic)
            include = 0
            current_word = arr[idx]
            
            # 1. Check if the word itself has all unique characters
            if len(set(current_word)) == len(current_word):
                # 2. Check if combining it with temp keeps characters unique
                if len(set(temp + current_word)) == len(temp) + len(current_word):
                    include = solve(idx + 1, temp + current_word)

            # Return the maximum length possible from this point
            return max(include, exclude)

        # Start from index 0 with an empty temp string
        return solve(0, "")
