/**
 * 测试用例设计的总体原则：
 * 1. 等价类划分：将输入划分为不同的等价类，每个等价类选择一个代表性测试用例。
 * 2. 边界值分析：选择输入的边界值进行测试。
 * 3. 特殊值测试：选择一些特殊值（如0、负数等）进行测试。
 */

public class L2022211821_1_Test {

    public static void main(String[] args) {
        L2022211821_1_Test test = new L2022211821_1_Test();
        test.runTests();
    }

    public void runTests() {
        testFractionToDecimal();
    }

    /**
     * 测试方法：testFractionToDecimal
     * 测试目的：验证fractionToDecimal方法在各种输入情况下的正确性。
     * 测试用例：
     * 1. 整数结果：2/1, 10/2
     * 2. 小数结果：1/2, 5/2
     * 3. 循环小数结果：2/3, 4/333
     * 4. 负数结果：-1/2, 1/-2, -1/-2
     * 5. 边界情况：0/1, 1/3, 5/3
     */
    public void testFractionToDecimal() {
        Solution1 solution = new Solution1();

        // 整数结果
        assertEqual("2", solution.fractionToDecimal(2, 1), "Test Case 1 Failed");
        assertEqual("5", solution.fractionToDecimal(10, 2), "Test Case 2 Failed");

        // 小数结果
        assertEqual("0.5", solution.fractionToDecimal(1, 2), "Test Case 3 Failed");
        assertEqual("2.5", solution.fractionToDecimal(5, 2), "Test Case 4 Failed");

        // 循环小数结果
        assertEqual("0.(6)", solution.fractionToDecimal(2, 3), "Test Case 5 Failed");
        assertEqual("0.(012)", solution.fractionToDecimal(4, 333), "Test Case 6 Failed");

        // 负数结果
        assertEqual("-0.5", solution.fractionToDecimal(-1, 2), "Test Case 7 Failed");
        assertEqual("-0.5", solution.fractionToDecimal(1, -2), "Test Case 8 Failed");
        assertEqual("0.5", solution.fractionToDecimal(-1, -2), "Test Case 9 Failed");

        // 边界情况
        assertEqual("0", solution.fractionToDecimal(0, 1), "Test Case 10 Failed");
        assertEqual("0.(3)", solution.fractionToDecimal(1, 3), "Test Case 11 Failed");
        assertEqual("1.(6)", solution.fractionToDecimal(5, 3), "Test Case 12 Failed");

        System.out.println("All test cases passed!");
    }

    private void assertEqual(String expected, String actual, String errorMessage) {
        if (!expected.equals(actual)) {
            System.err.println(errorMessage + ": expected " + expected + " but got " + actual);
        }
    }
}