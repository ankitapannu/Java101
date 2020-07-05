
public class NumSteps {
	public int numberOfSteps1(int num) {
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
	
	public int numberOfSteps2(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 2 == 0) {
            return (1 + numberOfSteps2(num/2));
        } else {
            return (1 + numberOfSteps2(num-1));
        }
    }
}
