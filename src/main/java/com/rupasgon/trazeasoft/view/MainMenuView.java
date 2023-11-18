package com.rupasgon.trazeasoft.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenuView extends JFrame{

    private JButton btoOrderManagerMenu;
    private JButton btoItemManagerMenu;
    private JButton btoExit;
    private int positionX;
    private int positionY;
    private int sizeWidth;
    private int sizeHeight;

    public MainMenuView() {

        this.btoOrderManagerMenu = new JButton("Order Manager Menu");
        this.btoItemManagerMenu = new JButton("Item Manager Menu");
        this.btoExit = new JButton("Exit");
        
        
        initComponents();
        
    }
    
    public void initComponents(){
        
        this.setLayout(new GridLayout(0, 1));
        setViewBounds();
        this.setTitle("TrazeaSoft - Main Menu");
        this.add(this.btoOrderManagerMenu);
        this.add(this.btoItemManagerMenu);
        this.add(this.add(this.btoExit));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void setViewBounds(){
        
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension sizeScreen= myScreen.getScreenSize();
        
        this.setSize((sizeScreen.width/2),sizeScreen.height/2);
        this.setLocation(sizeScreen.width/4,sizeScreen.height/4);
    }
    
        public void setViewBounds(int positionX,int positionY,int sizeWidth,int sizeHeight){
        
        this.setLocation(positionX, positionY);
        this.setSize(sizeWidth, sizeHeight);
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(int sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public int getSizeHeight() {
        return sizeHeight;
    }

    public void setSizeHeight(int sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    public JButton getBtoOrderManagerMenu() {
        return btoOrderManagerMenu;
    }

    public void setBtoOrderManagerMenu(JButton btoOrderManagerMenu) {
        this.btoOrderManagerMenu = btoOrderManagerMenu;
    }

    public JButton getBtoItemManagerMenu() {
        return btoItemManagerMenu;
    }

    public void setBtoItemManagerMenu(JButton btoItemManagerMenu) {
        this.btoItemManagerMenu = btoItemManagerMenu;
    }

    public JButton getBtoExit() {
        return btoExit;
    }

    public void setBtoExit(JButton btoExit) {
        this.btoExit = btoExit;
    }
    
    
    
}
