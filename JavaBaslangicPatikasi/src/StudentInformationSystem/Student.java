package StudentInformationSystem;

/* Student Class Features:
Qualifications: name,stuNo,classes,course1,course2,course3,avarage,isPass
Methods: Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote() */
public class Student { //// Değişkenleri(nitelikleri) atıyoruz.

    String name;
    String stuNo;
    int calesses;
    Course c1;
    Course quiz1;
    Course c2;

    Course quiz2;
    Course c3;

    Course quiz3;
    double avarage = 0.0;
    boolean isPass;

    // Constructer(Kurucu) metodu oluşturuyoruz.
    Student(String name, int classes, String stuNo, Course c1, Course quiz1, Course c2, Course quiz2, Course c3, Course quiz3) {
        this.name = name;
        this.calesses = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.quiz1 = quiz1;
        this.c2 = c2;
        this.quiz2 = quiz2;
        this.c3 = c3;
        this.quiz3 = quiz3;
        calcAvarage();
        this.isPass = false;
    }

    //Davranışları (their Behavior) oluşturuyoruz.
    public void addBulkExamNote(int c1note, int c2note, int c3note, int c1quizNot, int c2quizNote, int c3quizNote) {
        if (c1note >= 0 && c1note <= 100) { //Burada koşulu notların aralık değeri için oluşturuyoruz.
            this.c1.note = c1note;
        }

        if (c2note >= 0 && c2note <= 100) {
            this.c2.note = c2note;
        }

        if (c3note >= 0 && c3note <= 100) {
            this.c3.note = c3note;
        }

        if (c1quizNot >= 0 && c1quizNot <= 100) {
            this.quiz1.note = c1quizNot;
        }

        if (c2quizNote >= 0 && c2quizNote <= 100) {
            this.quiz2.note = c2quizNote;
        }

        if (c3quizNote >= 0 && c3quizNote <= 100) {
            this.quiz3.note = c3quizNote;
        }
    }


    public void isPass() { //Notların 0 a eşit olduğu ve olmadığı durumlar için koşul bloğu oluşturuyoruz.
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Not bilgileri eksik girilmiş! ");
        } else {
            this.isPass = isCheckPass();
            printNote(); //Ortalama çıktısını alıyoruz ve...
            System.out.println("Ortalama: " + this.avarage);
            if (this.isPass) { //ortalama değerine sınıf geçme durumunu aktarıyoruz.
                System.out.println("Tebrikler ! Sınıfı Geçtiniz. ");
            } else {
                System.out.println("Sınıf geçme durumunuz BAŞARISIZ !");
            }
        }
    }

    public void calcAvarage() { //Ortalama hesaplama kod bloğunu oluşturuyoruz.
        this.avarage = (((this.c1.note * 0.8) + (this.quiz1.note * 0.2))
                + ((this.c2.note * 0.8) + (this.quiz2.note * 0.2))
                + ((this.c3.note * 0.8) + (this.quiz2.note * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage(); //Ortalamaya göre sınıf geçme durumu için puan sınırlandırması yapıyoruz.
        return this.avarage > 55;
    }

    public void printNote() {//..ve Çıktı oluşturuyoruz.
        System.out.println("============================");
        System.out.println("Öğrenci:             " + this.name);
        System.out.println("Sosyoloji Notu:      " + this.c1.note);
        System.out.println("Sosyoloji Quiz Notu: " + this.quiz1.note);
        System.out.println("Felsefe Notu:        " + this.c2.note);
        System.out.println("Felsefe Quiz Notu:   " + this.quiz2.note);
        System.out.println("Bilim Notu:          " + this.c3.note);
        System.out.println("Bilim Quiz Notu:     " + this.quiz3.note);


    }

}
