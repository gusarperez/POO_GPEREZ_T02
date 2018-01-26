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
public class Product_refri extends Product {
    public String Temp_7grados;
    
    public Product_refri(int Fcaducidad, int Nlote){
        super(Fcaducidad, Nlote);
        this.Temp_7grados= Temp_7grados; 
    }
    public String Temp_7grados(){
    return this.Temp_7grados;
}
}
