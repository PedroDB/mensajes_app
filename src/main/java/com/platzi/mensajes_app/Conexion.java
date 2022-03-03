/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pgdb_dima
 */
public class Conexion {
    public Connection getConnection(){
        Connection conection = null;
        try{
           conection =  DriverManager.getConnection("jdbc:mysql://localhost:3305/mensajes_app","root","");
           if(conection!=null){
               System.out.println("conexion exitosa");
           }
        }catch(SQLException e){
             System.out.println(e);
        }
        return conection;
    }
}
