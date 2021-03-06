package com.sensingkit.plugin.sensors;

import com.getcapacitor.JSObject;
import com.sensingkit.plugin.SensingKit;

public class AccelerometerListener extends AbstractSensorListener {

    public AccelerometerListener(SensingKit kit){super(kit);}

    @Override
    protected String getSensorType(){return SensorNameResolver.NAME_ACCELEROMETER;}

    @Override
    protected JSObject toJSON(float[] values){

        JSObject ret = new JSObject();
        ret.put(keyX, values[0]);
        ret.put(keyY, values[1]);
        ret.put(keyZ, values[2]);

        return ret;
    }

}
