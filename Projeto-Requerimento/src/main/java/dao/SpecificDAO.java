/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controllerString.Sql;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.agrimensor;
import model.requerente;

/**
 *
 * @author Arthur Hassimyan
 */
public class SpecificDAO extends GenericDAO{

    public static boolean insertAgri(agrimensor rq) throws SQLException {
        prepStat(Sql.insertAgri, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);        
        pstdados.setInt(1, rq.getCpf());
        pstdados.setString(2, rq.getNome());
        pstdados.setString(3, rq.getNomeDoc());
        pstdados.setString(4, rq.getNumCrea());
        pstdados.setString(5, rq.getRua());        
        pstdados.setInt(6, rq.getNumero());        
        pstdados.setString(7, rq.getBairro());        
        pstdados.setInt(8, rq.getCep());
        pstdados.setString(9, rq.getCidade());
        pstdados.setString(10, rq.getEstado());
        return genericUpdate();
    } 
    
    public static boolean insertReque(requerente rq) throws SQLException {
        prepStat(Sql.insertReque, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);        
        pstdados.setInt(1, rq.getCpf());
        pstdados.setString(2, rq.getNome());
        pstdados.setString(3, rq.getEstadoCivil());
        pstdados.setString(4, rq.getProfissao());
        pstdados.setString(5, rq.getPai());
        pstdados.setString(6, rq.getMae());
        pstdados.setString(7, rq.getRua());
        pstdados.setInt(8, rq.getNumero());        
        pstdados.setInt(9, rq.getCep());
        pstdados.setString(10, rq.getCidade());
        pstdados.setString(11, rq.getEstado());
        return genericUpdate();
    }
    
}
