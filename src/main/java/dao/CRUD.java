/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author Administrador
 */
public interface CRUD {
    public int insert(Object object);
    public int update(Object object);
    public boolean delete(Object object);
    public Object findById(int id);
    public List<Object> listById(int id);
    
}
