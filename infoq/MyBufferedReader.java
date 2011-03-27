import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
  
public class MyBufferedReader extends BufferedReader {
  public MyBufferedReader(Reader r) {
    super(r);
  }
 
  public void close() throws IOException {
    System.out.println("fechando o BufferedStream");
    super.close();
  }
}

