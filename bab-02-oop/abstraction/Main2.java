abstract class Notifikasi{
    abstract void send(String message);

}

class EmailNotification extends Notifikasi{
    @Override 
    void send(String message){
        System.out.println("Pesan dari email : " + message);
    }
}

class SmsNotifikasi extends Notifikasi{
    @Override 
    void send(String message){
        System.out.println("Pesan dari Sms : " + message);
    }
}

class WhatsupNotifikasi extends Notifikasi{
    @Override 
    void send(String message){
        System.out.println("Pesan dari WA : " + message);
    }
}


public class Main2{
    public static void main(){
        EmailNotification person1 = new EmailNotification();
        person1.send("Test");
    }
  
}