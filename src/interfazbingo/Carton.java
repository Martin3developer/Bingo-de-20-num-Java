
package interfazbingo;

public class Carton {
    
    
    int[][] numeros = new int [3][4];
    
    
    public Carton(){
        int[] repetidas=new int[20];
        int bolas=0;
        
        for(int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[0].length; j++) {
                boolean repetida=false;
                int bola=0;
                do{
                    repetida=false;
                    bola=(int)(Math.random()*20+1);
                    for (int k = 0; k < 20; k++) {
                        if(bola==repetidas[k]){repetida=true;}      
                    }            
                }while(repetida==true);
                repetidas[bolas]=bola;
                bolas++;
                numeros[i][j]=bola;
            }
        }    
    }
    
    public void borraNum(int a){
        for(int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[0].length; j++) {
                if(a==numeros[i][j]){
                   numeros[i][j]=0; 
                }
            }
        }   
    }
    
    public void mostrarCarton(){
        for(int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[0].length; j++) {
                if(numeros[i][j]==0){
                    System.out.print("\033[31mX\t\033[30m"); 
                }else{
                    System.out.print(numeros[i][j]+"\t");
                }
            }
            System.out.println("");
        }   
    }
    
    public boolean bingo(){
        int contador=0;
        boolean ganar=false;
        for(int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[0].length; j++) {
                if(numeros[i][j]!=0){
                 contador++;    
                }
            }
        }
        if(contador!=0){
            System.out.println("Quedan "+contador+" por borrar");
        }else{
            System.out.println("Bingo!!!");
            ganar=true;
        }   
        return ganar;
    }
    
    public boolean linea(){
        boolean ganarl=false;
        for(int i=0;i<numeros.length;i++){
            int linea=0;
            for (int j = 0; j < numeros[0].length; j++) {
                if(numeros[i][j]!=0){
                 linea++;    
                }
            }
            if(linea==0){
                System.out.println("Linea!!!");
                ganarl=true;
            }
        }
    return ganarl;
    }
}
