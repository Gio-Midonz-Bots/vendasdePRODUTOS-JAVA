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

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setStatusVenda(boolean statusVenda) {
        this.statusVenda = statusVenda;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "\n---------Produtos---------\n" +
                "ID= " + codProduto +
                "\nNome do Produto= " + nomeProduto +
                "\nPreço do Produto R$= " + precoProduto +
                "\nQuantidade Produto= " + quantidadeProduto +
                "\nStatus da Venda= " + (statusVenda ? "Vendido" : "No estoque")+
                "\n";
    }
}
