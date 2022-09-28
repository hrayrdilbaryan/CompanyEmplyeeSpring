package am.itspace.companyemplyeespring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.swing.text.Position;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private double salary;
    @Enumerated(value = EnumType.STRING)
    private Position position;
    @ManyToOne
    private Company company;
    private String profilePic;
}
