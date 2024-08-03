/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.requerente;

/**
 *
 * @author Arthur Hassimyan
 */
public class SpecificDAO extends GenericDAO{

    public static boolean insertUsuario(String sql, requerente rq) throws SQLException {
        prepStat(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pstdados.setString(1, rq.getNome());
        pstdados.setString(2, rq.getEstadoCivil());
        pstdados.setString(3, rq.getProfissao());
        pstdados.setString(4, rq.getPai());
        pstdados.setString(5, rq.getMae());
        pstdados.setString(6, rq.getRua());
        pstdados.setString(7, rq.getCidade());
        pstdados.setString(8, rq.getEstado());
        pstdados.setString(9, rq.getBairro());
        pstdados.setInt(10, rq.getCpf());
        pstdados.setInt(11, rq.getNumero());
        return genericUpdate();
    } 
    
}
