public class UnderscoreAsSeparator {
 
  public static void main(String[] args) {
    int x = 10_000;
    int y = 3_333;
    long l = 123_123_123_123L;
    double f = 123_456.3_4_1;
 
    System.out.printf("O valor de x e: %d\n", x);
    System.out.printf("O valor de y e: %d\n", y);
    System.out.printf("O valor de l e: %d\n", l);
    System.out.printf("O valor de f e: %.4f\n", f);
    System.out.printf("O valor de x+y e: %d\n", x+y);
  }
}
