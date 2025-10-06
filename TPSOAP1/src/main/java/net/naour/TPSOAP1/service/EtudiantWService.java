package net.naour.TPSOAP1.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import net.naour.TPSOAP1.entité.Student;
import net.naour.TPSOAP1.enums.Genre;

import java.util.List;

@WebService(serviceName = "serviceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "listStudents")
    public List<Student> listEtudiants(){
        return List.of(
                new Student(1,"ET_Nom1","ET_Prénom1", Genre.HOMME),
                new Student(2 ,"ET_Nom2","ET_Prénom2", Genre.FEMME),
                new Student(3 ,"ET_Nom3","ET_Prénom3", Genre.HOMME)
        );
    }
}