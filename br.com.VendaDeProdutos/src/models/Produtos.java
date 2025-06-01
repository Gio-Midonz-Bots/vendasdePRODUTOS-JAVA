package models;

public class Produtos {
    private int codProduto;
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    private boolean statusVenda;

    public Produtos(int codProduto, String nomeProduto, double precoProduto, int quantidadeProduto, boolean statusVenda) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.statusVenda = statusVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public boolean getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(boolean statusVenda) {
        this.statusVenda = statusVenda;
    }

    @Override
    public String toString() {
        return "Produtos\n" +
                "codProduto= " + codProduto +
                "\nNome Produto= " + nomeProduto +
                "\nPreço do Produto= " + precoProduto +
                "\nQuantidade Produto= " + quantidadeProduto +
                "\nStatus da Venda= " + (statusVenda ? "Estoque" : "Vendido");
    }
}
