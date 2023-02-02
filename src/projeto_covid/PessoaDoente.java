/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_covid;

import java.util.Random;

/**
 *
 * @author Vagner
 */
public class PessoaDoente extends Pessoa implements IMovable {
    
    public int contadorv = 0;
    
    public PessoaDoente(int x, int y, int cor) {
        super(x, y, cor);
    }
    
    
    Random movimento = new Random();
    
    public Virus virus;
    
    
    public void setVirus(){
        int corvirus =13;
        this.cor = corvirus;
        
        
    }
    
    public void getVirus(){
        int corvirus = 13;
        
        this.contadorv ++;
        if(this.contadorv == 30){
            this.cor= 0;
        }else {
            int corvirusV =13;
        }
        
        
    }
 
    
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
