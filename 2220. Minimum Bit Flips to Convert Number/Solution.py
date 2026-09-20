class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        Ans = start ^ goal
        count = 0

        while Ans > 0:
            if Ans&1 == 1:
                count += 1
            Ans = Ans>>1

        return count
