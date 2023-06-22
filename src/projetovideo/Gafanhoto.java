package projetovideo;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
    
     @Override
    public String status() {
        return "---GAFANHOTO---" 
                + "\n Nome: " + nome 
                + "\n Idade: " + idade + " | Sexo: " + sexo + " | Exp: " + experiencia
                + "\n Login: " + login;
    }
    
    
    
}
