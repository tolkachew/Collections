package com.company;
/*
    Шаблон Observer (Listeners)
*/

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Child child = new Child();
        Mother mother = new Mother(child);
        child.addObserver(mother);
        child.make();
    }
}

class Child extends Observable {

    public void make() {
        setChanged();
        notifyObservers();

    }
}

class Mother implements Observer {
    private Child child;

    public Mother(Child child) {
        this.child = child;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == child)
            System.out.println("mother is observing");
    }
}

/*
https://github.com/KirillovItstep/classworks/blob/main/GK_Java_3_0_1_ver_2019_1568814230.pdf
 */
