package com.rupasgon.trazeasoft.dao;

import com.rupasgon.trazeasoft.model.Item;
import java.util.List;

public interface ItemDao {
    public List<Item> listItem();
    public void insertItem(Item item);
    public void deleteItem(Item item);
}
