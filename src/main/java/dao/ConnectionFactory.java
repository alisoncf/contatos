/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Administrador
 */
public class ConnectionFactory {

    Connection con;
    Statement stmt;
    Context envContext;
    Context initContext;
    DataSource ds;
    private String datasetName = "java:/comp/env/jdbc/academico";

    public ConnectionFactory() {
        getConn();
    }

    private boolean getConn() {
        try {
            
            Context envContext = new InitialContext();
            initContext = (Context) envContext.lookup("java:/comp/env");
            ds = (DataSource) initContext.lookup(this.datasetName);
            con = ds.getConnection();
            stmt = con.createStatement();

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    

    public void executa(String sql) {
        try {

//            Context envContext = new InitialContext();
//            initContext = (Context) envContext.lookup("java:/comp/env");
//            ds = (DataSource) initContext.lookup(this.datasetName);
//            con = ds.getConnection();
//            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ResultSet getResultset(String sql) {
        try {

//            Context envContext = new InitialContext();
//            Context initContext = (Context) envContext.lookup("java:/comp/env");
//            DataSource ds = (DataSource) initContext.lookup(this.datasetName);
//            con = ds.getConnection();
//            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void fecha() {
        try {
            stmt.close();
            con.close();
        } catch (Exception e) {
        }
    }

}
