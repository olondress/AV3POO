public abstract class Produto implements Venda {
    private String nomeProduto;
    private double precoProduto;

    public Produto(String nomeProduto, double precoProduto) {
        if (precoProduto <= 0) {
            throw new IllegalArgumentException("O preço do produto deve ser maior que zero!");
        }
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    @Override
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Produto: " + nomeProduto + " | Preço: R$" + precoProduto);
    }
}