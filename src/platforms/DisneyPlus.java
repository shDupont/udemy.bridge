package platforms;

public class DisneyPlus implements IPlatform{
    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: transmissão inicianda");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: autorizando aplicação" );
    }
}
