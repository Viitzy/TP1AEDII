import java.util.Random;

class TP01Q04{

    public static boolean isFim(String s){
        return(s.length()>=3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String aleatorio(String s,char letra1,char letra2){
        String retorno = "";

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == letra1)
                retorno += letra2;
            else
                retorno += s.charAt(i);
        }
    return retorno;
    }
    public static void main(String args[]){

        String[] entrada =  new String[1000];
        int numEntrada = 0;
        Random gerador = new Random();
        gerador.setSeed(4);
        
        do{
            entrada[numEntrada]=MyIO.readLine();
        }while(isFim(entrada[numEntrada++]) == false);
        numEntrada--;   
        
        for(int i = 0;i<numEntrada;i++){
         char a = ((char)('a' + Math.abs(gerador.nextInt())%26));
         char b = ((char)('a' + Math.abs(gerador.nextInt())%26));
         
         MyIO.println(aleatorio(entrada[i],a ,b));
            
        }
    }
}
