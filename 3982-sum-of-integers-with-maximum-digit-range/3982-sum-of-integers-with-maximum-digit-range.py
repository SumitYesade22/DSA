class Solution:
    def maxDigitRange(self, nums: List[int]) -> int:
        sum_by_range = [0] * 10

        for num in nums:
            original = num
            max_digit = 0
            min_digit = 9
            x = num

            while x:
                max_digit = max(max_digit, x % 10)
                min_digit = min(min_digit, x % 10)
                x //= 10

            sum_by_range[max_digit - min_digit] += original

        for digit_range in range(9, -1, -1):
            if sum_by_range[digit_range]:
                return sum_by_range[digit_range]

        return 0