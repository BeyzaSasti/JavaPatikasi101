package StudentInformationSystem;
/*Course Class Features:
Qualifications: name,code,prefix,note,Teacher
Methods: Course() , addTeacher() , printTeacher()*/
public class Course { // Değişkenleri(nitelikleri) atıyoruz.
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int quiz1;
    int quiz2;
    int quiz3;
    int note;

    public Course(String name, String code, String prefix) { //Constructer(Kurucu) metodu oluşturuyoruz.
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    //Davranışları (their Behavior) oluşturuyoruz.
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) { //Dışardan oluşturulan öğretmen bilgisiyle...
            this.courseTeacher = t; //...içerde bulunan branşın uyuştuğu veya uçuşmadığı durum
        } else {                    //...durum için oluşturulmuş koşul bloğu.
            System.out.println(t.name + " Akademisyeni bu dersi veremez !");
        }
        this.printTeacherInfo();
    }

    public void printTeacher () { //Öğretmenlerden birinin kurs eşitliği olduğu ve olmadığı...
        if (courseTeacher != null) { //...durumlar için oluşturulmuş koşul bloğu.
            System.out.println(this.name + " dersinin Akademisyeni: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    void printTeacherInfo () { // Çıktı almak için oluşturulmuş kod bloğu.
        this.printTeacher();
    }
}
