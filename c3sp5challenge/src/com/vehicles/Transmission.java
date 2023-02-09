package com.vehicles;

public abstract class Transmission {
    private   String typeOfTransmission;
    private  String modelN0;
    private int noForwardGear;
    private float gearRatio1;
    private float gearRatio2;
    private float gearRatio3;
    private float gearRatio4;

//


    public  Transmission(String typeOfTransmission,String modelN0,int noForwardGear,float gearRatio1,float gearRatio2,float gearRatio3,float gearRatio4){
        this.typeOfTransmission=typeOfTransmission;
        this.modelN0=modelN0;
        this.noForwardGear=noForwardGear;
        this.gearRatio1=gearRatio1;
        this.gearRatio2=gearRatio2;
        this.gearRatio3=gearRatio3;
        this.gearRatio4=gearRatio4;

//
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public void setModelN0(String modelN0) {
        this.modelN0 = modelN0;
    }

    public String getModelN0() {
        return modelN0;
    }

    public void setNoForwardGear(int noForwardGear) {
        this.noForwardGear = noForwardGear;
    }

    public int getNoForwardGear() {
        return noForwardGear;
    }

    public void setGearRatio1(float gearRatio1) {
        this.gearRatio1 = gearRatio1;
    }

    public void setGearRatio2(float gearRatio2) {
        this.gearRatio2 = gearRatio2;
    }

    public void setGearRatio3(float gearRatio3) {
        this.gearRatio3 = gearRatio3;
    }

    public void setGearRatio4(float gearRatio4) {
        this.gearRatio4 = gearRatio4;
    }


    public float getGearRatio1() {
        return gearRatio1;
    }

    public float getGearRatio2() {
        return gearRatio2;
    }

    public float getGearRatio3() {
        return gearRatio3;
    }

    public float getGearRatio4() {
        return gearRatio4;
    }

    public abstract  void showSpec();



}
