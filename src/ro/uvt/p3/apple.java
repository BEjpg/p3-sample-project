package ro.uvt.p3;

public class apple extends fruit {
    color apple_color;

    @Override
    public void set_fruit(Number w, Number sc, Number wc, color c) {
        super.set_fruit(w, sc, wc);
        apple_color = c;
    }
}
