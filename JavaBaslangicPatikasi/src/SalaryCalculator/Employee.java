package SalaryCalculator;

public class Employee {
    String name;
    Double salary;
    int workHours;
    int hireYear;

    // Constructor (Kurucu) Metot.
    Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // OTHER METHODS
    // Maaşa uygulanan vergi hesabı için oluşturulan kod bloğu.
    double tax() {
        double tax = 0;
        if(this.salary > 1000) {
            tax += (this.salary * 3) / 100;
        } else {
            tax = 0;
        }
        return tax;
    }

    //Çalışanın haftada 40 saatten fazla çalışdığı durumlarda uygulanan ek ücret hesabı için oluşturulmuş kod bloğu.
    double bonus() {
        double bonusFee;
        if (this.workHours > 40) {
            bonusFee = (this.workHours - 40) * 30;
        } else {
            bonusFee = 0;
        }
        return bonusFee;
    }

    // Çalışanın işe başlangıç yılına göre maaş artışını hesaplayan kod bloğu.
    double raiseSalary() {
        double increasedSalary = 0;
        if ((2021 - this.hireYear) < 10) {
            increasedSalary += (this.salary * 5) / 100;
        }
        if (((2021 - this.hireYear) > 9) && ((2021 - this.hireYear) < 20)) {
            increasedSalary += (this.salary * 10) / 100;
        }
        if ((2021 - this.hireYear) > 19) {
            increasedSalary += (this.salary * 15) / 100;
        }
        return increasedSalary;
    }

    // Çalışana ait bilgileri ekrana bastıracak kod bloğu.
    public void toPrintString () {
        System.out.println("Çalışan İsmi: " + this.name);
        System.out.println("Çalışan maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("ÇAlışma Yılı: " + this.hireYear);
        System.out.println("Uygulanan Vergi: " + tax());
        System.out.println("Artı Ücret: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary()));
        System.out.println("----------------------");
    }
}
