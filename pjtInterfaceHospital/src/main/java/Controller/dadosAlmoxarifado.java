package Controller;

public class dadosAlmoxarifado {

    private static int cod;
    private static String produto;

    public dadosAlmoxarifado(){
        
    }
    
   public dadosAlmoxarifado (int cod, String produto ){
       
       setCod(cod);
       setProduto(produto);
 
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        dadosAlmoxarifado.cod = cod;
    }

    public static String getProduto() {
        return produto;
    }

    public static void setProduto(String produto) {
        dadosAlmoxarifado.produto = produto;
    }

   

    
    

    
   
}