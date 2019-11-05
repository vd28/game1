import java.util.Random;
public class Game {
   private int _number;

   Game() {
      _number = 0 + (int) (Math.random() * 100);
   }


   public int get_number() {
      return _number;
   }

}