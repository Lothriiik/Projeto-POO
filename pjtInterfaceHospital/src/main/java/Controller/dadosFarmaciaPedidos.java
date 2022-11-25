package Controller;

public class dadosFarmaciaPedidos {

    private static String produto;
    private static String quantidade;
    private static String setor;

    public dadosFarmaciaPedidos(){
        
    }
    
   public dadosFarmaciaPedidos (int cod, String produto ){
       
       setProduto(produto);
       setQuantidade(quantidade);
       setSetor(setor);
 
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