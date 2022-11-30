package Controller;

public class dadosFarmacia {

    private static int cod;
    private static String produto;

    public dadosFarmacia(){
        
    }
    
   public dadosFarmacia (int cod, String produto ){
       
       setCod(cod);
       setProduto(produto);
 
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        dadosFarmacia.cod = cod;
    }

    public static String getProduto() {
        return produto;
    }

    public static void setProduto(String produto) {
        dadosFarmacia.produto = produto;
    }

   

    
    

    
   
}