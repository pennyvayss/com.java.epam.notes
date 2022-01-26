package com.java.epam.controller;

import com.java.epam.view.View;

import java.util.Scanner;

import static com.java.epam.controller.RegexContainer.*;
import static com.java.epam.controller.RegexContainer.REGEX_LOGIN;
import static com.java.epam.view.TextConstant.*;
import static com.java.epam.view.TextConstant.LOGIN_DATA;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

        public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.inputStringValueWithScanner (FIRST_NAME, str);

        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
        }

    public void inputLogin() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str =(String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }


}
