import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto = "";
        double precoProduto = 0.0;

        Animal animal = null;

        int escolha;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Mostrar Produto");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Mostrar Animal");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-----------------------------------------------------------------------------");

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    precoProduto = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Produto cadastrado!");
                    System.out.println("-----------------------------------------------------------------------------");
                    break;

                case 2:
                    if (!nomeProduto.isEmpty() && precoProduto > 0) {
                        System.out.println("Produto: " + nomeProduto + " | Preço: R$" + precoProduto);
                        System.out.println("-----------------------------------------------------------------------------");
                    } else {
                        System.out.println("Produto não cadastrado.");
                        System.out.println("-----------------------------------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Escolha o tipo de animal:");
                    System.out.println("1 - Cachorro");
                    System.out.println("2 - Cavalo");
                    System.out.println("3 - Cobra");
                    System.out.println("4 - Peixe");
                    System.out.println("5 - Papagaio");
                    System.out.print("Escolha: ");
                    int tipoAnimal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("-----------------------------------------------------------------------------");

                    System.out.print("Digite o nome do animal: ");
                    String nomeAnimal = scanner.nextLine();
                    System.out.print("Digite a idade do animal: ");
                    int idadeAnimal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a cor do animal: ");
                    String corAnimal = scanner.nextLine();

                    switch (tipoAnimal) {
                        case 1:
                            animal = new Cachorro(nomeAnimal, idadeAnimal, corAnimal);
                            break;
                        case 2:
                            animal = new Cavalo(nomeAnimal, idadeAnimal, corAnimal);
                            break;
                        case 3:
                            animal = new Cobra(nomeAnimal, idadeAnimal, corAnimal);
                            break;
                        case 4:
                            animal = new Peixe(nomeAnimal, idadeAnimal, corAnimal);
                            break;
                        case 5:
                            animal = new Papagaio(nomeAnimal, idadeAnimal, corAnimal);
                            break;
                        default:
                            System.out.println("Tipo de animal inválido.");
                            break;
                    }

                    if (animal != null) {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("Animal cadastrado!");
                        System.out.println("-----------------------------------------------------------------------------");
                    }
                    break;

                case 4:
                    if (animal != null) {
                        System.out.println("Animal cadastrado: ");
                        System.out.println("Nome: " + animal.getNome());
                        System.out.println("Idade: " + animal.getIdade() + " anos");

                        if (animal instanceof Cachorro) {
                            System.out.println("Cor: " + ((Cachorro) animal).getCorCachorro());
                        } else if (animal instanceof Cavalo) {
                            System.out.println("Cor: " + ((Cavalo) animal).getCorCavalo());
                        } else if (animal instanceof Cobra) {
                            System.out.println("Cor: " + ((Cobra) animal).getCorCobra());
                        } else if (animal instanceof Peixe) {
                            System.out.println("Cor: " + ((Peixe) animal).getCorPeixe());
                        } else if (animal instanceof Papagaio) {
                            System.out.println("Cor: " + ((Papagaio) animal).getCorPapagaio());
                        }
                        animal.fazerSom();
                        animal.locomocao();
                        System.out.println("-----------------------------------------------------------------------------");
                    } else {
                        System.out.println("Animal não cadastrado.");
                        System.out.println("-----------------------------------------------------------------------------");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);
        scanner.close();
    }
}