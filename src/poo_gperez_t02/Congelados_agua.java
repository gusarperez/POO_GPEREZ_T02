package poo_gperez_t02;

import poo_gperez_t02.Product_conge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusar
 */
public class Congelados_agua extends Product_conge{
    public String carne;
    public String pescado;
    
    public Congelados_agua (int Fcaducidad, int Nlote){
        super (Fcaducidad, Nlote);
        this.carne=carne;
        this.pescado=pescado;
    }
    public String getcarne(){
    return this.carne;
}
    public String getpescado(){
        return this.pescado;
    }
    
}
