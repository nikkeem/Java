package ex8função;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                escreva seus dados pessoais:
                nome:""");

        String nome = scanner.nextLine();
        System.out.println("""
                \tidade:""");

        int idade = scanner.nextInt();

        imprimeDadosPessoais(idade,nome);


    }

    public static void imprimeDadosPessoais(int idade,String nome){
        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
    }

    }

