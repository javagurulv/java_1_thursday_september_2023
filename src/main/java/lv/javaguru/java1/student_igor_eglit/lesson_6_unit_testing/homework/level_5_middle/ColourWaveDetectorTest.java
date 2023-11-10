package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_5_middle;

/*
Test Case       Input wave          Expected Result         Actual Result
id1                 390                  Violet                 Violet
id2                 460                  Blue                   Blue
id3                 500                 Green                   Green
id4                 580                 Yellow                  Yellow
id5                 600                 Orange                  Orange
id6                 630                 Red                     Red
id7                 751                 Invisible Light         Invisible Light
id8                 379                 Invisible Light         Invisible Light

 */
public class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest colourWaveDetectorTest = new ColourWaveDetectorTest();
colourWaveDetectorTest.id1();
colourWaveDetectorTest.id2();
colourWaveDetectorTest.id3();
colourWaveDetectorTest.id4();
colourWaveDetectorTest.id5();
colourWaveDetectorTest.id6();
colourWaveDetectorTest.id7();
colourWaveDetectorTest.id8();
    }

    public void id1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(390);
        System.out.println(result.equals("Violet") ? "id1 390 Violet  -  OK" : "id1 390 Violet  - Fail" + result);
    }

    public void id2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(460);
        System.out.println(result.equals("Blue") ? "id2 460 Blue  -  OK" : "id2 460 Blue  - Fail" + result);
    }

    public void id3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(500);
        System.out.println(result.equals("Green") ? "id3 500 Green  -  OK" : "id3 500 Green  - Fail" + result);
    }

    public void id4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(580);
        System.out.println(result.equals("Yellow") ? "id4 580 Yellow  -  OK" : "id4 580 Yellow  - Fail" + result);
    }

    public void id5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(600);
        System.out.println(result.equals("Orange") ? "id5 600 Orange  -  OK" : "id5 600 Orange  - Fail" + result);
    }

    public void id6() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(630);
        System.out.println(result.equals("Red") ? "id6 630 Red  -  OK" : "id6 630 Red  - Fail" + result);
    }

    public void id7() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(751);
        System.out.println(result.equals("Invisible Light") ? "id7 751 Invisible Light  -  OK" : "id7 751 Invisible Light  - Fail" + result);
    }

    public void id8() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(379);
        System.out.println(result.equals("Invisible Light") ? "id8 379 Invisible Light  -  OK" : "id8 379 Invisible Light  - Fail" + result);
    }
}
