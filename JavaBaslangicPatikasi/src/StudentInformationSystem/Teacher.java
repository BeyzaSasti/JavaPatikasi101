package StudentInformationSystem;

/*Teacher Class Features:
Qualifications : name,mpno,branch
Methods : Teacher()
 */
public class Teacher { // Değişkenleri(nitelikleri) atıyoruz.
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) { //Constructer(Kurucu) metodu oluşturuyoruz.
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    //Davranışları (their Behavior) oluşturuyoruz.
    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bölümü: " + this.branch);
    }
}
