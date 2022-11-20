package Construct;

public class dadosRecepcao {

    private static String nome;
    private static String data;
    private static String cep;
    private static String rua;
    private static String bairro;
    private static String numeroCasa;
    private static String complemento;
    private static String cidade;
    private static String estado;
    private static String telefoneProprio;
    private static String telefoneConhecido;
    private static String sexo;
    private static String cor;
    private static String civil;
    private static String cpf;
    private static String rg;
    private static String escolaridade;
    private static String sus;
    private static String adicional;

    public dadosRecepcao(){
        
    }
    
   public dadosRecepcao (String nome, String data, String cep, String rua, String bairro, String numeroCasa, String complemento, String cidade, String estado, String telefoneProprio, String telefoneConhecido, String sexo, String cor, String civil, String cpf, String rg, String escolaridade, String sus){
       
        setNome(nome);       
        setData(data);
        setCep(cep);
        setRua(rua);
        setBairro(bairro);
        setNumeroCasa(numeroCasa);
        setComplemento(complemento);
        setCidade(cidade);
        setEstado(estado);
        setTelefoneProprio(telefoneProprio);
        setTelefoneConhecido(telefoneConhecido);
        setSexo(sexo);
        setCor(cor);
        setCivil(civil);
        setCpf(cpf);
        setRg(rg);
        setEscolaridade(escolaridade);
        setSus(sus);
        setAdicional(adicional);
        
        
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        dadosRecepcao.nome = nome;
    }

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        dadosRecepcao.data = data;
    }


    public static String getCep() {
        return cep;
    }

    public static void setCep(String cep) {
        dadosRecepcao.cep = cep;
    }

    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        dadosRecepcao.rua = rua;
    }

    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        dadosRecepcao.bairro = bairro;
    }

    public static String getNumeroCasa() {
        return numeroCasa;
    }

    public static void setNumeroCasa(String numeroCasa) {
        dadosRecepcao.numeroCasa = numeroCasa;
    }

    public static String getComplemento() {
        return complemento;
    }

    public static void setComplemento(String complemento) {
        dadosRecepcao.complemento = complemento;
    }

    public static String getCidade() {
        return cidade;
    }

    public static void setCidade(String cidade) {
        dadosRecepcao.cidade = cidade;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        dadosRecepcao.estado = estado;
    }

    public static String getTelefoneProprio() {
        return telefoneProprio;
    }

    public static void setTelefoneProprio(String telefoneProprio) {
        dadosRecepcao.telefoneProprio = telefoneProprio;
    }

    public static String getTelefoneConhecido() {
        return telefoneConhecido;
    }

    public static void setTelefoneConhecido(String telefoneConhecido) {
        dadosRecepcao.telefoneConhecido = telefoneConhecido;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        dadosRecepcao.sexo = sexo;
    }

    public static String getCor() {
        return cor;
    }

    public static void setCor(String cor) {
        dadosRecepcao.cor = cor;
    }

    public static String getCivil() {
        return civil;
    }

    public static void setCivil(String civil) {
        dadosRecepcao.civil = civil;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        dadosRecepcao.cpf = cpf;
    }

    public static String getRg() {
        return rg;
    }

    public static void setRg(String rg) {
        dadosRecepcao.rg = rg;
    }

    public static String getEscolaridade() {
        return escolaridade;
    }

    public static void setEscolaridade(String escolaridade) {
        dadosRecepcao.escolaridade = escolaridade;
    }

    public static String getSus() {
        return sus;
    }

    public static void setSus(String sus) {
        dadosRecepcao.sus = sus;
    }

    public static String getAdicional() {
        return adicional;
    }

    public static void setAdicional(String adicional) {
        dadosRecepcao.adicional = adicional;
    }

    

    

    
   
}