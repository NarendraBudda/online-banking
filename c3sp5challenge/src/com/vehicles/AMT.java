package com.vehicles;

public class AMT extends Transmission{
    private float gearRatio5;
    public AMT(String typeOfTransmission,String modelN0,int noForwardGear,float gearRatio1,float gearRatio2,float gearRatio3,float gearRatio4,float gearRatio5){
        super(typeOfTransmission,modelN0,noForwardGear,gearRatio1,gearRatio2,gearRatio3,gearRatio4);
        this.gearRatio5=gearRatio5;
    }
    public AMT(String typeOfTransmission,String modelN0,int noForwardGear,float gearRatio1,float gearRatio2,float gearRatio3,float gearRatio4){
        super(typeOfTransmission, modelN0, noForwardGear, gearRatio1, gearRatio2, gearRatio3, gearRatio4);
    }
    public void setGearRatio5(float gearRatio5) {
        this.gearRatio5 = gearRatio5;
    }
    public float getGearRatio5() {
        return gearRatio5;
    }
    public void showSpec(){
        System.out.println("model no : " +super.getModelN0());
        System.out.println(" transmission type : "  +super.getTypeOfTransmission());


        System.out.println("forward gear " + super.getNoForwardGear());
        System.out.println("1 gear ratio : " +super.getGearRatio1());
        System.out.println("2 gear ratio : " +super.getGearRatio2());
        System.out.println("3 gear ratio  :" +super.getGearRatio3());
        System.out.println("4 gear ratio  :" +super.getGearRatio4());
        System.out.println("5 gear ratio :" +getGearRatio5());

    }
}
