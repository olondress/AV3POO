public class Cachorro extends Animal {
    private String corCachorro;

    public Cachorro(String nome, int idade, String corCachorro) {
        super(nome, idade);
        this.corCachorro = corCachorro;
    }

    public String getCorCachorro() {
        return corCachorro;
    }
    public void setCorCachorro(String corCachorro) {
        this.corCachorro = corCachorro;
    }

    @Override
    public void fazerSom(){
        System.out.println("AuAu...");
    }

    @Override
    public void locomocao(){
        System.out.println("Andando...");
    }

    public void locomocao(int valor){
        System.out.println("Andando a " + valor + "m/s");
    }
}
