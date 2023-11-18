package com.rupasgon.trazeasoft.dao;

import com.rupasgon.trazeasoft.connections.SqlConnection;
import com.rupasgon.trazeasoft.model.Item;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemDaoImpl implements ItemDao{
    
    private String query;
    private SimpleDateFormat dataFormat;

    @Override
    public List<Item> listItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertItem(Item item) {
        Date date = new Date();
        dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.setQuery("INSERT INTO item VALUES('"
                + item.getIdProductNumber() + "','"
                + item.getIdModel() + "','"
                + item.getQualityStatus() + "','"
                + dataFormat.format(date) + "','"
                + dataFormat.format(date) + "');"
                );
        
        try {
            PreparedStatement pstm = SqlConnection.mySqlConnection().prepareStatement(this.query);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void deleteItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    
    
}
