package com.arya.singleinheritance;

import com.arya.singleinheritance.classes.Child;

public class MainChild {
    public MainChild() {
        Child child=new Child();
        child.setFirstName("Kabir");
        child.setLastName("Ahlawat");
        System.out.println(child.getFirstName() + child.getLastName());

        // Costructor are not inherited in child class
//		Child child1 = new Parent();

        Child child2 = new Child("Raj", "Singhaniya");
    }
}