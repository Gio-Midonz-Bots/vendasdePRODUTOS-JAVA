package aplicacoes;

import models.Produtos;

import java.util.ArrayList;

public class GerenciamentoDeVendas {
       private ArrayList<Produtos> lista = new ArrayList<>();

    public GerenciamentoDeVendas() {

    }

    public void adicionarProduto(String nome, double preco, int quantidade,boolean statusVenda) {
        int ID = lista.size() + 1;
        Produtos pt = new Produtos(ID,nome,preco,quantidade,statusVenda);
        lista.add(pt);
        }

    public boolean removerProduto(int ID) {
        for(int i =0; i< lista.size(); i++){
            Produtos pt = lista.get(i);
            if (pt.getCodProduto()==ID){
                lista.remove(i);
                return true;
            }
        }
            return false;
    }
    public void listarProdutos() {
        for(Produtos pt : lista){
            System.out.println(pt.toString());
        }
    }

    public boolean verificaStatusVenda(int ID,int quantidade) {
        for (int i = 0; i < lista.size(); i++) {
            Produtos pt = lista.get(i);
            if(pt.getCodProduto()==ID){
                pt.setStatusVenda(true);
                pt.setQuantidadeProduto(pt.getQuantidadeProduto()-quantidade);
                return true;
            }
        }
        return false;
    }

    public void atualizarProdutos(int ID, String nome, double preco, int quantidade) {
        for (int i = 0; i < lista.size(); i++) {
            Produtos pt = lista.get(i);
            if(pt.getCodProduto()==ID){
                pt.setNomeProduto(nome);
                pt.setPrecoProduto(preco);
                pt.setQuantidadeProduto(quantidade);
            }
        }
    }
}

