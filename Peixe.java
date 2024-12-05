public class Peixe extends Animal{
    private String corPeixe;

    public Peixe(String nome, int idade, String corPeixe) {
        super(nome, idade);
        this.corPeixe = corPeixe;
    }

    public String getCorPeixe() {
        return corPeixe;
    }
    public void setCorPeixe(String corPeixe) {
        this.corPeixe = corPeixe;
    }

    @Override
    public void fazerSom(){
        System.out.println("BuBu...");
    }

    @Override
    public void locomocao(){
        System.out.println("Nadando...");
    }

    public void locomocao(int valor){
        System.out.println("Nadando a " + valor + "m/s");
    }
}
