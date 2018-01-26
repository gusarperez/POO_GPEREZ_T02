package poo_gperez_t02;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusar
 */
public class Product {
    protected int Fcaducidad;
    protected int Nlote;
    
    public Product(int Fcaducidad, int Nlote){
        Fcaducidad=0;
        Nlote=0;   
    }
    public int getFcaducidad(){
        return this.Fcaducidad;
    }
    public int getNlote(){
        return this.Nlote;
    }
}
