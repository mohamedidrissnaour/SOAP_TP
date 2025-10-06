package net.naour.TPSOAP1.serveur;

import jakarta.xml.ws.Endpoint;
import net.naour.TPSOAP1.service.EtudiantWService;

public class ServeurSOAP {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }
}