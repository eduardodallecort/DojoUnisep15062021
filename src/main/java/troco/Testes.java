package troco;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class Testes {

    private Troco troco = new Troco();
    private ArrayList<Double> list = new ArrayList<>();


    @Test
    public void testeTroco(){
        getList();
        Assert.assertEquals(this.list, troco.calculaNotas(576.73));
    }

    public void getList() {

        //Adicionando notas
        this.list.add(5.0);//100
        this.list.add(1.0);//50
        this.list.add(1.0);//20
        this.list.add(0.0); //10
        this.list.add(1.0); //5
        this.list.add(0.0); //2

        // Adicionando moedas
        this.list.add(1.0); //1
        this.list.add(1.0); //0,50
        this.list.add(0.0); //0,25
        this.list.add(2.0); //0,10
        this.list.add(0.0); //0.05
        this.list.add(3.0); //0.01
    }


}
