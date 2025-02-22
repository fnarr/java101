import java.util.Scanner;

public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    Scanner inp = new Scanner(System.in);

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int vMat, int fizik,  int vFizik, int kimya, int vKimya){
        if (mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
        }
        if (vMat >= 0 && vMat <= 100){
            this.mat.vNote = vMat;
        }
        if (vFizik >= 0 && vFizik <= 100){
            this.fizik.vNote = vFizik;
        }
        if (vKimya >= 0 && vKimya <= 100){
            this.kimya.vNote = vKimya;
        }

    }

    public void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.vNote == 0 ||  this.fizik.vNote == 0 ||  this.kimya.vNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*0.8 + this.fizik.vNote*0.2)+ (this.kimya.note*0.8 + this.kimya.vNote*0.2) + (this.mat.note*0.8 + this.mat.vNote*0.2)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlüsü : " + this.mat.vNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlüsü : " + this.fizik.vNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlüsü : " + this.kimya.vNote);
    }

    public void noteEntry(Student st){
        System.out.println("=========================");
        System.out.println("Öğrenci " + st.name + " Notlarını Girin");
        System.out.print("Matematik Notunu Girin: ");
        this.mat.note = inp.nextInt();
        System.out.print("Matematik Sözlüsünü Girin: ");
        this.mat.vNote = inp.nextInt();
        System.out.print("Fizik Notunu Girin: ");
        this.fizik.note = inp.nextInt();
        System.out.print("Fizik Sözlüsünü Girin: ");
        this.fizik.vNote = inp.nextInt();
        System.out.print("Kimya Notunu Girin: ");
        this.kimya.note = inp.nextInt();
        System.out.print("Kimya Sözlüsünü Girin: ");
        this.kimya.vNote = inp.nextInt();
        st.addBulkExamNote(this.mat.note, this.mat.vNote, this.fizik.note, this.fizik.vNote, this.kimya.note, this.kimya.vNote);
    }

}
