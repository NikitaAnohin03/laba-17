package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Logistic {
    String Transport;
    List<String> accessories=new ArrayList();
    public String toString(){
        return "Kind of transport:" + "Transport \n"+ accessories;
    }
}
abstract class LogisticFactory{
    public abstract Logistic createLogistic();
}
class RoadLogisticFactory extends LogisticFactory {
    public Logistic createLogistic(){
        return new RoadLogistic();
    }}

class AirLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new AirLogistic();
    }}

class SeaLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new SeaLogistic();
    }}

class RoadLogistic extends Logistic{
    public RoadLogistic(){
        Transport="RoadLogistic";
        accessories.add("Capacity in tons");
        accessories.add("Fuel consumption");
        accessories.add("Travel time");
        accessories.add("Navigation system");
    }
    @Override
    public String toString(){
        return "Kind of transport:" + "Road transport"+ accessories;
    }
}
class AirLogistic extends Logistic{
    public AirLogistic(){
        Transport="AirLogistic";
        accessories.add("Capacity in tons");
        accessories.add("Fuel consumption");
        accessories.add("Travel time");
        accessories.add("Navigation system");
    }
    @Override
    public String toString(){
        return "Kind of transport:" + "Air transport " + accessories;
    }
}
class SeaLogistic extends Logistic{
    public SeaLogistic(){
        Transport="SeaLogistic";
        accessories.add("Capacity in tons");
        accessories.add("Fuel consumption");
        accessories.add("Travel time");
        accessories.add("Navigation system");
    }
    @Override
    public String toString(){
        return "Kind of transport:" + "Maritime transport"+ accessories;
    }
}
public class Main{
    public static void main(String args[]){
        LogisticFactory myRoadFactory=new RoadLogisticFactory();
        Logistic myRoadLogistic=myRoadFactory.createLogistic();
        System.out.println(myRoadLogistic);

        LogisticFactory myAirFactory=new AirLogisticFactory();
        Logistic myAirLogistic=myAirFactory.createLogistic();
        System.out.println(myAirLogistic);

        LogisticFactory mySeaFactory=new SeaLogisticFactory();
        Logistic mySeaLogistic=mySeaFactory.createLogistic();
        System.out.println(mySeaLogistic);
    }
}