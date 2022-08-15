class Data {
    private int x;
    private boolean flag = false;

    public synchronized void get() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("consumed " + x);
        flag = false;
        notify();

    }

    public synchronized void put(int x) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.x = x;
        System.out.println("produced " + x);
        flag = true;
        notify();
    }
}

class producer extends Thread {
    Data d;

    public producer(Data d) {
        this.d = d;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            d.put(i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class consumer extends Thread {
    Data d;

    public consumer(Data d) {
        this.d = d;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            d.get();
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class procon {
    public static void main(String[] args) {
        Data d = new Data();
        producer p = new producer(d);
        consumer c = new consumer(d);
    }
}
