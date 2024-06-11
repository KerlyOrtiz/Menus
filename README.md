# Aplicación con MenuBar en JavaFX
![](https://scontent.fgye30-1.fna.fbcdn.net/v/t1.15752-9/447878280_952477386613218_1780552880733524787_n.png?_nc_cat=101&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHLlELdktert3BqF0y55V7WxxoYS-gP4X3HGhhL6A_hfY6NULjQ3kBmm_IWQXsjXr-yiNSiTbGpe3gM-rpb3zOP&_nc_ohc=QiM34O30PV4Q7kNvgEo-nli&_nc_ht=scontent.fgye30-1.fna&oh=03_Q7cD1QGZTa_42rYS5-ztTUNI918yuhMNi1OeQGxcfnOIxwrmVA&oe=668F53C9)

Esta aplicación de JavaFX demuestra cómo crear una barra de menú (`MenuBar`) con diferentes menús y submenús, cada uno con sus propios elementos (`MenuItem`). La barra de menú se agrega a un `BorderPane` principal que actúa como el contenedor raíz de la interfaz de usuario.

## Funcionalidades

### Menú "Archivo"

- **Nuevo**: Imprime "Acción: Crear nuevo archivo" en la consola.
- **Abrir**: Imprime "Acción: Abrir archivo" en la consola.
- **Guardar**: Imprime "Acción: Guardar archivo" en la consola.
- **Exportar**:
 - **A PDF**: Imprime "Acción: Exportar a PDF" en la consola.
 - **A XML**: Imprime "Acción: Exportar a XML" en la consola.
- **Salir**: Imprime "Acción: Salir de la aplicación" en la consola y cierra la aplicación.

### Menú "Editar"

- **Cortar**: Imprime "Acción: Cortar" en la consola.
- **Copiar**: Imprime "Acción: Copiar" en la consola.
- **Pegar**: Imprime "Acción: Pegar" en la consola.
- **Preferencias**:
 - **Tema**: Imprime "Acción: Cambiar tema" en la consola.
 - **Idioma**: Imprime "Acción: Cambiar idioma" en la consola.
 - **Fuentes**:
   - **Tamaño**: Imprime "Acción: Cambiar tamaño de fuente" en la consola.
   - **Familia**: Imprime "Acción: Cambiar familia de fuente" en la consola.

### Menú "Ayuda"

- **Acerca de**: Imprime "Acción: Mostrar información de la aplicación" en la consola.
- **Manual de usuario**: Imprime "Acción: Abrir manual de usuario" en la consola.
- **Recursos**:
 - **Preguntas frecuentes**: Imprime "Acción: Abrir preguntas frecuentes" en la consola.
 - **Tutoriales**: Imprime "Acción: Abrir tutoriales" en la consola.

## Ejecución

Para ejecutar la aplicación, simplemente ejecute la clase `Main` que extiende la clase `Application` de JavaFX. La aplicación mostrará una ventana con una barra de menú en la parte superior. Al hacer clic en los diferentes elementos del menú, se imprimirán los mensajes correspondientes en la consola.

```java
public static void main(String[] args) {
   launch(args);
}
