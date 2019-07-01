package com.stackroute.service;

import com.stackroute.exceptions.WarehouseAlreadyExistsException;
import com.stackroute.exceptions.UserNotFoundException;
import com.stackroute.model.Partition;
import com.stackroute.model.Warehouse;

import java.util.List;

public interface WarehouseService
{
    public List<Warehouse> getAllWarehouses();
    public Warehouse saveWareHouse(Warehouse wareHouse) throws WarehouseAlreadyExistsException;
    public boolean deleteWarehouse(String uuid) throws UserNotFoundException;
    public Warehouse updateUser(Warehouse wareHouse) throws UserNotFoundException;
    //public Partition savePartition(Partition partition) throws WarehouseAlreadyExistsException;
}
