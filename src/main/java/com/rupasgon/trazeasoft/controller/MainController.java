package com.rupasgon.trazeasoft.controller;

import com.rupasgon.trazeasoft.view.MainMenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {
    
    private MainMenuView mainMenuView;
    private ItemManagerMenuController itemManagerMenuController;
    
    public MainController() {
        this.mainMenuView = new MainMenuView();
        addListenersMainMenu();
    }
    
    public void addListenersMainMenu() {
        
        this.mainMenuView.getBtoOrderManagerMenu().addActionListener(this);
        this.mainMenuView.getBtoItemManagerMenu().addActionListener(this);
        this.mainMenuView.getBtoExit().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switchOptionActionEvent(e.getActionCommand());
    }
    
    public void switchOptionActionEvent(String option) {
        
        switch (option) {
            
            case "Item Manager Menu":
                //this.mainMenuView.setVisible(false);
                this.itemManagerMenuController = new ItemManagerMenuController();
                break;
            
            case "Exit":
                this.mainMenuView.dispose();
                System.exit(0);
                break;
            
        }
        
    }
    
    public MainMenuView getMainMenuView() {
        return mainMenuView;
    }
    
    public void setMainMenuView(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }
    
    public ItemManagerMenuController getItemManagerMenuController() {
        return itemManagerMenuController;
    }
    
    public void setItemManagerMenuController(ItemManagerMenuController itemManagerMenuController) {
        this.itemManagerMenuController = itemManagerMenuController;
    }
    
}
