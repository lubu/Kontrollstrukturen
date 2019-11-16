public class WhileSchleifen
{
    public static void main(String[] args)
    {
/*        int i = 0;
        while (i < 1000)
        {
            System.out.println("Ergebnis:" + i);
            i = i + 34;
        }
        System.out.println("PROGRAMM ENDE");
*/
        int Z = 17;
        int T = Z - 1;

        boolean hatTeiler = false;

        while (T > 1)
        {
            if ((Z % T) == 0)
            {
                System.out.println("Teiler:" +T);
                hatTeiler = true;
            }
            T = T - 1;
        }

        if (hatTeiler == false)
        {
            System.out.println("Primzahl");
        }

    }
















}
