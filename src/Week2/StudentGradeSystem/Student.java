package Week2.StudentGradeSystem;

public class Student {

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matSozlu, int fizikSozlu, int kimyaSozlu) {

        if ((mat >= 0 && mat <= 100) && (matSozlu>=0 && matSozlu<=100)) {
            this.mat.note = mat;
            this.mat.sozlu = matSozlu;
        }

        if ((fizik >= 0 && fizik <= 100) && (fizikSozlu>=0 && fizikSozlu<=100)) {
            this.fizik.note = fizik;
            this.fizik.sozlu = fizikSozlu;
        }

        if ((kimya >= 0 && kimya <= 100) && (kimyaSozlu>=0 && kimyaSozlu<=100)) {
            this.kimya.note = kimya;
            this.kimya.sozlu = kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizikAvg = (this.fizik.note*0.8)+(this.fizik.sozlu*0.2);
        double matAvg = (this.mat.note*0.85)+(this.mat.sozlu*0.15);
        double kimyaAvg = (this.kimya.note*0.7)+(this.kimya.sozlu*0.3);
        this.average = (fizikAvg+matAvg+kimyaAvg) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.sozlu);
    }

}
