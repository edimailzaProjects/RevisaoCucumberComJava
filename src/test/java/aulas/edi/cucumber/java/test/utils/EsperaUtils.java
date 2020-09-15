package aulas.edi.cucumber.java.test.utils;

public class EsperaUtils
{
    public void esperar(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
