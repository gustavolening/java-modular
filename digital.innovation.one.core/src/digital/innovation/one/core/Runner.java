package digital.innovation.one.core;

import digital.innovation.one.utils.operacao.Calculadora;
import java.util.List;
import java.util.ArrayList;
import java.sql.Date;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(5, 5));
        System.out.println(calculadora.div(30, 3));
        System.out.println(calculadora.sub(20, 10));
        System.out.println(calculadora.multi(2, 5));


    }
}
