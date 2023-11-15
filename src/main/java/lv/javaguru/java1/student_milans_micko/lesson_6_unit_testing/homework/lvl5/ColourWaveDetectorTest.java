package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl5;

public class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest colourWaveDetectorTest = new ColourWaveDetectorTest();
        colourWaveDetectorTest.testcase1();
        colourWaveDetectorTest.testcase2();
        colourWaveDetectorTest.testcase3();
        colourWaveDetectorTest.testcase4();
        colourWaveDetectorTest.testcase5();
        colourWaveDetectorTest.testcase6();
        colourWaveDetectorTest.testcase7();
    }
    //testcase1: 400 ; expected result: Violet
    public void testcase1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(400);
        if (result.equals("Violet")) {
            System.out.println("TestCase1 result 400 is Violet => OK");
        } else {
            System.out.println("TestCase1 result 400 is Violet => FALSE");
        }
    }
    //testcase1: 470 ; expected result: Blue
    public void testcase2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(470);
        if (result.equals("Blue")) {
            System.out.println("TestCase2 result 470 is Blue => OK");
        } else {
            System.out.println("TestCase2 result 470 is Blue => FALSE");
        }
    }
    //testcase1: 500 ; expected result: Green
    public void testcase3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(500);
        if (result.equals("Green")) {
            System.out.println("TestCase3 result 500 is Green => OK");
        } else {
            System.out.println("TestCase3 result 500 is Green => FALSE");
        }
    }
    //testcase1: 580 ; expected result: Yellow
    public void testcase4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(580);
        if (result.equals("Yellow")) {
            System.out.println("TestCase4 result 580 is Yellow => OK");
        } else {
            System.out.println("TestCase4 result 580 is Yellow => FALSE");
        }
    }
    //testcase1: 611 ; expected result: Orange
    public void testcase5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(611);
        if (result.equals("Orange")) {
            System.out.println("TestCase5 result 611 is Orange => OK");
        } else {
            System.out.println("TestCase5 result 611 is Orange => FALSE");
        }
    }
    //testcase1: 635 ; expected result: Red
    public void testcase6() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(635);
        if (result.equals("Red")) {
            System.out.println("TestCase6 result 635 is Red => OK");
        } else {
            System.out.println("TestCase6 result 635 is Red => FALSE");
        }
    }
    //testcase1: -300 ; expected result: Invisible Light
    public void testcase7() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(-300);
        if (result.equals("Invisible Light")) {
            System.out.println("TestCase7 result -300 is Invisible Light => OK");
        } else {
            System.out.println("TestCase7 result -300 is Invisible Light => FALSE");
        }
    }

}
