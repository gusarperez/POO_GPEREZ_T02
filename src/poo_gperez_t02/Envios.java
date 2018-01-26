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
public class Envios extends Product{
    public String Mexico;
    public String EU;
    
    public Envios(int Fcaducidad, int Nlote){
        super(Fcaducidad, Nlote);
        this.Mexico=Mexico;
        this.EU=EU;
      
}
    public String getmexico(){
        return this.Mexico;
    }
    public String geteu(){
        return this.EU;
    }
}
