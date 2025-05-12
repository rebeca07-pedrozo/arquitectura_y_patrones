# Sistema de Gestión de Notas Universitarias

## Descripción

Este sistema permite a los profesores gestionar las notas de los estudiantes, registrar nuevos estudiantes y generar estadísticas académicas. Los estudiantes pueden consultar sus propias notas a través de una interfaz web. 

El sistema está basado en una **arquitectura cliente-servidor tradicional**. El servidor se encarga de gestionar los datos y exponer una API RESTful, mientras que el cliente interactúa con el usuario, realizando solicitudes a la API para mostrar los datos y recibir interacciones.

## Arquitectura

### Componentes principales

1. **Cliente (Frontend)**:
   - Tecnologías: HTML, CSS, JavaScript, React o Angular.
   - Responsabilidades:
     - Autenticación de usuarios (login).
     - Visualización de la información de notas.
     - Formulario para agregar o editar notas (solo para profesores).
     - Interfaz para la visualización de estadísticas académicas (opcional).
   
2. **Servidor (Backend)**:
   - Tecnologías: Java con Spring Boot, Node.js con Express, o Python con Flask.
   - Responsabilidades:
     - Control de acceso: autenticar y autorizar a los usuarios.
     - Lógica de negocio: agregar, consultar y modificar las notas de los estudiantes.
     - Exponer una API RESTful para que el cliente pueda interactuar con los datos.
   
3. **Base de Datos**:
   - Tecnologías: MySQL o PostgreSQL.
   - Estructura:
     - **Estudiantes**: guarda los datos de los estudiantes.
     - **Cursos**: guarda la información sobre los cursos.
     - **Notas**: guarda las calificaciones de los estudiantes por cada curso.

4. **Relaciones**:
   - Un **estudiante** tiene muchas **notas**.
   - Un **curso** tiene muchas **notas**.
   - Un **estudiante** puede estar inscrito en varios **cursos**.

5. **Seguridad**:
   - Autenticación con JWT (JSON Web Token) para proteger los endpoints sensibles.
   - Control de acceso basado en roles (profesor/estudiante).

### Flujo de trabajo

1. **Inicio de sesión**:
   - El **cliente** realiza una solicitud de inicio de sesión con las credenciales del usuario (nombre de usuario y contraseña).
   - El **servidor** valida las credenciales y responde con un token de acceso JWT.
   
2. **Gestión de notas**:
   - **Profesor**:
     - Puede agregar, editar o eliminar notas de los estudiantes.
     - Puede visualizar la lista de estudiantes y sus notas.
   - **Estudiante**:
     - Solo puede consultar sus propias notas.

3. **Endpoints**:
   - `POST /login`: autenticar usuarios.
   - `GET /students`: obtener lista de estudiantes (solo para profesores).
   - `POST /students`: agregar estudiantes (solo para profesores).
   - `GET /grades/{studentId}`: obtener las notas de un estudiante.
   - `POST /grades/{studentId}`: agregar/modificar notas de un estudiante (solo para profesores).
   - `GET /statistics`: obtener estadísticas de desempeño académico (opcional, para profesores).

### Tecnologías y Herramientas

- **Frontend**: HTML, CSS, JavaScript, React o Angular.
- **Backend**: Java con Spring Boot, Node.js con Express, o Python con Flask.
- **Base de datos**: MySQL o PostgreSQL.
- **Herramientas de desarrollo**: IntelliJ IDEA (Java), Visual Studio Code (JavaScript o Python).
- **Seguridad**: JWT (JSON Web Token).

