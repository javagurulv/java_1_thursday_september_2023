package lv.javaguru.java1.teacher.lesson_7_array_for.homework.solutions.level_6_senior.task_1;

class AssetManagementTest {

    public static void main(String[] args) {
        AssetManagementTest test = new AssetManagementTest();
        test.shouldCalculateTotalAssetValue();
        test.shouldCalculateAverageReturnPercentage();
    }

    public void shouldCalculateTotalAssetValue() {
        Stock[] stocks = {
                new Stock("ABC", 10000.0, 10.0),
                new Stock("XYZ", 10000.0, 10.0)
        };
        AssetManagement assetManagement = new AssetManagement();
        double totalAssetValue = assetManagement.calculateTotalAssetValue(stocks);
        checkResult(totalAssetValue, 20000.0, "shouldCalculateTotalAssetValue");
    }

    public void shouldCalculateAverageReturnPercentage() {
        Stock[] stocks = {
                new Stock("ABC", 10000.0, 10.0),
                new Stock("XYZ", 5000.0, 20.0)
        };
        AssetManagement assetManagement = new AssetManagement();
        double averageReturnPercentage = assetManagement.calculateAverageReturnPercentage(stocks);
        checkResult(averageReturnPercentage, 13.333333333333334, "shouldCalculateAverageReturnPercentage");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! realResult = " + realResult + " expectedResult = " + expectedResult);
        }
    }


}
