package com.java.epam;

import com.java.epam.controller.Controller;
import com.java.epam.model.Model;
import com.java.epam.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        //Run
        controller.processUser();
    }
}
