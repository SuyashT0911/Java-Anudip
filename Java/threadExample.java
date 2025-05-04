class threadExample extends Thread {
    public static void main(String[] args) {
      threadExample t = new threadExample();
      t.start();
      System.out.println("This code is outside of the thread");
    }
    @Override
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }