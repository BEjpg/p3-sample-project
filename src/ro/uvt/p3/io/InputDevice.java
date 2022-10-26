package ro.uvt.p3.io;

import ro.uvt.p3.apple;
import ro.uvt.p3.banana;
import ro.uvt.p3.fruit;

public class InputDevice {

    public String nextLine(){

        return "The quick brown fox jumps over the lazy dog.";
    }

    public fruit[] readFruit(){

        apple  apple1, apple2;
        banana banana1, banana2, banana3;

        apple1.set_fruit(Math.random()*10+1,Math.random()*10+1,Math.random()*10+1, fruit.color.red);
        apple2.set_fruit(Math.random()*10+1,Math.random()*10+1,Math.random()*10+1, fruit.color.green);
        banana1.set_fruit(Math.random()*10+1,Math.random()*10+1,Math.random()*10+1);
        banana2.set_fruit(Math.random()*10+1,Math.random()*10+1,Math.random()*10+1);
        banana3.set_fruit(Math.random()*10+1,Math.random()*10+1,Math.random()*10+1);

        return new fruit[]{apple1, apple2, banana1, banana2, banana3};
    }
}

