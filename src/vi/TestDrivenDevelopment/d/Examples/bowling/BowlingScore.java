package vi.TestDrivenDevelopment.d.Examples.bowling;

public class BowlingScore
{
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int popice)
    {
        rolls[currentRoll++] = popice;
    }

    public int score()
    {
        int score = 0;
        int firstInFrame = 0;

        for(int frame = 0; frame < 10; frame++)
        {
            if(isStrike(rolls[firstInFrame]))
            {
                score += 10 + nextTwoRolls(firstInFrame);
                firstInFrame+=1;
            }
            else if(isSpare(firstInFrame))
            {
                score += 10 + nextAfterSpare(firstInFrame);
                firstInFrame+=2;
            }
            else
            {
                score += scoreInFrame(firstInFrame);
                firstInFrame += 2;
            }
        }

        return score;
    }

    private int nextAfterSpare(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private int nextTwoRolls(int firstInFrame) {
        return rolls[firstInFrame + 1] + rolls[firstInFrame + 2];
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }

    private int scoreInFrame(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private boolean isSpare(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1] == 10;
    }
}
