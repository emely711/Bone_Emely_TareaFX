# Mi Tienda - Sistema de Gestión de Productos

## Descripción

La Tienda es una aplicación desarrollada en JavaFX que permite gestionar productos mediante una interfaz gráfica moderna. El sistema incluye una pantalla de inicio de sesión y un dashboard para la administración de productos.

## Captura del Dashboard

<img width="1353" height="702" alt="image" src="https://github.com/user-attachments/assets/837e4c00-20aa-48fe-81ea-a88e76558d34" />


## Tecnologías Utilizadas

* Java 21
* JavaFX 21
* CSS
* Maven
* IntelliJ IDEA

## Funcionalidades Implementadas

### Login

* Inicio de sesión mediante usuario, contraseña y rol.
* Validación de acceso para administrador.

### Gestión de Productos

* Formulario de productos.
* Registro de código, nombre, categoría, precio, stock y estado.
* Tabla de visualización de productos.
* Botones CRUD:

  * Nuevo
  * Guardar
  * Actualizar
  * Eliminar
  * Limpiar

### Interfaz Gráfica

* Menú lateral de navegación.
* Diseño personalizado con CSS.
* Dashboard administrativo.

## Estructura del Proyecto

```text
TAREA_FX
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.tarea_fx
│       │       ├── HelloApplication.java
│       │       ├── LoginController.java
│       │       └── DashboardController.java
│       │
│       └── resources
│           ├── css
│           │   └── style.css
│           │
│           └── com.example.tarea_fx
│               ├── login.fxml
│               └── dashboard.fxml
│
├── pom.xml
└── README.md
```

## Instrucciones de Ejecución

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar que Maven descargue las dependencias.
4. Ejecutar la clase HelloApplication.
5. Iniciar sesión con:

Usuario: admin

Contraseña: 1234

Rol: Administrador

6. Acceder al dashboard del sistema.
