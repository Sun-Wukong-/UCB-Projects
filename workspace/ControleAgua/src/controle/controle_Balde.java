/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;
import modelo.modelo_Balde;
        ;
/**
 *
 * @author Ninja
 */
public class controle_Balde {
    
    modelo_Balde VA = new modelo_Balde();
    modelo_Balde VB = new modelo_Balde();
    
    public void EstadoInicial()
    {
        VA.setValor(0);
        VB.setValor(0);
    }
}
