public class Cavalo extends Animal{
    private String corCavalo;

    public Cavalo(String nome, int idade, String corCavalo) {
        super(nome, idade);
        this.corCavalo = corCavalo;
    }

    public String getCorCavalo() {
        return corCavalo;
    }
    public void setCorCavalo(String corCavalo) {
        this.corCavalo = corCavalo;
    }

    @Override
    public void fazerSom(){
        System.out.println("PocotoPocoto...");
    }

    @Override
    public void locomocao(){
        System.out.println("Correndo...");
    }

    public void locomocao(int valor){
        System.out.println("Correndo a " + valor + "m/s");
    }
}
