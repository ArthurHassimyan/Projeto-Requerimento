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
    
    public final static String insertAgri = "INSERT INTO agrimemsor (cpf_ag, nome_ag, nome_doc_ag, crea_ag, estado_civil_ag, endereco_ag) VALUES (?, ?, ?, ?, ?, ?)";
    public final static String insertReque = "INSERT INTO agrimemsor (cpf_rq, nome_rq, estadoCivil_rq, profissao_rq, pai_rq, mae_rq, endereco_rq) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
}
