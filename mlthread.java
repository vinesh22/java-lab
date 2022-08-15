import java.util.Random;

class odd implements Runnable {
    int x;

    public odd(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("this is odd thread " + x + " the cube of the number is : " + x * x * x);
    }

}

class even implements Runnable {
    int x;

    public even(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("this is eventhread " + x + " the square of the number is :" + x * x);
    }
}

class mainthread extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            System.out.println("this is main thread num is " + num);
            if (num % 2 == 0) {
                Thread t1 = new Thread(new even(num));
                t1.start();
            } else {
                Thread t2 = new Thread(new odd(num));
                t2.start();
            }
            try {
                Thread.sleep(1000);
                System.out.println("-----------------------------------------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class mlthread {
    public static void main(String[] args) {
        mainthread y = new mainthread();
        y.start();
    }
}
