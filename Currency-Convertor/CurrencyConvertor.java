import java.text.DecimalFormat;
import java.util.Scanner;
public class CurrencyConvertor
{

    public static String currencyChoice(int x)
    {
        if(x == 1)
        {
            return "US Dollar";
        }
        else if (x == 2)
        {
            return "Euro";
        }
        else if (x == 3)
        {
            return "Japanese Yen";
        }
        else if (x == 4)
        {
            return "Pound Sterling";
        }
        else if (x == 5)
        {
            return "Australian Dollar";
        }
        else if (x == 6)
        {
            return "Canadian Dollar";
        }
        else if (x == 7)
        {
            return "Swiss Franc";
        }
        else if(x == 8)
        {
            return "Chinese Yuan";
        }
        else if (x == 9)
        {
            return "Sweedish Krona";
        }
        else
        {
            return "New Zeland Dollar";
        }

    }
        
    
    public static void main (String args[])
    {
        double ammount, uDollar, euro, yen, sterling, aDollar, cDollar, franc, yuan, krona, nzDollar;
        int choice;
        String currencyC;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner s = new Scanner(System.in);
        System.out.println("Hi, Welcome to Currency Convertor");
        System.out.println("Which cuurency do you want to convert");
        System.out.println("1.US Dollar  2.Euro  3.Japanese Yen  4.Pound Sterling  5.Australian Dollar");
        System.out.println("6.Canadian Dollar  7.Swiss Franc  8.Chinese Yuan  9.Swedish Krona  10.New Zealand Dollar");
        choice = s.nextInt();
        currencyC = currencyChoice(choice);

        System.out.println("How much of the " + currencyC + " would you like to convert?");
        ammount  = s.nextDouble();
        s.close();

        if(choice == 1)
        {
            euro = ammount * 0.81;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 103.15;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japaneese Yen");
            sterling = ammount * 0.73;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            aDollar = ammount * 1.28;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 1.27;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 0.88;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 6.46;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 8.17;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 1.37;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 2)
        {
            uDollar = ammount * 1.22;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            yen = ammount * 127.08;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japanese Yen");
            sterling = ammount * 0.90;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            aDollar = ammount * 1.58;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 1.55;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 1.08;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 7.92;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 10.08;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 1.69;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 3)
        {
            uDollar = ammount * 0.0096;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.0079;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            sterling = ammount * 0.0071;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            aDollar = ammount * 0.012;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 0.012;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 0.0085;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 0.062;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 0.079;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 0.013;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 4)
        {
            uDollar = ammount * 1.36;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 1.11;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 141.01;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japanese Yen");
            aDollar = ammount * 1.75;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 1.72;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 1.20;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 8.78;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 11.18;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 1.87;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 5)
        {
            uDollar = ammount * 0.78;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.63;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 80.66;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japaneese Yen");
            sterling = ammount * 0.57;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            cDollar = ammount * 0.99;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 0.69;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 5.02;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 6.39;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 1.07;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 6)
        {
            uDollar = ammount * 0.79;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.64;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 81.92;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japnese Yen");
            sterling = ammount * 0.58;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            aDollar = ammount * 1.02;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            franc = ammount * 0.70;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 5.10;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 6.50;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 1.09;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 7)
        {
            uDollar = ammount * 1.13;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.92;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 117.38;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japanese Yen");
            sterling = ammount * 0.83;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterling");
            aDollar = ammount * 1.46;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 1.43;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            yuan = ammount * 7.31;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 9.31;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 1.56;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 8)
        {
            uDollar = ammount * 0.15;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.13;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 16.05;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japnese Yen");
            sterling = ammount * 0.11;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterling");
            aDollar = ammount * 0.20;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 0.20;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 0.14;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            krona = ammount * 1.27;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
            nzDollar = ammount * 0.21;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 9)
        {
            uDollar = ammount * 0.12;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.099;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 12.36;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japanese Yen");
            sterling = ammount * 0.088;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            aDollar = ammount * 0.16;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 0.15;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 0.11;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Franc");
            yuan = ammount * 0.77;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            nzDollar = ammount * 0.17;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(nzDollar) + " New Zeland Dollar");
        }
        else if(choice == 10)
        {
            uDollar = ammount * 0.71;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(uDollar) + " US Dollars");
            euro = ammount * 0.59;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(euro) + " Euros");
            yen = ammount * 73.74;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yen) + " Japanese Yen");
            sterling = ammount * 0.52;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(sterling) + " Pound Sterlings");
            aDollar = ammount * 0.93;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(aDollar) + " Australian Dollars");
            cDollar = ammount * 0.91;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(cDollar) + " Canadian Dollars");
            franc = ammount * 0.63;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(franc) + " Swiss Francs");
            yuan = ammount * 4.62;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(yuan) + " Chinese Yuan");
            krona = ammount * 5.97;
            System.out.println(ammount + " " + currencyC + " equals " + f.format(krona) + " Swedish Krona");
        }
        
        }
        


    }
