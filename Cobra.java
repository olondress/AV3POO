public class Cobra extends Animal{
    private String corCobra;

    public Cobra(String nome, int idade, String corCobra) {
        super(nome, idade);
        this.corCobra = corCobra;
    }

    public String getCorCobra() {
        return corCobra;
    }
    public void setCorCobra(String corCobra) {
        this.corCobra = corCobra;
    }

    @Override
    public void fazerSom(){
        System.out.println("SzSz...");
    }

    @Override
    public void locomocao(){
        System.out.println("Rastejando...");
    }

    public void locomocao(int valor){
        System.out.println("Rastejando a " + valor + "m/s");
    }
}
