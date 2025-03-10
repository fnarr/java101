public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary > 1000){
            return this.salary * 0.03;
        }else {
            return 0;
        }
    }
    double bonus(){
        if(workHours > 40){
            int perHourPrice, bonusHour;
            bonusHour = workHours - 40;
            perHourPrice = bonusHour * 30;
            return perHourPrice;
        } else{
            return 0;
        }
    }
    double raiseSalary(){
        int year = 2021;
        int yearsWorked = year - this.hireYear;
        double rSalary;
        if(yearsWorked < 10){
            rSalary = this.salary * 0.05;
            return rSalary;
        }else if (yearsWorked > 9 && yearsWorked < 20){
            rSalary = this.salary * 0.1;
            return rSalary;
        } else if (yearsWorked > 19) {
            rSalary = this.salary * 0.15;
            return rSalary;
        } else {
            return 0;
        }
    }
    void employeeInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        double totalSalary = this.salary - tax() + bonus();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary);
        double lastSalary = totalSalary + raiseSalary();
        System.out.println("Toplam Maaş: " + lastSalary);
    }
}
