package Task5;

public class Teacher extends People {
    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }

    public String getSubject() {
        return subject;
    }

    public String getProfession() {
        return super.getProfession();
    }

    public int getAge() {
        return super.getAge();
    }

    public String getName() {
        return super.getName();
    }
}