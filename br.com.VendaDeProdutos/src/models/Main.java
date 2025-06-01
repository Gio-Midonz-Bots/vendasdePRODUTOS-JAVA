package models;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("------------ADICIONAR PRODUTO-------------");
                    break;
                case 2:
                    System.out.println("------------LISTAR PRODUTO-------------");
                    break;
                case 3:
                    System.out.println("------------VENDER PRODUTO-------------");
                    break;
                case 4:
                    System.out.println("------------REMOVER PRODUTO-------------");
                    break;
                case 5:
                    System.out.println("------------ATUALIZAR PRODUTO-------------");
                    break;
                case 0:
                    System.out.println("------------ADICIONAR PRODUTO-------------");
                    break;
                default:
                    System.out.println("-----Informação invalido! Informe novamente!-----");
            }
        }
        
sc.close();
    }

}