class TP01Q03{
    
    public static boolean isFim(String s){
        return (s.length() >= 3 && s.charAt(0)== 'F' && s.charAt(1)== 'I' && s.charAt(2)== 'M');
    }

    public static String ciframento(String s, int chave){
      String cifrada = "";
        for(int i = 0; i<s.length(); i++){
            cifrada+=(char)(s.charAt(i)+chave);
        }
    return cifrada;
    }

    public static void main(String args[]){
        String[] entrada = new String[1000];
        int numEntrada = 0;
        int chaveCiframento = 3;

        do{
            entrada[numEntrada]= MyIO.readLine();
        }while(isFim(entrada[numEntrada++]) == false);
        numEntrada--;

        for(int i = 0;i<numEntrada;i++){
            MyIO.println(ciframento(entrada[i],chaveCiframento));
        }
    }
}
