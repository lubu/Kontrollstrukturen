public class IfBedingungen
{
    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
    {
        double annualtax = taxPerPersonAndMonth * inhabitants * 12;

        if (isCapital && inhabitants > 100000)
        {
            return true;
        }
        else if (inhabitants > 200000 && annualtax >= 720000000 )
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public static void main(String[] args)
    {
        boolean isCapital;
        int inhabitants;
        double taxPerPersonandMonth;
        if (isMetropolis(false, inhabitants = 202000, taxPerPersonandMonth = 72))
        {
            System.out.println("Das ist eine Hauptstadt");
        }
        else
        {
            System.out.println("Das ist keine Hauptstadt");
        }


    }


}


