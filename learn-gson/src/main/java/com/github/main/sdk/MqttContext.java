package com.github.main.sdk;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * @author dfk
 * @Description TODO
 * @create 2021/7/18 15:19
 */
public class MqttContext {

    private MqttClient mqttClient;

    public final class  MqttClientBuilder  {
        private String url;
        private String clientId;

        public MqttClientBuilder url(String url){
            this.url = url;
            return this;
        }
        public MqttClientBuilder clientId(String clientId){
            this.clientId = clientId;
            return this;
        }
        public MqttClient build() throws MqttException {
            return new MqttClient(this.url, this.clientId);
        }

    }

    public void init() throws MqttException {
        MqttClient mqttClient = new MqttClientBuilder()
                .url("")
                .clientId("").build();
        mqttClient.connect();
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttClient.setCallback(new GoldenSkyMqttCallback());
        this.mqttClient = mqttClient;
    }
}
