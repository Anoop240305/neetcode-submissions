class Solution:
    def getSum(self, a: int, b: int) -> int:
        m = 0xFFFFFFFF
        max_int = 0x7FFFFFFF

        while b != 0:
            carry = (a & b) << 1
            a = (a ^ b) & m
            b = carry & m
        return a if a <= max_int else ~(a ^ m)
         