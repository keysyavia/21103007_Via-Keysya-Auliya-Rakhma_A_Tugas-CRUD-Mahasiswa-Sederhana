/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUDMahasiswaSederhana.controller;

import CRUDMahasiswaSederhana.interfc.MahasiwaInterface;
import CRUDMahasiswaSederhana.models.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import teoripbo.crudmahasiswasederhana.Interface.MahasiswaInterface;

/**
 *
 * @author ACER
 */
public class MahasiswaController implements MahasiswaInterface{
PreparedStatement st;

    @Override
    public Mahasiswa insert(Mahasiswa o) throws SQLException {
        st=ConnectionHelper.getConnection().prepareStatement(
                "insert into mahasiswa value (?,?,?)");
        st.setString(1,o.getNim());
        st.setString(2,o.getNama());
        st.setString(3,o.getAlamat());
        st.executeUpdate();
        return o;

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Mahasiswa o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Mahasiswa o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Mahasiswa> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}