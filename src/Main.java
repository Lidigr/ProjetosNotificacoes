public class Main {
    public static void main(String[] args) {

        UsuarioService usuarioEmail = new UsuarioService(new EmailNotificador());

        usuarioEmail.registrar ("João");
        System.out.println("---------------------------");

        UsuarioService usuarioSms= new UsuarioService(new SmsNotificador());

        usuarioEmail.registrar ("Maria");
        System.out.println("----------------------------");

        UsuarioService usuarioWhatsapp = new UsuarioService(new WhatsappNotificador());

        usuarioWhatsapp.registrar ("Pedro");

    }
}
