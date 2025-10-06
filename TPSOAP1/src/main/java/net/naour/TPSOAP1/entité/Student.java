package net.naour.TPSOAP1.entité;


import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.naour.TPSOAP1.enums.Genre;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlType(name="eleve")
public class Student {
    int id;
    String nom;
    String prenom;
    Genre genre;
}