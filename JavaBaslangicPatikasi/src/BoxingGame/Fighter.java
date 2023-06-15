package BoxingGame;

public class Fighter {
    // Nitelikleri oluşturuyoruz.
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    // Kurucu metot oluşturuyoruz.
    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    // Davranışlar için kod blokları oluşturuyoruz.
    int hit(Fighter foe) { //Oyuncuların karşılıkları hamleleri için kod blokları oluşturuyoruz.
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) { //Hasarı savurmak için bir koşul bloğu oluşturuyoruz.
            System.out.println(foe.name + " gelen hasarı savurdu!");
            System.out.println("---------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) { // Sağlıktan alınan hasarı çıkarıyoruz ki kalan canı hesaplayalım.
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge () { //Hasar için oran hesabı yapıyoruz.
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
