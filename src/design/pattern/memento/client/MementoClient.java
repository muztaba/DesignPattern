package design.pattern.memento.client;

import design.pattern.memento.caretaker.CareTaker;
import design.pattern.memento.memento.Student;

import java.util.Scanner;

/**
 * Created by seal on 3/23/2016.
 */
public class MementoClient implements design.pattern.Client {
    @Override
    public void test() {
        Student student = new Student("Pranjol");
        CareTaker careTaker = new CareTaker();
        student.setAge(12);
        student.setcGPA(2.30);

        Scanner in = new Scanner(System.in);

        while (true) {
            switch (in.nextInt()) {
                case 1 :
                    student.setAge(in.nextInt());
                    student.setcGPA(in.nextDouble());
                    careTaker.addMemento(student.getMemento());
                    System.out.println(student);
                    break;
                case 2 :
                    careTaker.restore(student);
                    System.out.println(student);
                    break;
            }
        }

    }
}
