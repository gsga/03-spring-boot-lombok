package tup.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tup.demo.models.User;

/*
 * Esta clase tiene que incorporar las
 * funcionalidades de controlador. Eso lo hacemos con la
 * anotación @RestController.
 * 
 * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/
 * springframework/web/bind/annotation/RestController.html
 * 
 */
@RestController
public class UserController {
    /*
     * Documentación oficial:
     * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/
     * springframework/web/bind/annotation/GetMapping.html
     * 
     * Asigna solicitudes HTTP GET a métodos de controlador específicos.
     * 
     * @GetMapping es una anotación compuesta que actúa como atajo
     * para @RequestMapping(method = RequestMethod.GET).
     */
    @GetMapping()
    /*
     * Documentación oficial:
     * 
     * https://docs.spring.io/spring-framework/docs/current/javadoc-api
     * /org/springframework/web/bind/annotation/RequestParam.html
     * 
     * Anotación que indica que un parámetro del método debe vincularse a un
     * parámetro de la solicitud (request) web. En Spring MVC, los "parámetros de
     * la solicitud" se asignan a parámetros de query, datos de formulario y
     * partes en solicitudes de multipartes. Esto se debe a que la API de servlet
     * combina los parámetros de query y los datos de formulario en un solo mapa
     * llamado "parámetros", y eso incluye el análisis automático del cuerpo de la
     * solicitud.
     * Este artículo de Baeldung es mucho más claro:
     * https://www.baeldung.com/spring-request-param
     */
    public String hola(@RequestParam(value = "name", defaultValue = "José") String name) {
        /*
         * Usamos varios métodos de la clase User, pero no los implementamos nosotros,
         * sino que fueron generados por la anotación @Data de Lombok.
         * No estamos hablando de un patrón de inyección de dependencias.
         * Simplemente, tenemos un objeto de tipo User, y ese objeto
         * tiene todos los campos y métodos de su clase.
         */
        User user = new User();
        user.setName(name);

        return String.format("¡Hola %s!", user.getName());
    }

}
