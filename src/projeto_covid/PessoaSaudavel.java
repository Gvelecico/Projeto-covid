/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_covid;
/**
 * @author Gustavo
 */

import java.util.Random;

public class PessoaSaudavel extends Pessoa implements IMovable {
    
    public int contadorv = 0;
    
    public PessoaSaudavel(int x, int y, int cor) {
        super(x, y, cor);
    }
    
     public Virus virus;
    
    Random movimento = new Random();
    
    @Override
    public void move(){
        int numeroMove,x,y;
        x = this.x;
        y = this.y;
        
        numeroMove = movimento.nextInt(4);
        
        if(numeroMove == 0){
            this.x = x-1;
        }
        else if(numeroMove == 1){
            this.x = x+1;
        }
        else if(numeroMove == 2){
            this.y = y-1;
        }
        else if (numeroMove == 3){
            this.y = y+1;
        }
        
    }
    
    
    public void vacina(){
       int corv =  this.cor;
       
       if(corv == 10){
           this.cor = 12;
       }else if(corv == 13){
           this.cor = 10;
       }else if(corv == 9){
           this.cor = 9;
       }
        
        
    }
    
    
     public void setVirus(){
        int corvirusV =11;
        this.cor = corvirusV;
        setCor(11);
        
        
    }
    
    public void getVirus(){
        int corvirus = 11;
        this.contadorv ++;
        if(this.contadorv == 30){
            this.cor= 12;
        }else {
            int corvirusV =11;
        }
        
        
        
      /*  if(cor == 10){
            this.cor = corvirus;
        }else if(cor == 13){
            this.cor = corvirus;
        }else if(cor == 12){
            this.cor = 9;
        }
        */
        
        
    }
  
    
    
    
    
    

    public Random getMovimento() {
        return movimento;
    }

    public void setMovimento(Random movimento) {
        this.movimento = movimento;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getY() {
        return y;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public int getCor() {
        return cor;
    }
    @Override
    public void setCor(int cor) {
        this.cor = cor;
    }
    
    
    
    
}
