package StudentInformationSystem;


public class StudentInformation {

   //Nesnelerimizi (Object) oluşturuyoruz.
    public static void main(String[] args) {
        //Derslere(Kurslara) nitelik bilgilerini giriyoruz.
        //Not: quiz notlarını ortalamaya dahil etmek için quiz notları derslere eşitlendi.
        Course sociology = new Course("Sosyoloji", "SOS101", "SOS");
        Course qSociology = new Course("Sosyoloji", "SOS101", "SOS");
        Course philosopy = new Course("Felsefe", "FSF101", "FELS");
        Course qPhilosopy = new Course("Felsefe", "FSF101", "FELS");
        Course science = new Course("Bilim", "BLM101", "BLM");
        Course qScience = new Course("Bilim", "BLM101", "BLM");

        // Öğretmenlerin nitelik bilgilerini atıyoruz.
        Teacher t1 = new Teacher("Ayşe Hoca", "90512234567", "SOS");
        Teacher t2 = new Teacher("Nagehan Hoca", "9051234568", "FELS");
        Teacher t3 = new Teacher("Onur Hoca", "9051234569", "BLM");

        //Branşları ve öğretmenleri birbirlerine atıyoruz.
        sociology.addTeacher(t1);
        philosopy.addTeacher(t2);
        science.addTeacher(t3);

        //Öğrencilerin nitelik ve not değerlerini atıyoruz.
        Student s1 = new Student("Beyza A.", 4, "1234506", sociology, qSociology, philosopy, qPhilosopy, science, qScience);
        s1.addBulkExamNote(80,80,90, 80,70,90);
        s1.isPass();

        Student s2 = new Student("Berkem B.", 4, "1234507", sociology, qSociology, philosopy, qPhilosopy, science, qScience);
        s2.addBulkExamNote(95,90,95, 95,90, 90 );
        s2.isPass();

        Student s3 = new Student("Deniz D.", 4, "1234508", sociology, qSociology, philosopy, qPhilosopy, science, qScience);
        s3.addBulkExamNote(60,40,75, 70, 60, 85);
        s3.isPass();
    }
}
