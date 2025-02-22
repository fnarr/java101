public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","555","MAT");
        Teacher t2 = new Teacher("Graham Bell", "000","FZK");
        Teacher t3 = new Teacher("Külyutmaz", "111", "KMY");

        Course kimya = new Course("Kimya","KMY101","KMY");
        Course fizik = new Course("Fizik", "101", "FZK");
        Course mat = new Course("Matematik", "101", "MAT");

        kimya.addTeacher(t3);
        fizik.addTeacher(t2);
        mat.addTeacher(t1);

        Student s1 = new Student("İnek Şaban", "123", 4, mat, fizik, kimya);
        s1.noteEntry(s1);
        s1.isPass();
        Student s2 = new Student("Güdük Necmi", "444", 4, mat, fizik, kimya);
        s2.noteEntry(s2);
        s2.isPass();
        Student s3 = new Student("Hayta İsmail", "221", 4, mat, fizik, kimya);
        s3.noteEntry(s3);
        s3.isPass();

    }
}