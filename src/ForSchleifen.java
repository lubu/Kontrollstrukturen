public class ForSchleifen
{
    public static void main(String[] args)
    {


        int startzahl = 2;
        int zaehler = 2;

        while (zaehler <= 9)
        {
            System.out.println(startzahl + " x " + zaehler);
            startzahl = startzahl * zaehler;
            zaehler++;
        }

        for (zaehler = 2; zaehler <= 9; zaehler++)
        {
            System.out.println(startzahl + " / " + zaehler);
            startzahl = startzahl / zaehler;
        }
        System.out.println(startzahl);

    }


}
