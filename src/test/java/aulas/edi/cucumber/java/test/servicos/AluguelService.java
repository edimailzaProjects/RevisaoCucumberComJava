package aulas.edi.cucumber.java.test.servicos;

import aulas.edi.cucumber.java.test.entidades.Filme;
import aulas.edi.cucumber.java.test.entidades.NotaAluguel;
import aulas.edi.cucumber.java.test.entidades.TipoAluguel;
import aulas.edi.cucumber.java.test.utils.DateUtils;

public class AluguelService
{
    NotaAluguel nota = new NotaAluguel();
    public NotaAluguel alugar(Filme filme, TipoAluguel tipo)
    {
        if(filme.getEstoque() == 0) throw new RuntimeException("Filme sem estoque");
        switch (tipo)
        {
        case COMUM:
            nota.setPreco(filme.getAluguel());
            nota.setDataEntrega(DateUtils.obterDataDifetencaDias(1));
            nota.setPontuacao(1);
            break;
        case ESTENDIDO:
            nota.setPreco(filme.getAluguel()*2);
            nota.setDataEntrega(DateUtils.obterDataDifetencaDias(3));
            nota.setPontuacao(2);
            break;     
        case SEMANAL:
            nota.setPreco(filme.getAluguel()*3);
            nota.setDataEntrega(DateUtils.obterDataDifetencaDias(7));
            nota.setPontuacao(3);
            
            break;
        }
        
         
        
        filme.setEstoque(filme.getEstoque() -1);
        return nota;
    }

}
