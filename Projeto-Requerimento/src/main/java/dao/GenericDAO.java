/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controllerString.Sql;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Arthur Hassimyan
 */
public class GenericDAO {

    protected static Connection connection = null;
    protected static PreparedStatement pstdados = null;
    protected static ResultSet rsdados = null;

    public static boolean CriaConexao() {
        try {
            JDBCUtil.init(Sql.bdProperties);
            connection = JDBCUtil.getConnection();
            connection.setAutoCommit(false);

            DatabaseMetaData dbmt = connection.getMetaData();
            System.out.println("Nome do BD: " + dbmt.getDatabaseProductName());
            System.out.println("Versao do BD: " + dbmt.getDatabaseProductVersion());
            System.out.println("URL: " + dbmt.getURL());
            System.out.println("Driver: " + dbmt.getDriverName());
            System.out.println("Versao Driver: " + dbmt.getDriverVersion());
            System.out.println("Usuario: " + dbmt.getUserName());

            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC." + erro);
        } catch (IOException erro) {
            System.out.println("Falha ao carregar o arquivo de configuração." + erro);
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
        }
        return false;
    }
    
    public static Connection getConnection(){
        return connection;
    }
    
    public boolean FechaConexao() {
        if (connection != null) {
            try {
                connection.close();
                return true;
            } catch (SQLException erro) {
                System.err.println("Erro ao fechar a conexão = " + erro);
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean prepStat(String sql, int tipo, int concorrencia) {
        try {
            pstdados = connection.prepareStatement(sql, tipo, concorrencia);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao criar Prepared Statement = " + ex);
        }
        return false;
    }

    protected static boolean genericUpdate() {
        try {
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            System.out.println("Resposta da atualização = " + resposta);
            if (resposta == 1) {
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir ou alterar" + erro);
        }
        return false;
    }

    protected static boolean genericQuery() {
        try {
            rsdados = pstdados.executeQuery();
            return rsdados.first();
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }

    public static boolean excluir(String sql, int id) throws SQLException {

        try {
            prepStat(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstdados.setInt(1, id);
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            System.out.println("Resposta da atualização = " + resposta);
            if (resposta >= 1) {
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir ou alterar" + erro);
        }
        return false;
    }

    public static ResultSet getRsdados() {
        return rsdados;
    }

}
