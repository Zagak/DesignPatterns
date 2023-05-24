package observer.clase;

public class Client implements IClient{
    private String nume;

    public Client(String nume){
        this.nume=nume;
    }

    @Override
    public void primesteNotificare(String message) {
        System.out.println(this.nume+" ai primit o notificare : "+message);
    }
}
