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
public class Prodcut_fresc extends Product{    
public String Temp_15grados;
   

    public Prodcut_fresc(int Fcaducidad, int Nlote) {
        super(Fcaducidad, Nlote);
        this.Temp_15grados= Temp_15grados;
    }
    public String getTemp_15grados(){
        return this.Temp_15grados;
    }
}
