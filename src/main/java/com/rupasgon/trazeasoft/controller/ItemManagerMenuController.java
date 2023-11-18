package com.rupasgon.trazeasoft.controller;

import com.rupasgon.trazeasoft.view.ItemManagerMenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemManagerMenuController implements ActionListener {

    private ItemManagerMenuView itemManagerMenuView;

    public ItemManagerMenuController() {

        itemManagerMenuView = new ItemManagerMenuView();
        addListenersItemManagerMenu();

    }

    public void addListenersItemManagerMenu() {

        this.itemManagerMenuView.getBtoInsertItem().addActionListener(this);
        this.itemManagerMenuView.getBtoUpdateItem().addActionListener(this);
        this.itemManagerMenuView.getBtoDeleteItem().addActionListener(this);
        this.itemManagerMenuView.getBtoExit().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switchOptionActionEvent(e.getActionCommand());
    }

    public void switchOptionActionEvent(String option) {

        switch (option) {

            case "Add Item":
                break;

            case "Modify Item":
                break;

            case "Delete Item":
                break;

            case "Exit":

                this.itemManagerMenuView.dispose();

                break;
        }

    }

}
