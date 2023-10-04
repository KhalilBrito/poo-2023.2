public class EmpregadoTerceirizado extends Empregado {
    
    private Double despesaAdicional;

    public EmpregadoTerceirizado() {
    }

    public EmpregadoTerceirizado(Double despesaAdicional, String nome, Integer horas, Double valorHora) {
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public Double pagamento() {
        return super.pagamento() + (despesaAdicional * 1.1);
    }
}

