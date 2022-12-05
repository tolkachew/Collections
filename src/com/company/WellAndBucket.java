package com.company;
/*
       Шаблон Adapter
*/
public class WellAndBucket {
    public static void main(String[] args) {
        DugWell dugWell = new DugWell();
        System.out.println(dugWell.getWater());

        DugWellWithBucket dugWellWithBucket = new DugWellWithBucket();
        System.out.println(dugWellWithBucket.getWater());
    }
}

interface Well{
    double getWater();
}

class DugWell implements Well{

    @Override
    public double getWater() {
        return 0;
    }
}

class Bucket {
    public double volume = 10;

    public void fill(){
        System.out.println("fill the bucket");
    }
    public void empty(){
        System.out.println("empty the bucket");
    }
}

class DugWellWithBucket implements Well{
    private Bucket bucket = new Bucket();

    @Override
    public double getWater() {
        bucket.fill();
        bucket.empty();
        return bucket.volume;
    }
}