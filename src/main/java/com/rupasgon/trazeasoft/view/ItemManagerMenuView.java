package com.rupasgon.trazeasoft.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ItemManagerMenuView extends JFrame {

    private JButton btoInsertItem;
    private JButton btoDeleteItem;
    private JButton btoUpdateItem;
    private JButton btoExit;
    private int positionX;
    private int positionY;
    private int sizeWidth;
    private int sizeHeight;

    public ItemManagerMenuView() {
        
        this.btoInsertItem = new JButton("Add Item");
        this.btoUpdateItem = new JButton("Modify Item");
        this.btoDeleteItem = new JButton("Delete Item");
        this.btoExit = new JButton("Exit");

        initComponents();
    }

    public void initComponents() {
        this.setLayout(new GridLayout(0, 1));
        setViewBounds();
        this.setTitle("TrazeaSoft - Item Manager Menu");

        this.add(this.btoInsertItem);
        this.add(this.btoUpdateItem);
        this.add(this.btoDeleteItem);
        this.add(this.btoExit);

        this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setViewBounds() {

        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension sizeScreen = myScreen.getScreenSize();

        this.setSize((sizeScreen.width / 2), sizeScreen.height / 2);
        this.setLocation(sizeScreen.width / 4, sizeScreen.height / 4);
    }
    
    public void setViewBounds(int positionX,int positionY,int sizeWidth,int sizeHeight){
        
        this.setLocation(positionX, positionY);
        this.setSize(sizeWidth, sizeHeight);
    }

    public JButton getBtoInsertItem() {
        return btoInsertItem;
    }

    public void setBtoInsertItem(JButton btoInsertItem) {
        this.btoInsertItem = btoInsertItem;
    }

    public JButton getBtoDeleteItem() {
        return btoDeleteItem;
    }

    public void setBtoDeleteItem(JButton btoDeleteItem) {
        this.btoDeleteItem = btoDeleteItem;
    }

    public JButton getBtoUpdateItem() {
        return btoUpdateItem;
    }

    public void setBtoUpdateItem(JButton btoUpdateItem) {
        this.btoUpdateItem = btoUpdateItem;
    }

    public JButton getBtoExit() {
        return btoExit;
    }

    public void setBtoExit(JButton btoExit) {
        this.btoExit = btoExit;
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

    
}
