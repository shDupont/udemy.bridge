package platforms;

public class TwitchTV implements IPlatform{
    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: transmissão inicianda");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: autorizando aplicação" );
    }
}
