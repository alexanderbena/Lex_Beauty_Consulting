package LexBeautyConsulting.demo.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;

    @Column(nullable=false, length=80, unique=true)
    @NotBlank(message = "El nombre de usuario no puede estar vacío.")
    @Size(max = 80, message = "El nombre de usuario no puede tener más de 80 caracteres.")
    private String nombreUsuario;
//     PENDIENTE MOSTRAR MSG SI EL USERNAME YA EXISTE

    @Column(nullable=false, length=100)
    @Email(message = "Correo electrónico inválido.")
    @NotBlank(message = "El correo electrónico no puede estar vacío.")
    @Size(max = 100, message = "El correo electrónico no puede tener más de 100 caracteres.")
    private String email;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "La contraseña no puede estar vacía.")
    @Size(min = 7, message = "La contraseña debe tener mínimo 7 caracteres.")
    @Size(max = 50, message = "La contraseña no puede tener más de 50 caracteres")
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
}
