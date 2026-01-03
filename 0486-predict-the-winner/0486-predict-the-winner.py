class Solution:
    def predictTheWinner(self, nums: List[int]) -> bool:
        n = len(nums)
        self.dp = [[-1] * n for _ in range(n)]

        def solve(l, r):
            if l > r:
                return 0
            if l == r:
                return nums[l]

            if self.dp[l][r] != -1:
                return self.dp[l][r]

            take_left = nums[l] + min(
                solve(l + 2, r),
                solve(l + 1, r - 1)
            )

            take_right = nums[r] + min(
                solve(l, r - 2),
                solve(l + 1, r - 1)
            )

            self.dp[l][r] = max(take_left, take_right)
            return self.dp[l][r]

        total = sum(nums)
        player1 = solve(0, n - 1)
        player2 = total - player1

        return player1 >= player2
        