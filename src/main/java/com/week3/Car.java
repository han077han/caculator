package com.week3;

public class Car {

    //필드
    String company;
    String model;
    String color;
    double price;
    double speed;
    char gear;
    boolean lights;

    //생성자 : 처음 객체가 생성될 때 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car(){
        //아무것도 없는거, 기본생성자 (생략이 가능)
    }

    //메소드 영역

    //gasPedal
            //input : kmh output : speed
            double gasPedal(double kmh){
                speed = kmh;
                return speed;
            }

    //brakePedal
            //input : x output : speed
            double brakePedal(){
                speed = 0;
                return speed;
            }

    //changeGear
            //input : gear(char type) output: gear
            char changeGear(char type){
                gear = type;
                return gear;

            }

    //onOffLight
            //input : x output : lights(boolean type)
            boolean onOffLight(){
                   lights = lights;
                   return lights;
            }

   // horn
            //input : x output : x
            void horn(){
                System.out.println("빵빵");
            }




}
