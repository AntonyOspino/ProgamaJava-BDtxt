# ProgamaJava-BDtxt
# Sistema de Gestión de Entidades (Desarrollado en NetBeans)

Este proyecto es un sistema de gestión de entidades desarrollado en Java con la ayuda del entorno de desarrollo NetBeans. Incluye una interfaz gráfica de usuario (GUI) para el inicio de sesión y un módulo de registro de entidades basado en el Modelo de Entidad-Relación (MER). Permite a los usuarios autenticarse y realizar operaciones de registro.

## Instrucciones de Uso

Antes de ejecutar el programa, asegúrate de seguir estos pasos:

1. **Configuración de Rutas**:
   - Abre el código fuente en NetBeans IDE.
   - Busca las variables `Ruta1` y `Ruta2` en el código y cámbialas según la ubicación de tus archivos TXT en tu computadora. 

2. **Archivo de Usuarios**:
   - Crea un archivo de texto (por ejemplo, `usuarios.txt`) que contendrá los nombres de usuario y contraseñas de los usuarios que tendrán acceso al sistema. 
   - Cada línea del archivo debe tener el formato:
     - Líneas impares: Nombres de usuario.
     - Líneas pares: Contraseñas correspondientes a los usuarios.
     - Por ejemplo:
       ```
       usuario1
       contraseña1
       usuario2
       contraseña2
       ```

3. **Ejecución**:
   - Ejecuta la clase `Principal.java` para iniciar la aplicación desde NetBeans.
   - Ingresa las credenciales de usuario y contraseña en la ventana de inicio de sesión.

4. **Registro de Entidades**:
   - Una vez autenticado, podrás usar la funcionalidad de registro de entidades en el sistema. Completa los campos y selecciona las opciones necesarias.

5. **Guardar y Visualizar Datos**:
   - Los datos registrados se guardarán en un archivo de texto específico (`datos.txt`) y se mostrarán en la ventana principal.

## Requisitos

- Java Development Kit (JDK) 8 o superior.

## Contribuciones

Si deseas contribuir a este proyecto o informar sobre problemas, siéntete libre de abrir un problema o enviar una solicitud de extracción.

## Licencia

Este proyecto no está bajo ninguna licencia específica y es propiedad del autor. Puedes utilizar, modificar y distribuir este software de acuerdo con tus necesidades.
