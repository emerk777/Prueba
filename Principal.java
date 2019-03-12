import java.util.*;
import java.text.*;

public class Principal{

public static void main(String[] args) {

  Random rand = new Random();
  System.out.println(rand.nextInt(10));

  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
  Date date = new Date();
  System.out.println(dateFormat.format(date));

}
r

}
