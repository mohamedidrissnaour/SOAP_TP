package net.naour;

import stub.Eleve;
import stub.EtudiantWService;
import stub.ServiceWeb;

import java.util.List;

public class ClientSOAP {
    public static void main(String[] args) {
        EtudiantWService wsdl = new ServiceWeb().getEtudiantWServicePort();
        List<Eleve> liste = wsdl.listStudents();
        liste.forEach(elm -> {
            System.out.println(elm.getNom()
                    + "----" + elm.getPrenom());
        });
    }}