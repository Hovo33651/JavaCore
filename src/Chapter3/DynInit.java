package Chapter3;

public class DynInit {
    public static void main(String[] args) {
        {
            double a, b, c;
            a = 3.0;
            b = 4.0;
            c = Math.sqrt(a * a + b * b);
            System.out.println("nerqnadzig = " + c);
        }
        double Daxod, Rojik, Hark, Mnacord;
        Daxod = 1_500_000;
        Hark = Daxod * 24 / 100;
        Rojik = (Daxod - Hark) * 15 / 100;
        Mnacord = Daxod - Hark - Rojik;
        System.out.println(Mnacord);


    }

}

