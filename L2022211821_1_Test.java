public class L2022211821_1_Test {

    public static void main(String[] args) {
        L2022211821_1_Test test = new L2022211821_1_Test();
        test.runTests();
    }

    public void runTests() {
        testFractionToDecimal();
    }

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