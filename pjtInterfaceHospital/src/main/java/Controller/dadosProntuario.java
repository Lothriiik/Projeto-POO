package Controller;

public class dadosProntuario {

    private static String nome;
    private static String dia;
    private static String mes;
    private static String ano;
    private static String hora;
    private static String cpf;
    private static String informacao;
    private static String avaliacao;
    private static String orientacao;
   
    

    public dadosProntuario(){
        
    }
    
   public dadosProntuario (String nome, String dia, String mes, String ano, String hora, String cpf, String informacao, String avaliacao, String orientacao ){
       
        setNome(nome);
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setHora(hora);
        setCpf(cpf);
        setInformacao(informacao);
        setAvaliacao(avaliacao);
        setOrientacao(orientacao);
 
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        dadosProntuario.nome = nome;
    }

    public static String getDia() {
        return dia;
    }

    public static void setDia(String dia) {
        dadosProntuario.dia = dia;
    }

    public static String getMes() {
        return mes;
    }

    public static void setMes(String mes) {
        dadosProntuario.mes = mes;
    }

    public static String getAno() {
        return ano;
    }

    public static void setAno(String ano) {
        dadosProntuario.ano = ano;
    }

    public static String getHora() {
        return hora;
    }

    public static void setHora(String hora) {
        dadosProntuario.hora = hora;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        dadosProntuario.cpf = cpf;
    }

    public static String getInformacao() {
        return informacao;
    }

    public static void setInformacao(String informacao) {
        dadosProntuario.informacao = informacao;
    }

    public static String getAvaliacao() {
        return avaliacao;
    }

    public static void setAvaliacao(String avaliacao) {
        dadosProntuario.avaliacao = avaliacao;
    }

    public static String getOrientacao() {
        return orientacao;
    }

    public static void setOrientacao(String orientacao) {
        dadosProntuario.orientacao = orientacao;
    }

    
    

    
   
}