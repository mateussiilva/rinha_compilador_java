import java.io.File;


public class Interpretador {
  public static void main(String[] args){
    File myObject = new File("teste.txt");
    System.out.printf("%s\n",myObject.read());

  }
}
