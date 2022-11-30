package Controller;

public class dadosFarmaciaPedidos {

    private static int cod;
    private static String produto;
    private static String quantidade;
    private static String setor;

    public dadosFarmaciaPedidos(){
        
    }
    
   public dadosFarmaciaPedidos (int cod, String produto ){
       
       setProduto(produto);
       setQuantidade(quantidade);
       setSetor(setor);
       setCod(cod);
 
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        dadosFarmaciaPedidos.cod = cod;
    }

   
   
    public static String getProduto() {
        return produto;
    }

    public static void setProduto(String produto) {
        dadosFarmaciaPedidos.produto = produto;
    }

    public static String getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(String quantidade) {
        dadosFarmaciaPedidos.quantidade = quantidade;
    }

    public static String getSetor() {
        return setor;
    }

    public static void setSetor(String setor) {
        dadosFarmaciaPedidos.setor = setor;
    }

    
   
}