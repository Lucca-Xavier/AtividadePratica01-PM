import java.util.ArrayList;
import java.util.List;

public class Salao {
    private int numero;
    private String tipoSalao;
    private int capacidadeMaximaPessoas;
    private String localizacao;
    private Organizador organizadorResponsavel;
    private List<Reserva> reservas;

    public Salao(int numero, String tipoSalao, int capacidadeMaximaPessoas, String localizacao) {
        this.numero = numero;
        this.tipoSalao = tipoSalao;
        this.capacidadeMaximaPessoas = capacidadeMaximaPessoas;
        this.localizacao = localizacao;
        this.reservas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoSalao() {
        return tipoSalao;
    }

    public int getCapacidadeMaximaPessoas() {
        return capacidadeMaximaPessoas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Organizador getOrganizador() {
        return organizadorResponsavel;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void addReservas(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void definirOrganizador(Organizador organizador) {
        this.organizadorResponsavel = organizador;
    }

}
