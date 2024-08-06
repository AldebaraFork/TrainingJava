public class Conta {
    private String nomeUsuario;
    private String senhaUsuario;
    private String emailUsuario;

    //METODOS QUE TODA CONTA TEM
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void SetNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    public void SetSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void SetEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

}
