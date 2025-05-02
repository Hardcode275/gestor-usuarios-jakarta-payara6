# Gestor de Usuarios - JSF con Jakarta EE 10 (Payara 6)

Este proyecto es una aplicación web de ejemplo desarrollada con **Jakarta EE 10** y **JSF**, compatible con **Payara Server 6**. Permite registrar, listar y eliminar usuarios utilizando una interfaz web basada en **Bootstrap**.

---

## 📁 Estructura del proyecto

```
gestor-usuarios-jakarta/
├── src/
│   ├── main/
│   │   ├── java/com/proyecto/modelo/Usuario.java
│   │   ├── java/com/proyecto/controlador/UsuarioBean.java
│   │   └── webapp/
│   │       ├── registro.xhtml
│   │       ├── usuarios.xhtml
│   │       └── WEB-INF/
│   │           ├── web.xml
│   │           ├── beans.xml
│   │           └── faces-config.xml
├── pom.xml
```

---

## ▶️ Cómo desplegar en Payara 6

### 1️⃣ Requisitos

- Java 11 o superior
- Maven 3.x
- Payara Server 6 instalado

### 2️⃣ Compilar el proyecto

Desde la raíz del proyecto, abre una terminal y ejecuta:

```bash
mvn clean package
```

Esto generará el archivo `.war` en `target/gestor-usuarios-jakarta.war`

### 3️⃣ Iniciar Payara Server

```bash
cd C:/payara6/bin
asadmin start-domain
```

### 4️⃣ Acceder a la consola de administración

Abre tu navegador y ve a:

```
http://localhost:4848
```

### 5️⃣ Subir el archivo WAR

- Ir a: `Applications > Deploy...`
- Seleccionar "Packaged File to be Uploaded to the Server"
- Cargar `target/gestor-usuarios-jakarta.war`
- Confirmar con "OK"

### 6️⃣ Abrir la aplicación

Una vez desplegada, abre en tu navegador:

```
http://localhost:8081/gestor-usuarios-jakarta/registro.xhtml
```

> ⚠️ Nota: el puerto puede variar (puede ser 8080 u 8081). Verifica en la consola de administración.

---

## 💡 Características

- Registro de usuarios (nombre y correo)
- Listado y eliminación de registros
- Uso de `@Named`, `@SessionScoped` y `jakarta.faces`
- Diseño responsivo con Bootstrap

---

## 📄 Licencia

Este proyecto es de uso libre para fines académicos y de práctica.


