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

    public static boolean insertAgri(agrimensor ag) throws SQLException {
        prepStat(Sql.insertAgri, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);        
        pstdados.setString(1, ag.getCpf());
        pstdados.setString(2, ag.getNome());
        pstdados.setString(3, ag.getNomeDoc());
        pstdados.setString(4, ag.getNumCrea());
        pstdados.setString(5, ag.getEstadoCivil());
        pstdados.setString(6, ag.getNacionalidade());
        pstdados.setString(7, ag.getEndereco());
        return genericUpdate();
    } 
    
    public static boolean insertReque(requerente rq) throws SQLException {
        prepStat(Sql.insertReque, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);        
        pstdados.setString(1, rq.getCpf());
        pstdados.setString(2, rq.getNome());
        pstdados.setString(3, rq.getEstadoCivil());
        pstdados.setString(4, rq.getProfissao());
        pstdados.setString(5, rq.getPai());
        pstdados.setString(6, rq.getMae());
        pstdados.setString(7, rq.getNacionalidade());
        pstdados.setString(8, rq.getEndereco());
        return genericUpdate();
    }
    
}
