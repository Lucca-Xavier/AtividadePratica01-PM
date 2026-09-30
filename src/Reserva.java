public class Reserva {
    private int codigo;
    private String nomeCliente;
    private String data;
    private String horario;
    private int quantidadeConvidados;
    private String status;
    private double valorTotal;
    private Salao salao;

    public Reserva(int codigo, String nomeCliente, String data, String horario, int quantidadeConvidados, String status, double valorTotal, Salao salao) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.horario = horario;
        this.quantidadeConvidados = quantidadeConvidados;
        this.status = status;
        this.valorTotal = valorTotal;
        this.salao = salao;
    }

    public int getCodigo() { return codigo; }
    public String getNomeCliente() { return nomeCliente; }
    public String getData() { return data; }
    public String getHorario() { return horario; }
    public int getQuantidadeConvidados() { return quantidadeConvidados; }
    public String getStatus() { return status; }
    public double getValorTotal() { return valorTotal; }
    public Salao getSalao() { return salao; }
    public void setSalao(Salao salao){
        this.salao = salao;
    }
}
