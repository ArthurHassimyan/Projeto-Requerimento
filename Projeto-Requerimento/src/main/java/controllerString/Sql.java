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
    
    public final static String insertAgri = "INSERT INTO agrimemsor (cpf, nome, nome_doc, crea, rua, numero, bairro, cep, cidade, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public final static String insertReque = "INSERT INTO agrimemsor (cpf, nome, estadoCivil, profissao, pai, mae, rua, numero, bairro, cep, cidade, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
}
