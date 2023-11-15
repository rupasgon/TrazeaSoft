package com.rupasgon.trazeasoft.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu extends JFrame{
    private ItemManagerMenu itemManagerMenu;
    private OrderManagerMenu orderManagerMenu;
    private JButton btoOrderManagerMenu;
    private JButton btoItemManagerMenu;
    private JButton btoExit;
    private int positionX;
    private int positionY;
    private int sizeWidth;
    private int sizeHeight;

    public MainMenu() {
        this.itemManagerMenu = new ItemManagerMenu();
        this.orderManagerMenu = new OrderManagerMenu();
        this.btoOrderManagerMenu = new JButton("Order Manager Menu");
        this.btoItemManagerMenu = new JButton("Item Manager Menu");
        this.btoExit = new JButton("Exit");
        
        
        initComponents();
        
    }
    
    public void initComponents(){
        
        this.setLayout(new GridLayout(0, 1));
        setMainMenuBounds();
        this.setTitle("TrazeaSoft - Main Menu");
        this.add(this.btoOrderManagerMenu);
        this.add(this.btoItemManagerMenu);
        this.add(this.add(this.btoExit));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void setMainMenuBounds(){
        
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension sizeScreen= myScreen.getScreenSize();
        
        this.setSize((sizeScreen.width/2),sizeScreen.height/2);
        this.setLocation(sizeScreen.width/4,sizeScreen.height/4);
    }

    public ItemManagerMenu getItemManagerMenu() {
        return itemManagerMenu;
    }

    public void setItemManagerMenu(ItemManagerMenu itemManagerMenu) {
        this.itemManagerMenu = itemManagerMenu;
    }

    public OrderManagerMenu getOrderManagerMenu() {
        return orderManagerMenu;
    }

    public void setOrderManagerMenu(OrderManagerMenu orderManagerMenu) {
        this.orderManagerMenu = orderManagerMenu;
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
