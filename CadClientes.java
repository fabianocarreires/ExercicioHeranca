package aula08_0311;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadClientes {

    static private List<ConsumidorEmpresa> empresas = new ArrayList();
    private static List<ConsumidorFinal> consumidoresFinais = new ArrayList();
    public static Scanner ler = new Scanner(System.in);
    public static int codigo = 1;

    public static void main(String[] args) {
        int opcao = 0;
        
        do {
            menu();
            opcao = Integer.parseInt(ler.nextLine());
            if (opcao == 1) {
                cadastrarE();
            }
            if (opcao == 2) {
                cadastrarCF();
            }
            if (opcao == 3) {
                listarE();
            }
            if (opcao == 4) {
                listarCF();
            }
            if (opcao == 5) {
                listarT();
            }
        } while (opcao != 6);
    }

    public static void menu() {
        System.out.println("*** Cadastro de Clientes ***");
        System.out.println("1 - Cadastrar Empresa ");
        System.out.println("2 - Cadastrar Consumidor Final  ");
        System.out.println("3 - Listar Empresas ");
        System.out.println("4 - Listar Consumidores Finais ");
        System.out.println("5 - Listar tudo");
        System.out.println("6 - Sair ");
        System.out.print("Opção: ");
    }
    
    public static void cadastrarE() {
        ConsumidorEmpresa novaEmpresa = new ConsumidorEmpresa();
        System.out.println("\n*** Cadastro de Cliente Empresa ***\n");
        System.out.print("Digite o nome: ");
        novaEmpresa.setNome(ler.nextLine());
        System.out.print("Digite o endereço: ");
        novaEmpresa.setEndereco(ler.nextLine());
        System.out.print("Digite o telefone: ");
        novaEmpresa.setTelefone(ler.nextLine());
        System.out.print("Digite o Limite de Crédito: R$ ");
        novaEmpresa.setLimiteDeCredito(Double.parseDouble(ler.nextLine()));       
        System.out.print("Digite a Data de Cadastro (dd/mm/aaaa): ");
        novaEmpresa.setDataDeCadastro(ler.nextLine());
        System.out.print("Digite a Data de Fundação (dd/mm/aaaa): ");
        novaEmpresa.setDataDeFundacao(ler.nextLine());
        System.out.print("Digite o CNPJ: ");
        novaEmpresa.setCNPJ(ler.nextLine());
        System.out.print("Digite a Inscrição Estadual: ");
        novaEmpresa.setInscriçãoEstadual(ler.nextLine());
        novaEmpresa.setCodigo(codigo);
        empresas.add(novaEmpresa);
        codigo++;
        System.out.println("\nCliente Empresa Cadastrado Com Sucesso!\n");
    }    
    
    public static void cadastrarCF() {
        ConsumidorFinal novoCF = new ConsumidorFinal();
        System.out.println("\n*** Cadastro de Consumidor Final ***\n");
        System.out.print("Digite o nome: ");
        novoCF.setNome(ler.nextLine());
        System.out.print("Digite o endereço: ");
        novoCF.setEndereco(ler.nextLine());
        System.out.print("Digite o telefone: ");
        novoCF.setTelefone(ler.nextLine());
        System.out.print("Digite o Limite de Crédito: R$ ");
        novoCF.setLimiteDeCredito(Double.parseDouble(ler.nextLine()));       
        System.out.print("Digite a Data de Cadastro (dd/mm/aaaa): ");
        novoCF.setDataDeCadastro(ler.nextLine());
        System.out.print("Digite a Data de Nascimento (dd/mm/aaaa): ");
        novoCF.setDataDeNascimento(ler.nextLine());
        System.out.print("Digite o CPF: ");
        novoCF.setCPF(ler.nextLine());
        System.out.print("Digite o RG: "); 
        novoCF.setRG(ler.nextLine());
        System.out.print("Digite o sexo (M/F): ");
        novoCF.setSexo(ler.nextLine());
        novoCF.setCodigo(codigo);
        consumidoresFinais.add(novoCF);
        codigo++;
        System.out.println("\nConsumidor Final Cadastrado Com Sucesso!\n");
    }
    
    public static void listarE() {
        System.out.println("\n*** Lista de Clientes Empresa ***\n");
        if (empresas.isEmpty()) {
            System.out.println("\nNão Existem Clientes Empresa Cadastrados!\n");
        } else {
            for (ConsumidorEmpresa empresa : empresas) { 
                System.out.println("Código: "+ empresa.getCodigo());
                System.out.println("Nome: " + empresa.getNome());
                System.out.println("Endereço: " + empresa.getEndereco());
                System.out.println("Telefone: "+ empresa.getTelefone());
                System.out.println("Limite de Crédito: R$"+ empresa.getLimiteDeCredito());
                System.out.println("Data de Cadastro: "+ empresa.getDataDeCadastro());
                System.out.println("Data de Fundação: "+ empresa.getDataDeFundacao());
                System.out.println("CNPJ: "+ empresa.getCNPJ());
                System.out.println("Inscrição Estadual: "+ empresa.getInscriçãoEstadual());                
                System.out.println("------------------------------------------------\n");
            }
        }
    }
    
    public static void listarCF() {
        System.out.println("\n*** Lista de Consumidores Finais ***\n");
        if (consumidoresFinais.isEmpty()) {
            System.out.println("\nNão Existem Consumidores Finais Cadastrados!\n");
        } else {
            for (ConsumidorFinal consumidorFinal : consumidoresFinais) { 
                System.out.println("Código: "+ consumidorFinal.getCodigo());
                System.out.println("Nome: " + consumidorFinal.getNome());
                System.out.println("Endereço: " + consumidorFinal.getEndereco());
                System.out.println("Telefone: "+ consumidorFinal.getTelefone());
                System.out.println("Limite de Crédito: R$"+ consumidorFinal.getLimiteDeCredito());
                System.out.println("Data de Cadastro: "+ consumidorFinal.getDataDeCadastro());
                System.out.println("Data de Nascimento: "+ consumidorFinal.getDataDeNascimento());
                System.out.println("CPF: "+ consumidorFinal.getCPF());
                System.out.println("RG: "+ consumidorFinal.getRG());
                System.out.println("Sexo: "+ consumidorFinal.getSexo());
                System.out.println("------------------------------------------------\n");
            }
        }
    }
    
    public static void listarT() {
        System.out.println("\n*** Lista de Todos os Clientes ***\n");
        listarE();
        listarCF();
    }
}

