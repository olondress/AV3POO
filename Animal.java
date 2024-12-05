public abstract class Animal implements Exibivel {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do animal não pode ser negativa!");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void fazerSom();
    public abstract void locomocao();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " anos");
    }
}