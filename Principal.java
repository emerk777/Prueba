import java.util.*;
import java.text.*;

public class Principal{

public static void main(String[] args) {

  System.out.println("Hola Mundo...  ... ahora el cambio luego del commit inicial");

  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
  Date date = new Date();
  System.out.println(dateFormat.format(date));

}

}
