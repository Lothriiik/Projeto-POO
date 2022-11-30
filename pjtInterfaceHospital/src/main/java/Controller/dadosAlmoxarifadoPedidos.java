package Controller;

public class dadosAlmoxarifadoPedidos {
    
    private static int cod;
    private static String produto;
    private static String quantidade;
    private static String setor;

    public dadosAlmoxarifadoPedidos(){
        
    }
    
   public dadosAlmoxarifadoPedidos (int cod, String produto ){
       
       setProduto(produto);
       setQuantidade(quantidade);
       setSetor(setor);
       setCod(cod);
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        dadosAlmoxarifadoPedidos.cod = cod;
    }

   
    public static String getProduto() {
        return produto;
    }

    public static void setProduto(String produto) {
        dadosAlmoxarifadoPedidos.produto = produto;
    }

    public static String getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(String quantidade) {
        dadosAlmoxarifadoPedidos.quantidade = quantidade;
    }

    public static String getSetor() {
        return setor;
    }

    public static void setSetor(String setor) {
        dadosAlmoxarifadoPedidos.setor = setor;
    }

    
   
}