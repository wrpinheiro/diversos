import java.io.FileReader;

public class ResourceManagement1 {
  private static void instantiate(String className) throws Exception {
    try {
      Class<?> clazz = Class.forName(className);
      Object o = clazz.newInstance();
      System.out.println(o.getClass().getName());

    } catch (ClassNotFoundException e) {
      System.err.println("Classe nao encontrada: " + className);
      throw e;
    } catch (InstantiationException | IllegalAccessException e) {
      System.out.println("Nao foi possivel instanciar a classe: " + className);
      throw e;
    }
  }

  public static void main(String[] args) throws Exception {
    try(MyBufferedReader br = new MyBufferedReader(new FileReader(args[0]))) {
      String line;
      while ((line = br.readLine()) != null)
        instantiate(line);
    }
  }
}

