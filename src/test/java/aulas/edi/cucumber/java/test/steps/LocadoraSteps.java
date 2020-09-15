package aulas.edi.cucumber.java.test.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import aulas.edi.cucumber.java.test.entidades.Filme;
import aulas.edi.cucumber.java.test.entidades.NotaAluguel;
import aulas.edi.cucumber.java.test.entidades.TipoAluguel;
import aulas.edi.cucumber.java.test.servicos.AluguelService;
import aulas.edi.cucumber.java.test.utils.DateUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class LocadoraSteps
{
    private Filme filme = new Filme();
    private AluguelService service = new AluguelService();
    Calendar calendar = Calendar.getInstance();

    private NotaAluguel nota;
    private String erro;
    private TipoAluguel tipoAluguel = TipoAluguel.COMUM;

    @Dado("um filme")
    public void umFilme(io.cucumber.datatable.DataTable dataTable)
    {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        filme.setEstoque(Integer.parseInt(map.get("estoque")));
        filme.setAluguel(Integer.parseInt(map.get("preco")));
        String tipo = map.get("tipo");
        tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
                : tipo.equals("extendido") ? TipoAluguel.ESTENDIDO : TipoAluguel.COMUM;
    }

    @Entao("a data de entrega sera em {int} dia")
    public void aDataDeEntregaSeraEmDia(Integer int1)
    {

    }

    @Dado("um filme com estoque de {int} unidades")
    public void um_filme_com_estoque_de_unidades(int int1)
    {
        filme.setEstoque(int1);
    }

    @Dado("quero que o preco seja R${int}")
    public void quero_que_o_preco_seja_R$(int int1)
    {
        filme.setAluguel(int1);

    }

    @Quando("alugar")
    public void alugar()
    {
        try
        {
            nota = service.alugar(filme, tipoAluguel);
        }
        catch (RuntimeException e)
        {
            erro = e.getMessage();
        }

    }

    @Entao("o preco do aluguel sera R${int}")
    public void o_preco_do_aluguel_sera_R$(int int1)
    {
        Assert.assertEquals(int1, nota.getPreco());

    }

    @Entao("o estoque do filme sera {int} unidade")
    public void o_estoque_do_filme_sera_unidade(int int1)
    {
        Assert.assertEquals(int1, filme.getEstoque());
    }

    @Entao("nao sera possivel por falta de estoque")
    public void nao_sera_possivel_por_falta_de_estoque()
    {
        Assert.assertEquals("Filme sem estoque", erro);
    }

    @Dado("que o tipo do aluguel seja {string}")
    public void que_o_tipo_do_aluguel_seja_estendido(String tipo)
    {
        tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
                : tipo.equals("estendido") ? TipoAluguel.ESTENDIDO : TipoAluguel.COMUM;

    }

    @Entao("a data de entrega sera em {int} dias")
    public void a_data_de_entrega_sera_em_dias(int int1)
    {
        Date dataEsperada = DateUtils.obterDataDifetencaDias(int1);
        Date dataObtida = nota.getDataEntrega();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Assert.assertEquals(format.format(dataEsperada), format.format(dataObtida));
    }

    @Entao("a pontuacao recebida sera {int} pontos")
    public void a_pontuacao_recebida_sera_pontos(int int1)
    {
        Assert.assertEquals(int1, nota.getPontuacao());

    }

}
