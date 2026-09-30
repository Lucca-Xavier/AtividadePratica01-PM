import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reserva> reservas = new ArrayList<>();
        ArrayList<Organizador> organizadores = new ArrayList<>();
        ArrayList<Salao> saloes = new ArrayList<>();

        criarDadosIniciais(organizadores, saloes);

        int opcao;
        do {
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("1 - Cadastrar Reserva");
            System.out.println("2 - Associar Organizador a um Salao");
            System.out.println("3 - Associar Reserva a um Salao");
            System.out.println("4 - Exibir Reservas de um Salao");
            System.out.println("5 - Quantidade de Reservas finalizados por Salao");
            System.out.println("6 - Buscar Reservas por status");
            System.out.println("7 - Exibir detalhes de uma Reserva");
            System.out.println("0 - Sair");
            System.out.println("---------------------------------------");
            if (opcao == 1) {
                reservas.add(cadastrarReserva());
                for (Reserva reserva : reservas) {
                    System.out.println(reserva.getCodigo());
                    System.out.println(reserva.getNomeCliente());
                    System.out.println(reserva.getStatus());
                    System.out.println(reserva.getValorTotal());
                }

            } else if (opcao == 2) {
                System.out.println("Nome do organizador: ");
                String org = scanner.next();
                System.out.println("Numero do Salão: ");
                int sal = scanner.nextInt();

                for (Organizador organizador : organizadores) {
                    for (Salao salao : saloes) {
                        if (organizador.getNome().equals(org) && salao.getNumero() == sal) {
                            organizador.definirSalaoResponsavel(salao);
                        }
                    }
                }

            }

            else if (opcao == 3) {
                System.out.println("Codigo da reserva: ");
                int res = scanner.nextInt();
                System.out.println("Numero do Salão: ");
                int sal = scanner.nextInt();

                for (Salao salao : saloes) {
                    for (Reserva reserva : reservas) {
                        if (reserva.getCodigo() == res && salao.getNumero() == sal) {
                            salao.addReservas(reserva);
                            reserva.setSalao(salao);
                        }
                    }
                }
            }

        } while (opcao != 0);
        scanner.close();
    }

    private static void criarDadosIniciais(ArrayList<Organizador> organizadores, ArrayList<Salao> saloes) {
        Organizador organizador1 = new Organizador("Bruno", "123.456.789-10", "Festa", "3191234-5678");
        Organizador organizador2 = new Organizador("Bruno", "123.456.789-10", "Festa", "3191234-5678");
        Organizador organizador3 = new Organizador("Bruno", "123.456.789-10", "Festa", "3191234-5678");
        organizadores.add(organizador1);
        organizadores.add(organizador2);
        organizadores.add(organizador3);

        Salao salao1 = new Salao(1, "Tipo1", 50, "Gutierrez");
        Salao salao2 = new Salao(1, "Tipo1", 50, "Gutierrez");
        Salao salao3 = new Salao(1, "Tipo1", 50, "Gutierrez");
        saloes.add(salao1);
        saloes.add(salao2);
        saloes.add(salao3);

    }

    private static Reserva cadastrarReserva() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n--- Cadastro de Reserva ---");
        System.out.println("Codigo: ");
        int codigo = scan.nextInt();

        System.out.println("Nome do Cliente: ");
        String nomeCliente = scan.next();

        System.out.println("Data da Reserva: ");
        String data = scan.next();

        System.out.println("Horario da Reserva: ");
        String horario = scan.next();

        System.out.println("Quantidade de Convidados: ");
        int quantidade = scan.nextInt();

        System.out.println("Status: ");
        String status = scan.next();

        System.out.println("Valor Total: ");
        double valorTotal = scan.nextDouble();

        Reserva reserva = new Reserva(codigo, nomeCliente, data, horario, quantidade, status, valorTotal, null);
        return (reserva);
    }

    public boolean associarOrganizadorASalao(Organizador org, Salao salao) {
        if (org == null || salao == null) {
            return false;
        }
        if (org.possuiSalao() || salao.getOrganizador() != null) {
            return false;
        }
        org.definirSalaoResponsavel(salao);
        salao.definirOrganizador(org);
        return true;
    }
}
