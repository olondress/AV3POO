public abstract class Servico implements Realizavel {
    private String nomeServico;
    private double precoServico;

    public Servico(String nomeServico, double precoServico) {
        if (nomeServico == null || nomeServico.isEmpty()) {
            throw new IllegalArgumentException("O nomeServico do serviço não pode ser vazio!");
        }
        if (precoServico <= 0) {
            throw new IllegalArgumentException("O preço do serviço deve ser maior que zero!");
        }
        this.nomeServico = nomeServico;
        this.precoServico = precoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    @Override
    public double getPrecoServico() {
        return precoServico;
    }
    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    @Override
    public void realizarServico() {
        System.out.println("Serviço de " + nomeServico + " está sendo realizado.");
    }
}