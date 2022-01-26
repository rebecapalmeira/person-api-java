package one.digitalinnovation.personapi.entity;

import lombok.*;
import one.digitalinnovation.personapi.enums.PhoneType;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType tyoe;

    @Column(nullable = false)
    private String number;

}
