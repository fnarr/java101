public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.vNote = 0;
    }


    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("İşlem Başarılı");
        }else {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }

    }

    void printTeacher(){
        if (teacher != null){
            System.out.println(this.name + " Akademisyeni bu dersi veremez." + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanamamıştır.");
        }
    }

}
