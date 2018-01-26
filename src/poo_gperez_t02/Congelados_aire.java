package poo_gperez_t02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//pollo, carne, pescado, nieve, paletas, frutas
/**
 *
 * @author gusar
 */
public class Congelados_aire extends Product_conge {
    public String pollo;
    public String frutas;
    public Congelados_aire(int Fcaducidad, int Nlote ){
        super(Fcaducidad, Nlote);
        this.pollo=pollo;
        this.frutas=frutas;        
    }
    public String getpollo(){
        return this.pollo;
    }
    public String getfrutas(){
        return this.frutas;
    }
           
    
}
    

