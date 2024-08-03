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
    private final static String baseProperties = base + "/src/properties";
    public final static String bdProperties = baseProperties + "/configBD.properties";
    
    public final static String insertUsuario = "INSERT INTO elite_skin.usuario (email, senha) VALUES (?, ?);";
    public final static String updateUsuario = "UPDATE elite_skin.usuario SET senha = ? WHERE idLogin = ? AND senha = ?;";
    public final static String selectUsuario = "SELECT idLogin FROM usuario WHERE email = ? AND senha = ?";    
    
    public final static String insertSkinCS = "INSERT INTO elite_skin.skin_cs (idLogin, nameGame, nameSkin, price, keyy, floating) VALUES (?, ?, ?, ?, ?, ?);";
    public final static String selectSkinCS = "SELECT * FROM elite_skin.skin_cs WHERE idLogin = ?;";
    public final static String deleteSkinCS = "DELETE FROM elite_skin.skin_cs WHERE idCompra = ?;";
    
    public final static String insertSkinLOL = "INSERT INTO elite_skin.skin_lol (idLogin, nameGame, nameSkin, price, keyy) VALUES (?, ?, ?, ?, ?);";
    public final static String selectSkinLOL = "SELECT * FROM elite_skin.skin_lol WHERE idLogin = ?;";
    public final static String deleteSkinLOL = "DELETE FROM elite_skin.skin_lol WHERE idCompra = ?;";
    
    public final static String updateListCS = "UPDATE elite_skin.lista_cs SET preco = ? WHERE name = ?;";
    public final static String selectListCS = "SELECT * FROM elite_skin.lista_cs WHERE name LIKE ?";
    
    public final static String updateListLOL = "UPDATE elite_skin.lista_lol SET preco = ? WHERE name = ?;";
    public final static String selectListLOL = "SELECT * FROM elite_skin.lista_lol WHERE name LIKE ?";
}
