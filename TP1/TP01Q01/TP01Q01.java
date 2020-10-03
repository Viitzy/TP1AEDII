class TP01Q01 {
    public static boolean isFim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
     }
    public static boolean isPalindromo(String s){
     int aux=0;
     boolean retorno = false;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                aux++;
            }
        }
     if(aux==s.length())
        retorno = true;
     else
        retorno = false;  

    return retorno;
    }


    public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;

      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;

      for(int i = 0; i < numEntrada; i++){
         if(isPalindromo(entrada[i])==true)
           System.out.println("SIM");
         else
           System.out.println("NAO");
       }

    }
}
