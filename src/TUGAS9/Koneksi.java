/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS9;

/**
 *
 * @author someone
 */
import TUGAS7.*;
import java.sql.*; //package dari mysql
import javax.swing.JOptionPane; //package dari Joptionpane
public class Koneksi {
    private static Connection con; // pendeklarasian var denga tipe data connection
    
    public static Connection getConnection(){
        try{
            con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/praktikum_visual","root",""); // mengkoneksikan ke database
            JOptionPane.showMessageDialog(null,"koneksi Berhasil");   //tampil pesan secara gui
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal"+e.getMessage()); //tampil pesan secara gui
        }
        return con;
    }
}
