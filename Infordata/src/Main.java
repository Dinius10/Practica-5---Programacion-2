import Infor.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //producto
        Producto producto = new Producto("B165","teclado mecanico");
        System.out.println(producto);

        //ALQULABLE
        Alquilable alquilable = new Alquilable("K888","Disco duro toshiba",11.6);
        System.out.println(alquilable);

        //TECNOLIGICO
        Empresa empresa = new Empresa("SAMSUNG","Beijing calle 2",500);
        Tecnologico tecnologico = new Tecnologico("C99","Gamin 766","BOLIVIA", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);

        //MONITOR
        Monitor monitor = new Monitor("J877","27 PULGS", 15.8,"4K");
        System.out.println(monitor);

        //CPU
        Empresa thosiba = new Empresa("TOSHIBA","Dorgbini num67",2500);
        Cpu cpu = new Cpu("L900","INTEL 600","CANADA",Calendar.getInstance().getTime(), thosiba, 64);
        System.out.println(cpu);

        //INTERFAZ
        Monitor ACA100 = new Monitor("KL500", "ACA100 HD", 11, "HD");
        ACA100.reset();

        DiscoDuro TOSHIBA10 = new DiscoDuro("MN63", "TOSHIBA 1025", 20,2000);
        TOSHIBA10.reset();

    }
}
