package com.example;

import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

import static java.lang.System.currentTimeMillis;

/**
 * Created by dajudge on 24.08.2016.
 */
public class Startup {
    public static void main(String argv[]) throws MqttException {
        MqttAsyncClient client = new MqttAsyncClient("ssl://mqtt.exmaple.com", "testClient");
        client.reconnect();
    }
}
