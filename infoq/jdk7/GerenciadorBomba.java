public class GerenciadorBomba {
  private static final int SEM_LEITURA   = 0b00;
  private static final int DESLIGADA     = 0b01;
  private static final int LIGADA        = 0b10;
  private static final int ALARME        = 0b11;

  private static final String[] MENSAGENS = {"nao disponivel", "desligada", "ligada", "alarme"};

  public static int lerEstado() {
    return (int)(Math.random()*0b100);
  }

  public static void main(String[] args) {
    System.out.printf("Os estados possiveis sao: %s(%d) %s(%d), %s(%d), %s(%d)\n\n",
      MENSAGENS[SEM_LEITURA], SEM_LEITURA, MENSAGENS[DESLIGADA], DESLIGADA,
      MENSAGENS[LIGADA], LIGADA, MENSAGENS[ALARME], ALARME);

    int st = lerEstado();
    while (st != SEM_LEITURA) {
        System.out.printf("O estado da bomba e: %s\n", MENSAGENS[st]);
        st = lerEstado();
    }
  }
}

