/*We are writing a program that simulates a boxing match with Java Classes.
Task or Homework
Integrate a system that calculates with 50% probability who will start the fight first.
Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.
* */

package BoxingGame;

public class Fight {
    public static void main(String[] args) {

        // Nesneleri oluşturuyoruz.
        Fighter f1 = new Fighter("Mert", 20, 120, 100, 40);
        Fighter f2 = new Fighter ("Buğra", 20,120, 100, 38);

        Ring ring = new Ring(f1,f2, 90, 120);
        ring.run();
    }
}
