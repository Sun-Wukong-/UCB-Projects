/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apresentacao;
import controle.controle_Balde;
import controle.Regras;
/**
 *
 * @author Ninja
 */
public class Main{
    public static void Main(String[] args) {
    
    controle_Balde balde = new controle_Balde();
    Regras regras = new Regras();
    
    balde.EstadoInicial();
    
    }
}