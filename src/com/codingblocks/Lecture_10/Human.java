package com.codingblocks.Lecture_10;

public class Human {
    public  static int id_generator = 0;

    public int[] nums = new int[1000000];// to complete RAM so that garbage collector strike
    public String name;

    public final int id;
    public int eyes;


    public int balance = 1000;

    public static int population = 0;

    public Human(){
        this.id= Human.id_generator++;
        Human.population = Human.population + 1;
        System.out.println("One is born" + population) ;
    }
    public  Human(int eyes){
        this.id = Human.id_generator++;
        if(eyes < 4){
            this.eyes = eyes;
        }else {
            this.eyes = 3;
        }
    }



    public void smile(){
        System.out.println("See I got such a grate smile");
    }
    public void eat(){

        int balance = 9999;

        this.balance = this.balance - 100;
    }
    public Human(Human other){
        this.id = Human.id_generator++;
        this.balance= other.balance;
    }
    public static void genesis(){
        Human.population = 0;
        //here we can't take balance because static method can not take object dependent variable;
        System.out.println(population);
    }

    @Override
    protected void finalize() throws Throwable {
        population--;
        System.out.println("One is Dead" + population);
        //super.finalize();
    }
}
