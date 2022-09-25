package tup.demo.models;

import lombok.Data;

/*
 * La documentación oficial está en:
 * https://projectlombok.org/features/Data
 * y en
 * https://projectlombok.org/api/lombok/Data.html
 * Generates getters for all fields, a useful toString method, and hashCode and equals
 * implementations that check all non-transient fields. Will also generate setters for
 * all non-final fields, as well as a constructor.
 * Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
 * Los siguientes tutoriales explican cómo se usa:
 * https://javabydeveloper.com/lombok-data-annotation/
 * https://www.educative.io/answers/what-is-the-data-annotation-in-lombok
 *  
 * OJO: no se trata de un patrón de inyección de dependencias.
 * 
 * NOTAR que solo hemos declarado el campo name. No declaremos explícitamente
 * ningún método, y por supuesto no los implementamos. Todo eso lo hace
 * por nosotros automáticamente la anotación @Data. Esto nos evita
 * tener que escribir boiler plate code, y teminamos usando las implementaciones
 * de esos métodos que han sido escritas por los mejores programadores. Tiene
 * la desventaja de que es poco flexible, porque escapa a nuestro control.
 */
@Data
public class User {

    private String name;

}
