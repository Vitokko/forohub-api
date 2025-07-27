# 🧠 ForoHub API

¡Bienvenido a **ForoHub**! 🚀 Este proyecto es parte del **Challenge Java + Spring Boot** del programa Oracle Next Education (ONE) en colaboración con Alura LATAM.

Se trata del backend de un sistema de foros educativos donde usuarios pueden crear, listar y gestionar *tópicos de discusión*, abordando buenas prácticas con Java, Spring Boot, JPA, MySQL y más.

---

## 📌 Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Security + JWT**
- **Spring Data JPA**
- **Flyway**
- **MySQL**
- **Maven**
- **Insomnia / Postman (testing)**
- **Git + GitHub**

---

## 🛠️ Funcionalidades principales

✅ Registro de nuevos tópicos  
✅ Listado de tópicos paginado y ordenado  
✅ Detalle de un tópico por ID  
✅ Actualización y eliminación lógica  
✅ Autenticación con JWT  
✅ Documentación automática con Swagger UI  
✅ Mapeo DTOs y validaciones con Bean Validation  
✅ Registro de usuarios y login seguro

---

## 📂 Estructura del proyecto

```
src/
└── main/
    ├── java/
    │   └── com/victor/forohub/
    │       ├── topico/
    │       ├── usuario/
    │       ├── seguridad/
    │       └── infra/
    └── resources/
        ├── application.properties
        └── db/migration/
  ```      


🧪 Cómo ejecutar el proyecto localmente
1. Clonar el repositorio:
git clone https://github.com/Vitokko/forohub-api.git

2. Crear una base de datos llamada foro_hub en MySQL.

3. Configurar las variables en application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

4. Ejecutar la aplicación desde tu IDE favorito o con Maven:
./mvnw spring-boot:run

5. Acceder a la documentación Swagger en:
http://localhost:8080/swagger-ui/index.html		

🔐 Autenticación
La API usa JWT para proteger sus endpoints.
Para probar endpoints protegidos:

1. Registrarse en /api/usuarios.

2. Obtener un token vía login (/api/login) enviando:

{
  "login": "usuario",
  "clave": "123456"
}

3.Usar el token en el header: Authorization: Bearer TU_TOKEN

🤓 Sobre el autor
Desarrollado por Víctor Astete
💻 Full Stack Web Developer | WordPress · Laravel · Java · Spring Boot
🌐 www.victorastete.cl
📬 contacto@victorastete.cl

Este repositorio forma parte del desafío educativo propuesto por el programa Oracle Next Education + Alura LATAM, como parte del camino de especialización en Backend con Java.
   
