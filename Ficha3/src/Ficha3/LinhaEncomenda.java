package Ficha3;

public class LinhaEncomenda {
    
    //Variaveis de instância.
    private String referencia, descricao;
    private double antesImpostos, imposto, desconto;
    private int quantidade;


    public LinhaEncomenda() {
        this("", "", 0, 0, 0, 0);
    }

    public LinhaEncomenda (String ref, String desc, double antesImposto, int quantidade, double imposto, double desconto) {
        this.referencia = ref;
        this.descricao = desc;
        this.antesImpostos = antesImposto;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.imposto = imposto;
    }

    public LinhaEncomenda (LinhaEncomenda linha) {
        this.referencia = linha.getReferencia();
        this.descricao = linha.getDescricao();
        this.antesImpostos = linha.getAntesImposto();
        this.quantidade = linha.getQuantidade();
        this.imposto = linha.getImposto();
        this.desconto = linha.getDesconto();
    }

    public String getReferencia() {
        return this.referencia;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public String getDescricao () {
        return this.descricao;
    }

    public double getAntesImposto () {
        return this.antesImpostos;
    }

    public int getQuantidade () {
        return this.quantidade;
    }

    public double getImposto () {
        return this.imposto;
    }

    public double calculaValorLinhaEnc () {
        return (1 + (this.imposto - this.desconto)/100) * this.antesImpostos;
    }

    public double calculaValorDesconto () {
        return this.desconto / 100 * this.antesImpostos;
    }

    public String toString () {
        StringBuffer s = new StringBuffer("Linha de Encomenda {\n");
        s.append("\tReferência: '").append(this.referencia).append("', \n");
        s.append("\tDescrição: '").append(this.descricao).append("',");
        s.append("\tPreço antes dos Impostos: ").append(this.antesImpostos).append(",\n");
        s.append("\tQuantidade da Encomenda: ").append(this.quantidade).append(",\n");
        s.append("\tImposto: ").append(String.format("%.2f%%", this.imposto)).append(",\n");
        s.append("\tDesconto: ").append(String.format("%.2f%%", this.desconto)).append(",\n");
        s.append('}');
        return s.toString();
    }

    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        LinhaEncomenda that = (LinhaEncomenda) o;
        return Double.compare(that.antesImpostos, this.antesImpostos) == 0 && this.quantidade == that.quantidade
                && Double.compare(that.imposto, this.imposto) == 0 &&
                Double.compare (that.desconto, this.desconto) == 0 && this.descricao.equals(that.descricao);
    }

    public LinhaEncomenda clone () {
        return new LinhaEncomenda(this);
    }
}
