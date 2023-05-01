import java.util.Scanner;

public class TimerandStopwatch {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Press 1 for Timer or 2 for Stopwatch: ");
    int choice = input.nextInt();
    
    switch (choice) {
      case 1:
        timer();
        break;
      case 2:
        stopwatch();
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }
    
    input.close();
  }
  
  public static void timer() {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter time in seconds: ");
    int time = input.nextInt();
    
    for (int i = time; i >= 0; i--) {
      System.out.println(i + " seconds remaining.");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println("Time's up!");
    
    input.close();
  }
  
  public static void stopwatch() {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Press 1 to start or 2 to quit: ");
    int choice = input.nextInt();
    
    long start = 0;
    long stop = 0;
    
    switch (choice) {
      case 1:
        start = System.currentTimeMillis();
        System.out.println("Stopwatch started!");
        break;
      case 2:
        System.out.println("Quitting...");
        System.exit(0);
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }
    
    System.out.println("Press 1 to stop: ");
    choice = input.nextInt();
    
    switch (choice) {
      case 1:
        stop = System.currentTimeMillis();
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }
    
    long elapsed = stop - start;
    System.out.println("Elapsed time: " + elapsed + " milliseconds.");
    
    input.close();
  }
  
}
