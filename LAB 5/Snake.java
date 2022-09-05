package P5;

import P5.TiredAnimal;

public class Snake implements TiredAnimal {

    public void eat(){
        System.out.println("SNAKE : Hunting");
    }

    public void sound(){
        System.out.println("SNAKE : Roar");
    }

    public void sleep(){
        System.out.println("SNAKE : Sleeping");
    }
}
