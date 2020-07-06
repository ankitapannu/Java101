package main;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class LC1342_NumSteps {
	public static int numberOfStepsV1(int num) {
        int steps = 0; 
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                steps++;
            } else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
	
	public static int numberOfStepsV2(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 2 == 0) {
            return (1 + numberOfStepsV2(num/2));
        } else {
            return (1 + numberOfStepsV2(num-1));
        }
    }
}
