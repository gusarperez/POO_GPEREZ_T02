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
public class Product_conge extends Product{
    public String Temp_menos18grados;
    
    public Product_conge(int Fcaducidad, int Nlote){
        super(Fcaducidad, Nlote);
                this.Temp_menos18grados=Temp_menos18grados;
    }
    public String getTemp_menos18grados(){
        return this.Temp_menos18grados;
    }
    
}
