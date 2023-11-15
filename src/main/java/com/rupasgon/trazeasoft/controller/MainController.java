package com.rupasgon.trazeasoft.controller;

import com.rupasgon.trazeasoft.view.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener{
    
    private MainMenu mainMenu;
    
    public MainController(){
        this.mainMenu = new MainMenu();
    }
    
    public void addListenersMainMenu(){
        
        this.mainMenu.getBtoOrderManagerMenu().addActionListener(this);
        this.mainMenu.getBtoItemManagerMenu().addActionListener(this);
        this.mainMenu.getBtoExit().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switchOptionActionEvent(e.getActionCommand());
    }
    
    public void switchOptionActionEvent(String option){
        
        
        
    }
    
}
