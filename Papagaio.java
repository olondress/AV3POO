public class Papagaio extends Animal{
    private String corPapagaio;

    public Papagaio(String nome, int idade, String corPapagaio) {
        super(nome, idade);
        this.corPapagaio = corPapagaio;
    }

    public String getCorPapagaio() {
        return corPapagaio;
    }
    public void setCorPapagaio(String corPapagaio) {
        this.corPapagaio = corPapagaio;
    }

    @Override
    public void fazerSom(){
        System.out.println("PruPru...");
    }

    @Override
    public void locomocao(){
        System.out.println("Voando...");
    }

    public void locomocao(int valor){
        System.out.println("Voando a " + valor + "m/s");
    }
}
