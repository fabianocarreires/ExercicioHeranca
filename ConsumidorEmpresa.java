package aula08_0311;

public class ConsumidorEmpresa extends Cliente {    
    private String dataDeFundacao;
    private String CNPJ;    
    private String inscriçãoEstadual;          

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(String dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscriçãoEstadual() {
        return inscriçãoEstadual;
    }

    public void setInscriçãoEstadual(String inscriçãoEstadual) {
        this.inscriçãoEstadual = inscriçãoEstadual;
    }        
}


