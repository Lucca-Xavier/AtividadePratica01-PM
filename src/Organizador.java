public class Organizador {
    private String nome;
    private String cpf;
    private String areaAtuacao;
    private String telefone;
    private Salao salaoResponsavel;

    public Organizador(String nome, String cpf, String areaAtuacao, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.areaAtuacao = areaAtuacao;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getAreaAtuacao() { return areaAtuacao; }
    public String getTelefone() { return telefone; }
    public Salao getSalaoResponsavel() { return salaoResponsavel; }
    public boolean possuiSalao() { return salaoResponsavel != null; }
    public void definirSalaoResponsavel(Salao salao) { this.salaoResponsavel = salao; }

}
