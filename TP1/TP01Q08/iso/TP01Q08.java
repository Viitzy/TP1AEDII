import java.io.*;
import java.net.*;

class TP01Q08{
        public static boolean isFim(String s){
            return(s.length()>=3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
        }
       public static int isBr(String s){
            int br = 0;
            s=s.replaceAll(" ", "");
            for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='<'&&s.charAt(i+1)=='b'&&s.charAt(i+2)=='r'&&s.charAt(i+3)=='>')
                br++;
            } 
        return br;
       }
       public static int isTable(String s){
            int table = 0;
            s=s.replaceAll(" ", "");
            for(int i = 0 ; i< s.length(); i++){
              if(s.charAt(i)=='<'&&s.charAt(i+1)=='t'&&s.charAt(i+2)=='a'&&s.charAt(i+3)=='b'&&s.charAt(i+4)=='l'&&s.charAt(i+5)=='e'&&s.charAt(i+6)=='>')
                 table++;
              } 
        return table;
       }
       public static int isA(String s){
           int a = 0;
           s=s.replaceAll(" ", "");
           for(int i = 0 ; i< s.length(); i++){
               if(s.charAt(i)=='a')
                a++;
           }
           a-=isTable(s);
        return a;
       }
       public static int isE(String s){
        int e = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='e')
             e++;
        }
        e-=isTable(s);
     return e;
    }
    public static int isI(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='i')
             vogal++;
        }
        
     return vogal;
    }
    public static int isO(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='o')
             vogal++;
        }
        
     return vogal;
    }
    public static int isU(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='u')
             vogal++;
        }
        
     return vogal;
    }
    public static int isA1(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isE1(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isI1(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isO1(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isU1(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isA2(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isE2(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isI2(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isO2(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isU2(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isA3(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isO3(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isA4(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isE4(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isI4(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isO4(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isU4(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='�')
             vogal++;
        }
        
     return vogal;
    }
    public static int isVogalMaiuscula(String s){
        int vogal = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
             vogal++;
        }
        
     return vogal;
    }
    
    public static int isConsoante(String s){
        int consoante = 0;
        s=s.replaceAll(" ", "");
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
             consoante++;
        }
        int vogais = isA(s)+isE(s)+isI(s)+isO(s)+isU(s)+(isTable(s)*5)+(isBr(s)*2);
        consoante-=vogais;

    return consoante;
    }
       
       
       
       public static String getHtml(String endereco){
          URL url;
          InputStream is = null;
          BufferedReader br;
          String resp = "", line;
    
          try {
             url = new URL(endereco);
             is = url.openStream();  // throws an IOException
             br = new BufferedReader(new InputStreamReader(is));
    
             while ((line = br.readLine()) != null) {
                resp += line + "\n";
             }
          } catch (MalformedURLException mue) {
             mue.printStackTrace();
          } catch (IOException ioe) {
             ioe.printStackTrace();
          } 
    
          try {
             is.close();
          } catch (IOException ioe) {
             // nothing to see here
    
          }
    
          return resp;
       }
    public static void main(String[] args) {
        String endereco, html;
        String[] entrada =  new String[1000];
        int numEntrada = 0;

        do{
            entrada[numEntrada]=MyIO.readLine();
        }while(isFim(entrada[numEntrada++]) == false);
        numEntrada--;

          
        for(int i = 0; i< numEntrada-1 ; i+=2){
          html = getHtml(entrada[i+1]);       
          System.out.print("a("+isA(html)+") ");
          System.out.print("e("+isE(html)+") ");
          System.out.print("i("+isI(html)+") ");
          System.out.print("o("+isO(html)+") ");
          System.out.print("u("+isU(html)+") ");
          System.out.print("�("+isA1(html)+") ");
          System.out.print("�("+isE1(html)+") ");
          System.out.print("�("+isI1(html)+") ");
          System.out.print("�("+isO1(html)+") ");
          System.out.print("�("+isU1(html)+") ");
          System.out.print("�("+isA2(html)+") ");
          System.out.print("�("+isE2(html)+") ");
          System.out.print("�("+isI2(html)+") ");
          System.out.print("�("+isO2(html)+") ");
          System.out.print("�("+isU2(html)+") ");
          System.out.print("�("+isA3(html)+") ");
          System.out.print("�("+isO3(html)+") ");
          System.out.print("�("+isA4(html)+") ");
          System.out.print("�("+isE4(html)+") ");
          System.out.print("�("+isI4(html)+") ");
          System.out.print("�("+isO4(html)+") ");
          System.out.print("�("+isU4(html)+") ");
          System.out.print("consoante("+isConsoante(html)+") ");
          System.out.print("<br>("+isBr(html)+") ");
          System.out.print("<table>("+isTable(html)+") ");
          System.out.print(entrada[i]);
          System.out.println();
        }
         
          
    }
    
}
