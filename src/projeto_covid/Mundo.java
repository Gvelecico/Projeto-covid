
package projeto_covid;
import java.util.ArrayList;
import java.util.Random;
/**
 * @author Gustavo
 */
public class Mundo {
    private int[][] mapa = new int[][]
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
   
 
    int cor40 =0;
    int tempo = 0;
    ArrayList<PessoaSaudavel> pessoasSaude = new ArrayList<>();
    ArrayList<PessoaDoente> pessoasDoente = new ArrayList<>();
    Random numeroRandom = new Random();

    
    //cria as pessoas aleatoriamentes
    public void populaMundo(){
        int x,y;
        
        for(int cnt=0; cnt<100; cnt++){
            y = numeroRandom.nextInt(20);
            x = numeroRandom.nextInt(50);
            PessoaSaudavel p = new PessoaSaudavel(x,y,10);
            pessoasSaude.add(p);
            if(mapa[y][x] == 2){
                mapa[p.getY()][p.getX()] = 2;
            }
            else if(mapa[y][x] == 1){
                mapa[p.getY()][p.getX()] = 1;
                
            }
            
            
            else{
               mapa[p.getY()][p.getX()] = p.getCor(); 
            }
            
        }
        
        for(int cnt=0; cnt<2; cnt++){            
            y = numeroRandom.nextInt(20);
            x = numeroRandom.nextInt(50);
            PessoaDoente p2 = new PessoaDoente(x,y,13);
         
            
            pessoasDoente.add(p2);
            if(mapa[y][x] == 2){
               mapa[p2.getY()][p2.getX()] = 2;
            }
            else if(mapa[y][x] == 1){
                mapa[p2.getY()][p2.getX()] = 1;
                
            }
            else{
               mapa[p2.getY()][p2.getX()] = p2.getCor(); 
            }
            
        }
        
        
        
    }
    
    //faz informaçoes tempo,numero de pessoas,etc
    public void informacoes(){
        int cor,cor10 =0,cor12 =0,cor11=0,cor13=0;
        PessoaSaudavel p;
        PessoaDoente p2;
        tempo = this.tempo + 1;
        
        for(int cnt = 0; cnt < pessoasSaude.size(); cnt++){
           p = pessoasSaude.get(cnt);
           cor = p.getCor();
           
           if(cor== 10){
               cor10++;
               
           }else if(cor == 12){
               cor12++;
               
           }else if(cor== 11){
               cor11++;
               p.getVirus();
           }
        }
        for(int cnt = 0; cnt < pessoasDoente.size(); cnt++){
            p2 = pessoasDoente.get(cnt);
            
            cor = p2.getCor();
            
            p2.getVirus();
            
            if(cor == 13){
                cor13++;
                
            }if(cor == 0){
                p2 =pessoasDoente.remove(cnt);
                cor40++;
            }
            
            
        }
        System.out.println("==========================================================");
        System.out.print(" TEMPO: ");
        System.out.print(tempo+"s  ");
        System.out.print("   PESSOA SAUDAVEL ");
        System.out.print("\033[42m \033[0m");
        System.out.print(  cor10 );
        System.out.print("   ");
        System.out.print("   PESSOA VACINADA ");
        System.out.print("\033[44m \033[0m");
        System.out.print( cor12);
        System.out.println();
        System.out.print("   PESSOA ASSINTOMATICA ");
        System.out.print("\033[46m \033[0m");
        System.out.print(cor11);
        System.out.print("   PESSOA INFECTADA ");
        System.out.print("\033[43m \033[0m");
        System.out.print(cor13);
        System.out.println("      ");
        System.out.print("   PESSOAS MORTAS ");
        System.out.print("\033[47m \033[0m");
        System.out.print(cor40);
        System.out.println("      ");
        
    }
        
    
            
    public void atualizaMundo(){
        int x,y,cor;
        x=0;y=0;cor=0;
        PessoaSaudavel p3; // PessoaSaudavel(x,y,cor);
        
        for(int cnt = 0; cnt < pessoasSaude.size(); cnt++){
          
            p3 = pessoasSaude.get(cnt);
            
            
            

            //TIRANDO BORRÃO DA TELA
            if(mapa[p3.getY()][p3.getX()] == 10){
           
               mapa[p3.getY()][p3.getX()] =0;
            }
            if(mapa[p3.getY()][p3.getX()] == 12){
           
               mapa[p3.getY()][p3.getX()] =0;
            }
            if(mapa[p3.getY()][p3.getX()] == 11){
           
               mapa[p3.getY()][p3.getX()] =0;
            }
            //
            
            
            //gerando movimento aleatorio para pessoas
            p3.move();
            //
            //colocando a nova posicao da pessoa no eixo x e y
            x = p3.getX();
            y = p3.getY();
            cor = p3.getCor();
            
            //cobrinha y(linha) x(coluna) 
            if(y>29){
                p3.setY(0);
            }
            if(y<0){
                p3.setY(29);
            }
            if(x>59){
                p3.setX(0);
            }
            if(x<0){
                p3.setX(59);
            }
            //cobrinha mapa xy
            
            
            
            //atualiza estado
            //pessoa cai no hospital
            if(mapa[p3.getY()][p3.getX()] == 2){
                p3.setCor(12);
                //erro aqui
                //mapa[p3.getY()][p3.getX()] = p3.getCor();
            
            }
            
            //pessoa matrix comum
            if(mapa[p3.getY()][p3.getX()] == 0){
           
               mapa[p3.getY()][p3.getX()] = p3.getCor();
            }
            
            //pessoa se torna infectada
            if(mapa[p3.getY()][p3.getX()] == 13){
               
               if(cor == 10){
               p3 = pessoasSaude.remove(cnt);
               PessoaDoente p4 = new PessoaDoente(x,y,13);
               pessoasDoente.add(p4);
               }
               else if(cor == 12){
                   p3.setVirus();
                   
                   
               }
                 
                
            }
            //pessoa se torna infectada 
            if(mapa[(p3.getY())][p3.getX()] == 13){
               
                
               if(cor == 10){
               p3 = pessoasSaude.remove(cnt);
               PessoaDoente p4 = new PessoaDoente(x,y,13);
               pessoasDoente.add(p4);
               }
               else if(cor == 12){
                   p3.setVirus();
                   
                   
               }
                
            }
            
            //novo
            if(y<28 && y>2){
                 if(mapa[(p3.getY()+1)][p3.getX()] == 13){
                    if(cor == 10){
                        p3 = pessoasSaude.remove(cnt);
                        PessoaDoente p4 = new PessoaDoente(x,y,13);
                        pessoasDoente.add(p4);    
                     
                 }
                 if(mapa[(p3.getY()-1)][p3.getX()] == 13){
                    if(cor == 10){
                        p3 = pessoasSaude.remove(cnt);
                        PessoaDoente p4 = new PessoaDoente(x,y,13);
                        pessoasDoente.add(p4);    
                     
                 }    
                   else if(cor == 12){
                       p3.setVirus();
            }
                 }
            }

            if(x<58 && x>2){
                if(mapa[(p3.getY())][p3.getX()+1] == 13){
                    if(cor == 10){
                        p3 = pessoasSaude.remove(cnt);
                        PessoaDoente p4 = new PessoaDoente(x,y,13);
                        pessoasDoente.add(p4);    
                     
                 }
                if(mapa[(p3.getY())][p3.getX()-1] == 13){
                    if(cor == 10){
                        p3 = pessoasSaude.remove(cnt);
                        PessoaDoente p4 = new PessoaDoente(x,y,13);
                        pessoasDoente.add(p4);    
                     
                 }    
                    
                   else if(cor == 12){
                       p3.setVirus();
            }
                      
            }
                
            }
        
      
            
            //
           
            
            if(mapa[p3.getY()][p3.getX()] == 0){
                
            }
            if(mapa[p3.getY()][p3.getX()] == 0){
                
            }
            if(mapa[p3.getY()][p3.getX()] == 0){
                
            }
            
        
        }
    }
        }
    }
    
        //pessoas doentes
    public void atualizaDoenca(){
       
        int x,y,cor;
        x=0;y=0;cor=0;
        PessoaDoente p4 = new PessoaDoente(x,y,cor);
        
        
        
        for(int cnt = 0; cnt < pessoasDoente.size(); cnt++){
            p4 =pessoasDoente.get(cnt);
            
            //TIRANDO BORRÃO DA TELA
            if(mapa[p4.getY()][p4.getX()] == 10){
           
               mapa[p4.getY()][p4.getX()] =0;
           }
            if(mapa[p4.getY()][p4.getX()] == 12){
           
              mapa[p4.getY()][p4.getX()] =0;
            }
            if(mapa[p4.getY()][p4.getX()] == 13){
           
              mapa[p4.getY()][p4.getX()] =0;
            }
            //
            
            //gerando movimento aleatorio para pessoas
            p4.move();
            //
            //colocando a nova posicao da pessoa no eixo x e y
            x = p4.getX();
            y = p4.getY();
            cor = p4.getCor();
            
            //cobrinha y(linha) x(coluna) 
            if(y>29){
                p4.setY(0);
            }
            if(y<0){
                p4.setY(29);
            }
            if(x>59){
                p4.setX(0);
            }
            if(x<0){
                p4.setX(59);
            }
            //cobrinha mapa xy
            
            //atualiza estado
            //pessoa cai no hospital
            if(mapa[p4.getY()][p4.getX()] == 2){
                p4 =pessoasDoente.remove(cnt);
                PessoaSaudavel p3 = new PessoaSaudavel(x,y,10);
                pessoasSaude.add(p3);
                //erro aqui
                //mapa[p3.getY()][p3.getX()] = p3.getCor();
            }
            
            if(mapa[p4.getY()][p4.getX()] == 0){
           
               mapa[p4.getY()][p4.getX()] = p4.getCor();
            }
        }
    }

    
    

    
    
    public void desenhaMundo(){
        for(int i=0; i<mapa.length; i++){
            for(int j=0; j<mapa[i].length; j++){
                switch(mapa[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("\033[41m \033[0m");
                        break;
                    case 2:
                        System.out.print("\033[45m \033[0m");
                        break;
                    //saudavel verde
                    case 10:
                        System.out.print("\033[42m \033[0m");
                        break;
                    //vacinada infectada
                    case 11:
                        System.out.print("\033[46m \033[0m");
                        break;
                    //vacinada
                    case 12:
                        System.out.print("\033[44m \033[0m");
                        break;
                    //infectada
                    case 13:
                        System.out.print("\033[43m \033[0m");
                        break;
                    
                }
            }
            System.out.println("");
        }
     
   
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }            
}
