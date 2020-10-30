package Gun34StatikAndNonStatic.Tasks.Task1;

public class UniversiteDersKayit {
    // Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    // Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    // öğrencilere eklenecek.
    // 1- Adım : Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız : fields: name, hour
    // 2- Adım : Ders oluşturma metodunu yazınız.



    public static void main(String[] args) {

        Lesson mat101 = Lesson.createLesson("mat",6);
        Lesson fiz101 = Lesson.createLesson("fiz",4);
        Lesson java101 = Lesson.createLesson("java",6);

        Student ogr1 =Student.createStudent("Mehmet",20);
        Student ogr2 =Student.createStudent("Ayşe",12);

        ogr1.lessonAdd(mat101);
        ogr1.lessonAdd(fiz101);
        ogr1.lessonAdd(java101);

        ogr2.lessonAdd(mat101);
        ogr2.lessonAdd(fiz101);
        ogr2.lessonAdd(java101);

        ogr1.printLessons();
        ogr2.printLessons();






    }
}
