class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        ans = [0] * len(prices)
        stack = []      # acts as a decreasing stack from the right

        for i in range(len(prices) - 1, -1, -1):
            while stack and prices[i] < stack[-1]:
                stack.pop()

            small = 0 if not stack else stack[-1]
            ans[i] = prices[i] - small

            stack.append(prices[i])

        return ans
