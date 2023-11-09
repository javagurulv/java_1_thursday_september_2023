package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_5_middle.task_1;

class ColourWaveDetectorTest {

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.shouldBeViolet();
        test.shouldBeBlue();
        test.shouldBeGreen();
        test.shouldBeYellow();
        test.shouldBeOrange();
        test.shouldBeRed();
        test.shouldBeInvisibleLight();
    }

    public void shouldBeViolet() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(400);
        checkResult(realResult, "Violet", "shouldBeViolet");
    }

    public void shouldBeBlue() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(460);
        checkResult(realResult, "Blue", "shouldBeBlue");
    }

    public void shouldBeGreen() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(500);
        checkResult(realResult, "Green", "shouldBeGreen");
    }

    public void shouldBeYellow() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(575);
        checkResult(realResult, "Yellow", "shouldBeYellow");
    }

    public void shouldBeOrange() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(600);
        checkResult(realResult, "Orange", "shouldBeOrange");
    }

    public void shouldBeRed() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(700);
        checkResult(realResult, "Red", "shouldBeRed");
    }

    public void shouldBeInvisibleLight() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String realResult = detector.colourWave(900);
        checkResult(realResult, "Invisible Light", "shouldBeInvisibleLight");
    }


    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
