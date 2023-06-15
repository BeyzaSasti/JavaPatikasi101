package BoxingGame;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    // Kurucu metodu oluşturuyoruz.
    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        // Burada ilk hangi oyuncunun başlayacağını, oluşturduğumuz olasılık bloğunu dahil ederek, koşul bloğu ile oluşturuyoruz.
        if (whoFirstToAttack()) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }

        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Davranıslar
    // Sporcunun ağırlığının ağırlık aralığında olup olmadığını kontrol edecek kod bloğunu oluşturutoruz.
    boolean isCheck () {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }


    //Dövüşe ilk kimin başlayacağını entegre ediyoruz.
    boolean whoFirstToAttack () {
        double firstValue = Math.random() * 100;
        return firstValue <= 50;
    }

    void run () {
        if (isCheck()) { //maçın başlaması ve oynanaması için ilk olarak oyuncuların kilolarının eş değerliğini kontrol ediyoruz...
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("========NEW ROUND========");
                this.f2.health = this.f1.hit(f2); //... ve hamleleri oluşturuyoruz.
                if (isOkGo()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if(isOkGo()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları denk DEĞİL!");
        }
    }

    //Dövüşmenin devam edip etmediğini anlamak için bir kod (davranış) bloğu oluşturuyoruz.
    boolean isOkGo () {
        if (this.f1.health == 0) {
            System.out.println("Maçı " + this.f2.name + " KAZANDI! " + "\nMağlup Oyuncu: " + this.f1.name);
            return true;
        }
        if(this.f2.health == 0) {
            System.out.println("Maçı " + this.f1.name + " KAZANDI!" + "\nMağlup Oyuncu: " + this.f2.name);
            return true;
        }
        return false;
    }


    // Kalan can bilgisi için kod bloğu oluşturuyoruz.
    public void printScore () {
        System.out.println(this.f1.name + "Kalan Sağlık Durumu \t: " + this.f1.health);
        System.out.println(this.f2.name + "Kalan Sağlık Durumu \t: " + this.f2.health);
    }
}
