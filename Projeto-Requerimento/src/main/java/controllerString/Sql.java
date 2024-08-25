/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerString;

/**
 *
 * @author Arthur Hassimyan
 */
public final class Sql {
    private final static String base = System.getProperty("user.dir");
    private final static String baseProperties = base + "/src/main/java/properties";
    public final static String bdProperties = baseProperties + "/configBD.properties";
    
    public final static String insertAgri = "INSERT INTO agrimensor (cpf_ag, nome_ag, nome_doc_ag, crea_ag, estado_civil_ag, nacionalidade_ag, endereco_ag) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public final static String insertReque = "INSERT INTO requerente (cpf_rq, nome_rq, estado_civil_rq, profissao_rq, pai_rq, mae_rq, nacionalidade_rq, endereco_rq) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public final static String selectReque = "SELECT `cpf_ag`, `nome_ag` FROM requerimento.agrimensor";
    public final static String selectAgri = "SELECT `cpf_rq`, `nome_rq` FROM requerimento.requerente";
    
}
