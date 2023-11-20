package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.homework.level5;

public class ColorWaveDetectorTest {

    public static void main(String[] args) {
        ColorWaveDetectorTest colorWaveDetectorTest = new ColorWaveDetectorTest();
        colorWaveDetectorTest.n1();
        colorWaveDetectorTest.n2();
        colorWaveDetectorTest.n3();
        colorWaveDetectorTest.n4();
        colorWaveDetectorTest.n5();
        colorWaveDetectorTest.n6();
        colorWaveDetectorTest.n7();
    }




        public void n1() {
            ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
            String result = colorWaveDetector.colorWave(400);
            if (result.equals("Violet")) {
                System.out.println("Wave: " + 400 + " " + result + " - OK");
            } else {
                System.out.println("Wave: " + 400 + " " + result + " - FAIL");
            }
        }
    public void n2() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String result = colorWaveDetector.colorWave(470);
        if (result.equals("Blue")) {
            System.out.println("Wave: " + 470 + " " + result + " - OK");
        } else {
            System.out.println("Wave: " + 470 + " " + result + " - FAIL");
        }
    }
    public void n3() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String result = colorWaveDetector.colorWave(550);
        if (result.equals("Green")) {
            System.out.println("Wave: " + 550 + " " + result + " - OK");
        } else {
            System.out.println("Wave: " + 550 + " " + result + " - FAIL");
        }
    }
    public void n4() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String result = colorWaveDetector.colorWave(580);
        if (result.equals("Yellow")) {
            System.out.println("Wave: " + 580 + " " + result + " - OK");
        } else {
            System.out.println("Wave: " + 580 + " " + result + " - FAIL");
        }
    }
    public void n5() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String result = colorWaveDetector.colorWave(600);
        if (result.equals("Orange")) {
            System.out.println("Wave: " + 600 + " " + result + " - OK");
        } else {
            System.out.println("Wave: " + 600 + " " + result + " - FAIL");
        }
    }
    public void n6() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String result = colorWaveDetector.colorWave(650);
        if (result.equals("Red")) {
            System.out.println("Wave: " + 650 + " " + result + " - OK");
        } else {
            System.out.println("Wave: " + 650 + " " + result + " - FAIL");
        }
    }
    public void n7() {
        ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
        String result = colorWaveDetector.colorWave(100);
        if (result.equals("Invisible Light")) {
            System.out.println("Wave: " + 100 + " " + result + " - OK");
        } else {
            System.out.println("Wave: " + 100 + " " + result + " - FAIL");
        }
    }






}




