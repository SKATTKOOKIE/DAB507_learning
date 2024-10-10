public class Vehicle
{
    public String make, model, countryOfOrigin;
    public int year, horsePower;
    public float engineSize;
    private String details;

    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicle(float engineSize, int horsePower, String countryOfOrigin)
    {
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        this.countryOfOrigin = countryOfOrigin;
    }

    static void numberGen(int count)
    {
        for (int i = 0; i <= count; i++) {
            System.out.println(i);
        }
    }

    public String finerDetailsDisplay(String option)
    {
        switch (option)
        {
            case "engineSize":
                setDetails("Engine size: " + engineSize);
                break;
            case "horsePower":
                setDetails("Horse power: " + horsePower);
                break;
            case "countryOfOrigin":
                setDetails("Country of origin: " + countryOfOrigin);
                break;
            default:
                break;
        }
        return "Detail: " + getDetails();
    }

    public String getDetails()
    {
        return details;
    }

    public void setDetails(String details)
    {
        this.details = details;
    }

    // CTRL W to select word
    // CTRL WW to select string
    // shift + alt to move lines up and down
    // F2 cycles errors
    // ALt + enter - suggestions to fix your code
    // Alt + insert Build constructor for class

}
