import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minPathCostTest1() {
        int[][] grid = {
                {5, 3},
                {4, 0},
                {2, 1}
        };
        int[][] moveCost = {
                {9, 8},
                {1, 5},
                {10, 2},
                {18, 6},
                {2, 4},
                {14, 3}
        };
        int expected = 17;
        int actual = new Solution().minPathCost(grid, moveCost);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minPathCostTest2() {
        int[][] grid = {
                {5, 1, 2},
                {4, 0, 3}
        };
        int[][] moveCost = {
                {12, 10, 15},
                {20, 23, 8},
                {21, 7, 1},
                {8, 1, 13},
                {9, 10, 25},
                {5, 3, 2}
        };
        int expected = 6;
        int actual = new Solution().minPathCost(grid, moveCost);
        Assert.assertEquals(expected, actual);
    }

}
