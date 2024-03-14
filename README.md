# EmailGeneration-

El programa consiste en una aplicación web para generar direcciones de correo electrónico para empleados. Está compuesto por un backend desarrollado en Java con Spring Boot y un frontend implementado en HTML, CSS y JavaScript. Aquí hay un resumen de las principales características y funcionalidades del programa:

1. Backend (Java con Spring Boot):
   - Controller EmailController: Maneja las solicitudes HTTP relacionadas con la generación de correos electrónicos. Utiliza el servicio EmailService para generar las direcciones de correo electrónico.
   - Service EmailService: Contiene la lógica para generar las direcciones de correo electrónico basadas en los datos del empleado.
   - Model EmployeeData: Define la estructura de los datos del empleado, incluyendo el nombre, apellido, departamento y ubicación de la oficina.

2. Frontend (HTML, CSS, JavaScript):
   - Formulario HTML: Permite al usuario ingresar el nombre, apellido, ubicación de la oficina y departamento del empleado.
   - Interacción con el Usuario (JavaScript): Proporciona funcionalidades interactivas, como la actualización dinámica de las opciones del departamento basadas en la ubicación de la oficina seleccionada.
   - Comunicación con el Backend (Fetch API): Envía los datos del formulario al backend para generar la dirección de correo electrónico correspondiente.

3. Funcionalidades:
   - El usuario puede ingresar el nombre, apellido, ubicación de la oficina y departamento del empleado.
   - La lista de departamentos se actualiza dinámicamente según la ubicación de la oficina seleccionada.
   - Al hacer clic en Generate Email, se envían los datos del formulario al backend para generar la dirección de correo electrónico.
   - La dirección de correo electrónico generada se muestra en el formulario y el usuario tiene la opción de copiarla al portapapeles o limpiar el campo.

En resumen, el programa proporciona una interfaz fácil de usar para generar direcciones de correo electrónico personalizadas para empleados, lo que puede ser útil en entornos corporativos o de recursos humanos.
