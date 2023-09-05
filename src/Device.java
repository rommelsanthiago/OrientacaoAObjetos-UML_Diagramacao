import Iphone.Iphone;
import Apps.AppInternet;
import Apps.AppMusic;
import Apps.AppPhone;

public class Device {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        AppMusic music = (AppMusic) iphone;
        AppPhone phone = (AppPhone) iphone;
        AppInternet internet = (AppInternet) iphone;

        System.out.println("App Internet");
        internet.page();
        internet.addNewTab();
        internet.refreshPage();
        System.out.println(" ");

        System.out.println("App Music");
        music.selectMusic();
        music.reproduce();
        music.pause();
        System.out.println(" ");

        System.out.println("App Phone");
        phone.call();
        phone.attend();
        phone.startVoicemail();
    }
}