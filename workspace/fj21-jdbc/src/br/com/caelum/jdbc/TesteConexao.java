/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ninja
 */
public class TesteConexao {

    /**
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException
    {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            System.out.println("Conexão aberta!");
            connection.close();
        }
    }
    
}
