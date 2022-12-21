/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.User;
import util.Util;

/**
 *
 * @author Administrador
 */
public class UserDao implements CRUD{

    @Override
    public int insert(Object object) {
         User user= (User) object;
            String sql = "insert into user(name,email,password,expire,token)values("
                + Util.ToSimpleQuotes(user.getName(), ",")
                + Util.ToSimpleQuotes(user.getEmail(),",")
                + Util.ToSimpleQuotes(user.getPassword(),",")
                + Util.ToSimpleQuotes(user.getExpire().toString(),",")
                + Util.ToSimpleQuotes(user.getToken(), "")
                    + ") returning id";
            try {
            ConnectionFactory con = new ConnectionFactory();
            return con.getResultset(sql).getInt(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
            
            
            
            
            
            
    }

    @Override
    public int update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> listById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
