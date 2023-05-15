package HW.abstractInterface;

public class Main {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Nokia nokia = new Nokia();
        Nokia nokia1 =new Nokia();
        Fly fly = new Fly();


        Telephone[] phone = {samsung, fly, nokia};
        Smartphone[] smart = {samsung, fly};
        PushButtonPhone[] pushPhone = {nokia,nokia1};


    }
}
