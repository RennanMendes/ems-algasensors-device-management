package com.algaworks.algasensors.device.management.api.client;

import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {
    void enabledMonitoring(TSID sensorId);
    void disableMonitoring(TSID sensorId);
}