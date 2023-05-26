import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setDuracaoEmMinutos(170);

        meuFilme.exibeFichaTecninca();
        meuFilme.avalia(10);
        meuFilme.avalia(7.0);
        meuFilme.avalia(6);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println("Soma das Avaliações:" + meuFilme.mediaDasAvaliacoes());
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Nome: " + meuFilme.getNome());
        System.out.println("Ano de lançamento: " + meuFilme.getAnoDeLancamento());
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2002);
        lost.setDuracaoEmMinutos(200);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("*************************");
        System.out.println("Nome da Serie: " + lost.getNome());
        System.out.println("Ano de Lançamento: " + lost.getAnoDeLancamento());
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


    }
}
