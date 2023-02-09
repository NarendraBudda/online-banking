package com.vehicles;

public class AutomaticDCT extends Transmission {
    private float gearRatio5;
    private float gearRatio6;
    private float gearRatio7;
    private float gearRatio8;

    public AutomaticDCT(String typeOfTransmission,String modelN0,int noForwardGear,float gearRatio1,float gearRatio2,float gearRatio3,float gearRatio4,float gearRatio5, float gearRatio6,float gearRatio7,float gearRatio8){
        super(typeOfTransmission,modelN0,noForwardGear,gearRatio1,gearRatio2,gearRatio3,gearRatio4);
        this.gearRatio5=gearRatio5;
        this.gearRatio6=gearRatio6;
        this.gearRatio7=gearRatio7;
        this.gearRatio8=gearRatio8;
    }
    public void setGearRatio5(float gearRatio5) {
        this.gearRatio5 = gearRatio5;
    }

    public void setGearRatio6(float gearRatio6) {
        this.gearRatio6 = gearRatio6;
    }
    public float getGearRatio5() {
        return gearRatio5;
    }

    public float getGearRatio6() {
        return gearRatio6;
    }
    public void setGearRatio7(float gearRatio7) {
        this.gearRatio7 = gearRatio7;
    }

    public void setGearRatio8(float gearRatio8) {
        this.gearRatio8 = gearRatio8;
    }
    public float getGearRatio7() {
        return gearRatio7;
    }

    public float getGearRatio8() {
        return gearRatio8;
    }
    public void showSpec(){
        System.out.println("model no : " +super.getModelN0());
        System.out.println(" transmission type : "  +super.getTypeOfTransmission());


        System.out.println("forwaord gear " + super.getNoForwardGear());
        System.out.println("1 gear ratio : " +super.getGearRatio1());
        System.out.println("2 gear ratio : " +super.getGearRatio2());
        System.out.println("3 gear ratio  :" +super.getGearRatio3());
        System.out.println("4 gear ratio  :" +super.getGearRatio4());
        System.out.println("5 gear ratio :" +getGearRatio5());
        System.out.println("6 gear ratio : " +getGearRatio6());
        System.out.println("7 gear ratio : " +getGearRatio7());
        System.out.println("8 gear ratio : " +getGearRatio8());
    }
}
