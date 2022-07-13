package transmissions;

import platforms.IPlatform;

public class AdvancedLive extends Live{
    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na live");
    }

    public void recording(){
        System.out.println("Gravando");
    }
}
