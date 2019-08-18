package com.example.snap.account;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@MappedSuperclass
public class Login  implements Serializable {
    @Id
    @NotEmpty
    @Column(name = "id")
    private String id;

    @NotEmpty
    @Column(name = "password")
    private String password;

}
