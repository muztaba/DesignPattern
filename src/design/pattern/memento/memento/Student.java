package design.pattern.memento.memento;

/**
 * Created by seal on 3/23/2016.
 */
public class Student implements IMemento {

    private String name;
    private int age;
    private double cGPA;

    public Student(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setcGPA(double cGPA) {
        this.cGPA = cGPA;
    }

    private static class Memento {
        int age;
        double cGPA;

        public Memento(int age, double cgpa) {
            this.age = age;
            this.cGPA = cgpa;
        }

    }

    public Memento getMemento() {
        return new Memento(age, cGPA);
    }

    @Override
    public void restore(Object obj) {
        Memento memento = (Memento) obj;
        age = memento.age;
        cGPA = memento.cGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cGPA=" + cGPA +
                '}';
    }
}
