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
public class Congelados_nitro extends Product_conge{
    public String paleta;
    public String nieve;
    
    public Congelados_nitro(int Fcaducidad, int Nlote){
    super(Fcaducidad, Nlote);
    this.paleta=paleta;
    this.nieve=nieve;    
}
    public String getpaleta(){
    return this.paleta;    
    }
    public String getnieve(){
        return this.nieve;
    }
}