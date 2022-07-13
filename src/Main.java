import platforms.*;
import transmissions.AdvancedLive;
import transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform){
        /*System.out.println("Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("Transmissão avançada... aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
        advancedLive.recording();
    }
}