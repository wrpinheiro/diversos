public class BitLiteral {
  private static final int NONE   = 0b0___0;
  private static final int CLOSED = 0b0_1;
  private static final int OPEN   = 0b1___0;
  private static final int ALARM  = 0b1_1;

  private static final String[] MESSAGES = {"NONE", "CLOSED", "OPEN", "ALARM"};

  public static int readStatus() {
    return (int)(Math.random()*0b100);
  }

  public static void main(String[] args) {
    System.out.printf("The notable statuses are: %s(%d) %s(%d), %s(%d), %s(%d)\n\n",
      MESSAGES[NONE], NONE, MESSAGES[CLOSED], CLOSED,
      MESSAGES[OPEN], OPEN, MESSAGES[ALARM], ALARM);

    int st = readStatus();
    while (st != NONE) {
        System.out.printf("Valve state is: %s\n", MESSAGES[st]);
        st = readStatus();
    }
  } 
}

