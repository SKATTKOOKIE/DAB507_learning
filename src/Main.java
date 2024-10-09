//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Vehicle bmw = new Vehicle("BMW","m4", 2020);
        Vehicle vw = new Vehicle("VW","Polo", 2014);

        System.out.println( "Here is the brand of my car:" + bmw.getMake());
    }
}