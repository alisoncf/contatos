/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author Administrador
 */
public class UserController {
    private List<User> listUsers=new ArrayList<>();

    private void add(User user){
        listUsers.add(user);
    
    }
    
    private void rem(User user){
        listUsers.remove(user);
    
    }
    private void rem(int index){
        listUsers.remove(listUsers.get(index));
    
    }
    
    private void clear(){
        listUsers = new ArrayList<>();
    
    }
    private User get(int index){
        return listUsers.get(index);
    
    }
    private List<User> list(){
        return this.listUsers;
    }
    
    

}


