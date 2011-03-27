public class SeparadorLiteraisNumericos {
  public static void main(String[] args) {
    byte b =  1_2_7;
    int v1 = 999_999;
    int v2 = 100_000 - 1_000;
    Integer i1 = new Integer(12_12_12_1);
    Integer i2 = new Integer(1_2_1_2_1_2_1);
    double f = 123_456.3_4_1;
    System.out.printf("O valor de b e': %d\n", b);
    System.out.printf("O valor de v1 e': %d\n", v1);
    System.out.printf("O valor de v2 e': %d\n", v2);
    System.out.printf("i1 e i2 sao iguais?: %b\n", i1.equals(i2));
    System.out.printf("O valor de f e': %.4f\n", f);
  }
}
