public class StringNoSwitch {
  public static void main(String[] args) {
    for (String param : args) {
      switch(param) {
        case "-test": 
          System.out.println("O programa esta sendo executado em modo teste");
          break;
        case "-silent":
          System.out.println("O programa envia poucas informacoes na saida padrao");
          break;
        case "-verbose":
          System.out.println("O programa envia muitas informacoes na saida padrao");
          break;
        default:
          System.err.printf("Parametro %s nao reconhecido\n", param);
          System.exit(-1);
      }
    }
  }
}
