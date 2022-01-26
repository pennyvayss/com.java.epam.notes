package com.java.epam.controller;

import com.java.epam.model.Model;
import com.java.epam.model.entity.DBNoteBook;
import com.java.epam.model.entity.NotUniqueLoginException;
import com.java.epam.model.entity.NoteBook;
import com.java.epam.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

        public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
        }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();

    }
    private NoteBook getNoteBook(InputNoteNoteBook inputNoteNoteBook) {
            NoteBook noteBook = null;
            while (true) {
                try {
                    noteBook = new NoteBook(NoteBook.getFirstName(),
                            NoteBook.getLoginData());
                    break;
                } catch (NotUniqueLoginException e)  {
                    e.printStackTrace();
                    System.out.println("Not Unique Login" + e.getLoginData());
                    inputNoteNoteBook.inputLogin();
                }
            }
            return noteBook;
    }
}
