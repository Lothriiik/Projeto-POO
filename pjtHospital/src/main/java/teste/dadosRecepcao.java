package teste;

public class dadosRecepcao {

    private static String nome;
    private static int dia;
    private static int mes;
    private static int ano;
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

    public dadosRecepcao(){
        
    }
    
   public dadosRecepcao (String nome, int dia, int mes, int ano, String cep, String rua, String bairro, String numeroCasa, String complemento, String cidade, String estado, String telefoneProprio, String telefoneConhecido, String sexo, String cor, String civil, String cpf, String rg, String escolaridade, String sus){
       
        setNome(nome);
        setDia(dia);
        setMes(mes);
        setAno(ano);
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
        
    }

    public static String getNome() {
        System.out.println("Digite o numero do cartão do sus : ");
        return nome;
    }

    public static void setNome(String nome) {
        dadosRecepcao.nome = nome;
    }

    public static int getDia() {
        return dia;
    }

    public static void setDia(int dia) {
        dadosRecepcao.dia = dia;
    }

    public static int getMes() {
        return mes;
    }

    public static void setMes(int mes) {
        dadosRecepcao.mes = mes;
    }

    public static int getAno() {
        return ano;
    }

    public static void setAno(int ano) {
        dadosRecepcao.ano = ano;
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

    

    

    
   
}