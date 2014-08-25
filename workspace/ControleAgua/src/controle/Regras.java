/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;
import modelo.modelo_Balde;


/**
 *
 * @author Ninja
 */
public class Regras {
    
    modelo_Balde VA = new modelo_Balde();
    modelo_Balde VB = new modelo_Balde();
    
    public void R1()
    {
        VA.setValor(4); 
    }
    
    public void R2()
    {
        VB.setValor(3); 
    }
    
    public void R3()
    {
        VA.setValor(0); 
    }
    
    public void R4()
    {
        VB.setValor(0); 
    }
    public void R5()
    {
        int calculo;
        calculo = VB.getValor() - VA.getValor();
        VB.setValor(VB.getValor() + calculo);
    }
    
    public void R6()
    {
        int calculo;
        calculo = VA.getValor() - VB.getValor();
        VA.setValor(calculo + VA.getValor());
    }
    
}
