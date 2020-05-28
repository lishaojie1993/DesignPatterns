package com.mashibing.dp.strategy;

public class Dog implements Comparable<Dog> {

    int food;
    int weight;

    public Dog(int food) {
        this.food = food;
    }
    public Dog(int food,int weight) {
        this.food = food;
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog d) {
        if(this.food < d.food) return -1;
        else if(this.food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                ", weight=" + weight +
                '}';
    }
}
