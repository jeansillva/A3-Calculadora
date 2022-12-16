import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nQual o nome do profissional? \n");
        String nome = sc.nextLine();

        System.out.printf("\nQual a quantidade de horas disponíveis no dia por ele ? \n");
        double hDD = sc.nextDouble();
        System.out.printf("\nQual o valor mensal desejado por ele? \n");
        double salario = sc.nextDouble();

        Profissional Pessoa1 = new Profissional(nome, salario, hDD);
        System.out.println("Nome: " + Pessoa1.getNome());
        System.out.println("Horas diárias dispóniveis: " + Pessoa1.getHDD());
        System.out.println("Salário Mensal Pretendido: " + Pessoa1.getSalarioMensal());
        System.out.println("Horas Mês: " + Pessoa1.getDiasUteis() * Pessoa1.getHDD());
        System.out.println("Valor/Hora: " + Pessoa1.CalcularValorHora(Pessoa1.getSalarioMensal(), Pessoa1.getHDD()));

        ItemSistema[] listaItenSistemas = new ItemSistema[4];

        ItemSistema tela1 = new ItemSistema();
        tela1.nomeItem = "Tela de Login";
        tela1.tipoItem = "Login";
        tela1.complexidade = 3;
        listaItenSistemas[0] = tela1;

        ItemSistema tela2 = new ItemSistema();
        tela2.nomeItem = "Tela de Cadastro";
        tela2.tipoItem = "Tela Normal";
        tela2.complexidade = 3;
        listaItenSistemas[1] = tela2;

        ItemSistema tela3 = new ItemSistema();
        tela3.nomeItem = "Tela de Pesquisa";
        tela3.tipoItem = "Tela Normal";
        tela3.complexidade = 2;
        listaItenSistemas[2] = tela3;

        ItemSistema tela4 = new ItemSistema();
        tela4.nomeItem = "Saída com Filtro";
        tela4.tipoItem = "Tela Saída";
        tela4.complexidade = 1;
        listaItenSistemas[3] = tela4;

        int totalHorasTelas = 0;
        int numeroTela = 1;

        for (ItemSistema itemSistema : listaItenSistemas) {
            totalHorasTelas += itemSistema.CalcularQuantidadeHoras();
            System.out.printf("_______________________________________________________\n\n");
            System.out.println("Item " + numeroTela + " do orçamento: " + itemSistema.nomeItem);
            System.out.println("Tipo do Item: " + itemSistema.tipoItem);
            System.out.println("Complexidade do Item: " + itemSistema.complexidade);
            System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalcularQuantidadeHoras() + "\n\n");

            numeroTela++;
        }

        double valorTotalSistema = Pessoa1.CalcularValorHora(Pessoa1.getSalarioMensal(), Pessoa1.getHDD())
                * totalHorasTelas;

        System.out.println("Valor Total do Orçamento: " + valorTotalSistema);
    }
}
