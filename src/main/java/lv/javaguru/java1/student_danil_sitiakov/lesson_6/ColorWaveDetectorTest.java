package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class ColorWaveDetectorTest {
    public static void main(String[] args) {
        ColorWaveDetectorTest colorWaveDetectorTest = new ColorWaveDetectorTest();
        colorWaveDetectorTest.isViolet();
        colorWaveDetectorTest.isBlue();
        colorWaveDetectorTest.isGreen();
        colorWaveDetectorTest.isYellow();
        colorWaveDetectorTest.isOrange();
        colorWaveDetectorTest.isRed();
        colorWaveDetectorTest.isInvisibleLight();
        colorWaveDetectorTest.isInvisibleLightV2();

    }

    void isViolet(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(391);
        checkResult(wave, "Violet" ,"Violet Test ");

    }

    void isBlue(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(451);
        checkResult(wave, "Blue" ,"Blue Test ");

    }

    void isGreen(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(496);
        checkResult(wave, "Green" ,"Green Test ");

    }

    void isYellow(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(571);
        checkResult(wave, "Yellow" ,"Yellow Test ");

    }

    void isOrange(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(591);
        checkResult(wave, "Orange" ,"Orange Test ");

    }

    void isRed(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(700);
        checkResult(wave, "Red" ,"Red Test ");

    }

    void isInvisibleLight(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(200);
        checkResult(wave, "Invisible Light" ,"Invisible Light Test ");

    }

    void isInvisibleLightV2(){
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String wave = colorWaveDetector.colourWave(900);
        checkResult(wave, "Invisible Light" ,"Invisible Light Test ");

    }

    void checkResult(String result, String expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL! Expected " + expectedResult + " but result = " + result);
        }
    }
}
