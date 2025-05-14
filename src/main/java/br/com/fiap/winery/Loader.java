package br.com.fiap.winery;

import javax.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        // Publicando o serviço de estoque
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        Endpoint.publish("http://localhost:8086/WineStockService", wineStock);
        System.out.println("Serviço WineStockService publicado!");

        // Publicando o serviço de aviso
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);
        System.out.println("Serviço WineWarningService publicado!");
    }
}
