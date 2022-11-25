package Controller;

public class dadosEnfermaria {

    private static String nome;
    private static String data;
    private static String sexo;
    private static String raca;
    private static String cpf;
    private static String altura;
    private static String tiposanguineo;
    private static String tremediobox;
    private static String tremediotexto;
    private static String tcancerbox;
    private static String tcancertexto;
    private static String thipertensaobox;
    private static String thipertensaotexto;
    private static String tdiabetebox;
    private static String tdiabetetexto;
    private static String tcardiacabox;
    private static String tcardiacatexto;
    private static String tcronicabox;
    private static String tcronicatexto;
    private static String tcirurgiabox;
    private static String tcirurgiatexto;
    private static String talergiabox;
    private static String talergiatexto;
    private static String status;
    

    public dadosEnfermaria(){
        
    }
    
   public dadosEnfermaria (String nome, String data, String sexo, String raca, String altura, String tiposanguino, String tremediobox, String tremediotexto, String tcancerbox, String tcancertexto, String thipertensaobox, String thipertensaotexto
           , String tdiabetebox, String tdiabetetexto, String tcardiacabox, String tcardiacatexto, String tcronicabox, String tcronicatexto, String tcirurgiabox, String tcirurgiatexto, String talergiabox, String talergiatexto, String status){
       
        setNome(nome);       
        setData(data);   
        setSexo(sexo);
        setRaca(raca);
        setAltura(altura);
        setCpf(cpf);
        setTiposanguineo(tiposanguineo);
        setTremediobox(tremediobox);
        setTremediotexto(tremediotexto);
        setTcancerbox(tcancerbox);
        setTcancertexto(tremediotexto); 
        setThipertensaobox(thipertensaobox);
        setThipertensaotexto(thipertensaotexto);
        setTdiabetebox(tdiabetebox);
        setTdiabetetexto(tdiabetetexto);
        setTcardiacabox(tcardiacabox);
        setTcardiacatexto(tcardiacatexto);
        setTcronicabox(tcronicabox);
        setTcronicatexto(tcronicatexto);
        setTcirurgiabox(tcirurgiabox);
        setTcirurgiatexto(tcirurgiatexto);
        setTalergiabox(talergiabox);
        setTalergiatexto(talergiatexto);
        setStatus(status);
 
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        dadosEnfermaria.nome = nome;
    }

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        dadosEnfermaria.data = data;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        dadosEnfermaria.sexo = sexo;
    }

    public static String getRaca() {
        return raca;
    }

    public static void setRaca(String raca) {
        dadosEnfermaria.raca = raca;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        dadosEnfermaria.cpf = cpf;
    }

    public static String getAltura() {
        return altura;
    }

    public static void setAltura(String altura) {
        dadosEnfermaria.altura = altura;
    }

    public static String getTiposanguineo() {
        return tiposanguineo;
    }

    public static void setTiposanguineo(String tiposanguineo) {
        dadosEnfermaria.tiposanguineo = tiposanguineo;
    }

    public static String getTremediobox() {
        return tremediobox;
    }

    public static void setTremediobox(String tremediobox) {
        dadosEnfermaria.tremediobox = tremediobox;
    }

    public static String getTremediotexto() {
        return tremediotexto;
    }

    public static void setTremediotexto(String tremediotexto) {
        dadosEnfermaria.tremediotexto = tremediotexto;
    }

    public static String getTcancerbox() {
        return tcancerbox;
    }

    public static void setTcancerbox(String tcancerbox) {
        dadosEnfermaria.tcancerbox = tcancerbox;
    }

    public static String getTcancertexto() {
        return tcancertexto;
    }

    public static void setTcancertexto(String tcancertexto) {
        dadosEnfermaria.tcancertexto = tcancertexto;
    }

    public static String getThipertensaobox() {
        return thipertensaobox;
    }

    public static void setThipertensaobox(String thipertensaobox) {
        dadosEnfermaria.thipertensaobox = thipertensaobox;
    }

    public static String getThipertensaotexto() {
        return thipertensaotexto;
    }

    public static void setThipertensaotexto(String thipertensaotexto) {
        dadosEnfermaria.thipertensaotexto = thipertensaotexto;
    }

    public static String getTdiabetebox() {
        return tdiabetebox;
    }

    public static void setTdiabetebox(String tdiabetebox) {
        dadosEnfermaria.tdiabetebox = tdiabetebox;
    }

    public static String getTdiabetetexto() {
        return tdiabetetexto;
    }

    public static void setTdiabetetexto(String tdiabetetexto) {
        dadosEnfermaria.tdiabetetexto = tdiabetetexto;
    }

    public static String getTcardiacabox() {
        return tcardiacabox;
    }

    public static void setTcardiacabox(String tcardiacabox) {
        dadosEnfermaria.tcardiacabox = tcardiacabox;
    }

    public static String getTcardiacatexto() {
        return tcardiacatexto;
    }

    public static void setTcardiacatexto(String tcardiacatexto) {
        dadosEnfermaria.tcardiacatexto = tcardiacatexto;
    }

    public static String getTcronicabox() {
        return tcronicabox;
    }

    public static void setTcronicabox(String tcronicabox) {
        dadosEnfermaria.tcronicabox = tcronicabox;
    }

    public static String getTcronicatexto() {
        return tcronicatexto;
    }

    public static void setTcronicatexto(String tcronicatexto) {
        dadosEnfermaria.tcronicatexto = tcronicatexto;
    }

    public static String getTcirurgiabox() {
        return tcirurgiabox;
    }

    public static void setTcirurgiabox(String tcirurgiabox) {
        dadosEnfermaria.tcirurgiabox = tcirurgiabox;
    }

    public static String getTcirurgiatexto() {
        return tcirurgiatexto;
    }

    public static void setTcirurgiatexto(String tcirurgiatexto) {
        dadosEnfermaria.tcirurgiatexto = tcirurgiatexto;
    }

    public static String getTalergiabox() {
        return talergiabox;
    }

    public static void setTalergiabox(String talergiabox) {
        dadosEnfermaria.talergiabox = talergiabox;
    }

    public static String getTalergiatexto() {
        return talergiatexto;
    }

    public static void setTalergiatexto(String talergiatexto) {
        dadosEnfermaria.talergiatexto = talergiatexto;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        dadosEnfermaria.status = status;
    }

    

    

    

    
   
}