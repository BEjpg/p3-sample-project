package ro.uvt.p3;

public abstract class fruit {
    Number weight;
    Number sugar_content;
    Number water_content;
    public enum color
    {
      red,yellow,green,purple
    }

    public void set_fruit(Number w, Number sc, Number wc){
        weight = w;
        sugar_content = sc;
        water_content = wc;
    }
}



