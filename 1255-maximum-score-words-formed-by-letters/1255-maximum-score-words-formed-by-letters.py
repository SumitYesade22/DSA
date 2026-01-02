class Solution:
    def maxScoreWords(self, words: List[str], letters: List[str], score: List[int]) -> int:
        freq = [0]*26
        for ch in letters:
            freq[ord(ch) - ord('a')] += 1
            
        self.maxScore = float('-inf')
        self.n = len(words)

        def solve(i, currScore, freq):
            
            self.maxScore = max(self.maxScore, currScore)

            if i >= self.n:
                return

            
            tempFreq = freq[:]         
            j = 0
            tempScore = 0
            valid = True

            for ch in words[i]:
                idx = ord(ch) - ord('a')
                tempFreq[idx] -= 1
                tempScore += score[idx]
                if tempFreq[idx] < 0:
                    valid = False
                    break

          
            if valid:
                solve(i + 1, currScore + tempScore, tempFreq)

            
            solve(i + 1, currScore, freq)

        solve(0, 0, freq)
        return self.maxScore
        