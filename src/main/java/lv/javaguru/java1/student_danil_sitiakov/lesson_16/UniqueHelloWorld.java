package lv.javaguru.java1.student_danil_sitiakov.lesson_16;

public class UniqueHelloWorld {
    public class UniqueThreadHelloWorld {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(new HelloWorldRunnable());
                thread.start();
            }
        }

        static class HelloWorldRunnable implements Runnable {
            private static int counter = 0;
            private final int threadNumber;

            public HelloWorldRunnable() {
                synchronized (HelloWorldRunnable.class) {
                    threadNumber = counter++;
                }
            }

            @Override
            public void run() {
                System.out.println("[" + threadNumber + "] Hello World");
            }
        }
    }
}
