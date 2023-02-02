
package projeto_covid;


public class Projeto_covid {

    
    public static void main(String[] args) {
        Mundo m = new Mundo();
        
        m.populaMundo();
        
        while(true){
            m.informacoes();
            m.desenhaMundo();
            m.atualizaMundo();
            m.atualizaDoenca();
            try{
                Thread.sleep(1000);
            
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        
        }
    
    }
}