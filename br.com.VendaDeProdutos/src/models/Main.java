package models;

import aplicacoes.GerenciamentoDeVendas;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciamentoDeVendas gerenciamentoDeVendas = new GerenciamentoDeVendas();
        int opcao = -1;
        System.out.println("SEJA BEM VINDO AO PROGRAMA");

        while (opcao != 0){
            System.out.println("1- Adicionar Produto No Estoque:");
            System.out.println("2- Listar Produtos No Estoque:");
            System.out.println("3- Vender Produto Do Estoque:");
            System.out.println("4- Remover Produto Do Estoque:");
            System.out.println("5- Atualizar Produto Do Estoque:");
            System.out.println("0- Sair do Programa!");
            System.out.println("Informe qual é a sua opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    int ID;
                    System.out.println("------------ADICIONAR PRODUTO-------------");
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    double valor = sc.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    boolean status = false;

                    gerenciamentoDeVendas.adicionarProduto(nome, valor, quantidade, status);
                    break;
                case 2:
                    System.out.println("------------LISTAR PRODUTO-------------");
                    gerenciamentoDeVendas.listarProdutos();
                    break;
                case 3:
                    System.out.println("------------VENDER PRODUTO-------------");
                    System.out.println("Digite o id do produto: ");
                    ID  = sc.nextInt();
                    System.out.println("Digite a quantidade do produto: ");
                    int quatidade = sc.nextInt();
                    gerenciamentoDeVendas.verificaStatusVenda(ID,quatidade);

                    break;
                case 4:
                    System.out.println("------------REMOVER PRODUTO-------------");
                    System.out.println("Digite o ID do produto: ");
                    ID = sc.nextInt();
                    sc.nextLine();

                    boolean removidaComSucesso = gerenciamentoDeVendas.removerProduto(ID);

                    if (removidaComSucesso){
                        System.out.println("Produto removido com sucesso!");
                    }else{
                        System.out.println("ID errado, não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("------------ATUALIZAR PRODUTO-------------");
                    System.out.println("Digite o id do produto: ");
                    ID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Qual o UPDATE do nome do produto: ");
                    nome = sc.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    valor = sc.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();
                    gerenciamentoDeVendas.atualizarProdutos(ID,nome, valor, quantidade);
                    break;
                case 0:
                    System.out.println("------------Sair do Programa-------------");
                    break;
                default:
                    System.out.println("-----Informação invalido! Informe novamente!-----");
            }
        }
        
sc.close();
    }

}