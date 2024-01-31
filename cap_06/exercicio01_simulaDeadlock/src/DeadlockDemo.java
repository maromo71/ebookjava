public class DeadlockDemo {

    public static void main(String[] args) {
        final String recurso1 = "Recurso 1";
        final String recurso2 = "Recurso 2";

        // Thread 1: bloqueia recurso1 e depois recurso2
        Thread thread1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 1: bloqueou recurso 1");

                try { Thread.sleep(100);} catch (Exception e) {}

                synchronized (recurso2) {
                    System.out.println("Thread 1: bloqueou recurso 2");
                }
            }
        });

        // Thread 2: bloqueia recurso2 e depois recurso1
        Thread thread2 = new Thread(() -> {
            synchronized (recurso2) {
                System.out.println("Thread 2: bloqueou recurso 2");

                try { Thread.sleep(100);} catch (Exception e) {}

                synchronized (recurso1) {
                    System.out.println("Thread 2: bloqueou recurso 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
