package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.internal.DivHelper;
import digital.innovation.one.utils.operacao.internal.MultiHelper;
import digital.innovation.one.utils.operacao.internal.SubHelper;
import digital.innovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {
    private DivHelper divHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multiHelper = new MultiHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);

    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);

    }
    public int multi(int a, int b){
        return multiHelper.execute(a,b);

    }
    public int div(int a, int b){
        return divHelper.execute(a,b);

    }
}
