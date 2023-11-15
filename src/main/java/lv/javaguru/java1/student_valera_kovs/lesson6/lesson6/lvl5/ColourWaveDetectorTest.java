package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6.lvl5;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest colourWaveDetectorTest = new ColourWaveDetectorTest();
        colourWaveDetectorTest.testСase1();
        colourWaveDetectorTest.testСase2();
        colourWaveDetectorTest.testСase3();
        colourWaveDetectorTest.testСase4();
        colourWaveDetectorTest.testСase5();
        colourWaveDetectorTest.testСase6();
        colourWaveDetectorTest.testСase7();
    }

    public void testСase1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(420);
        if (result.equals("Violet")) {
            System.out.println("TestCase1 380 =< 420 =< 449  Violet = OK");
        } else {
            System.out.println("TestCase1 380 => 420 => 449 Violet = FALSE");
        }
    }

    public void testСase2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(480);
        if (result.equals("Blue")) {
            System.out.println("TestCase2 450 =< 480 =< 494  Blue = OK");
        } else {
            System.out.println("TestCase2 450 => 480 => 494 is Blue = FALSE");
        }
    }

    public void testСase3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(550);
        if (result.equals("Green")) {
            System.out.println("TestCase3 495 =< 550 =< 569  Green = OK");
        } else {
            System.out.println("TestCase3 495 => 550 => 569 Green = FALSE");
        }
    }

    public void testСase4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(577);
        if (result.equals("Yellow")) {
            System.out.println("TestCase4 570 =< 577 =< 589 Yellow = OK");
        } else {
            System.out.println("TestCase4 570 => 577 => 589 Yellow = FALSE");
        }
    }

    public void testСase5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(599);
        if (result.equals("Orange")) {
            System.out.println("TestCase5 590 =< 599 =< 619 Orange = OK");
        } else {
            System.out.println("TestCase5 590 => 599 => 619  Orange = FALSE");
        }
    }

    public void testСase6() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(700);
        if (result.equals("Red")) {
            System.out.println("TestCase6 620 =< 700 =< 750 Red = OK");
        } else {
            System.out.println("TestCase6 620 => 700 => 750 Red = FALSE");
        }
    }

    public void testСase7() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(800);
        if (result.equals("Invisible Light")) {
            System.out.println("TestCase7  800 Invisible Light = OK");
        } else {
            System.out.println("TestCase7  800 Invisible Light = FALSE");
        }
    }

}