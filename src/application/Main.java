package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplicación con MenuBar");

        // Crear el layout principal
        BorderPane root = new BorderPane();

        // Crear la barra de menú
        MenuBar menuBar = new MenuBar();

        // Menú "Archivo"
        Menu fileMenu = new Menu("Archivo");
        MenuItem newFileItem = new MenuItem("Nuevo");
        newFileItem.setOnAction(e -> System.out.println("Acción: Crear nuevo archivo"));
        MenuItem openFileItem = new MenuItem("Abrir");
        openFileItem.setOnAction(e -> System.out.println("Acción: Abrir archivo"));
        MenuItem saveFileItem = new MenuItem("Guardar");
        saveFileItem.setOnAction(e -> System.out.println("Acción: Guardar archivo"));
        MenuItem exitItem = new MenuItem("Salir");
        exitItem.setOnAction(e -> {
            System.out.println("Acción: Salir de la aplicación");
            primaryStage.close();
        });

        // Submenú "Exportar" dentro de "Archivo"
        Menu exportMenu = new Menu("Exportar");
        MenuItem exportPdfItem = new MenuItem("A PDF");
        exportPdfItem.setOnAction(e -> System.out.println("Acción: Exportar a PDF"));
        MenuItem exportXmlItem = new MenuItem("A XML");
        exportXmlItem.setOnAction(e -> System.out.println("Acción: Exportar a XML"));

        exportMenu.getItems().addAll(exportPdfItem, exportXmlItem);

        // Agregamos los elementos al menú "Archivo" y separadores para organizarlos
        fileMenu.getItems().addAll(newFileItem, openFileItem, saveFileItem, new SeparatorMenuItem(), exportMenu, new SeparatorMenuItem(), exitItem);

        // Menú "Editar"
        Menu editMenu = new Menu("Editar");
        MenuItem cutItem = new MenuItem("Cortar");
        cutItem.setOnAction(e -> System.out.println("Acción: Cortar"));
        MenuItem copyItem = new MenuItem("Copiar");
        copyItem.setOnAction(e -> System.out.println("Acción: Copiar"));
        MenuItem pasteItem = new MenuItem("Pegar");
        pasteItem.setOnAction(e -> System.out.println("Acción: Pegar"));

        // Agregamos los elementos al menú "Editar"
        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);

        // Submenú "Preferencias" dentro de "Editar"
        Menu preferencesMenu = new Menu("Preferencias");
        MenuItem themeItem = new MenuItem("Tema");
        themeItem.setOnAction(e -> System.out.println("Acción: Cambiar tema"));
        MenuItem languageItem = new MenuItem("Idioma");
        languageItem.setOnAction(e -> System.out.println("Acción: Cambiar idioma"));

        // Submenú "Fuentes" dentro de "Preferencias"
        Menu fontsMenu = new Menu("Fuentes");
        MenuItem fontSizeItem = new MenuItem("Tamaño");
        fontSizeItem.setOnAction(e -> System.out.println("Acción: Cambiar tamaño de fuente"));
        MenuItem fontFamilyItem = new MenuItem("Familia");
        fontFamilyItem.setOnAction(e -> System.out.println("Acción: Cambiar familia de fuente"));

        fontsMenu.getItems().addAll(fontSizeItem, fontFamilyItem);

        // Agregamos los elementos al submenú "Preferencias"
        preferencesMenu.getItems().addAll(themeItem, languageItem, new SeparatorMenuItem(), fontsMenu);

        // Agregamos el submenú "Preferencias" al menú "Editar" y un separador
        editMenu.getItems().addAll(new SeparatorMenuItem(), preferencesMenu);

        // Menú "Ayuda"
        Menu helpMenu = new Menu("Ayuda");
        MenuItem aboutItem = new MenuItem("Acerca de");
        aboutItem.setOnAction(e -> System.out.println("Acción: Mostrar información de la aplicación"));
        MenuItem userManualItem = new MenuItem("Manual de usuario");
        userManualItem.setOnAction(e -> System.out.println("Acción: Abrir manual de usuario"));

        // Submenú "Recursos" dentro de "Ayuda"
        Menu resourcesMenu = new Menu("Recursos");
        MenuItem faqItem = new MenuItem("Preguntas frecuentes");
        faqItem.setOnAction(e -> System.out.println("Acción: Abrir preguntas frecuentes"));
        MenuItem tutorialsItem = new MenuItem("Tutoriales");
        tutorialsItem.setOnAction(e -> System.out.println("Acción: Abrir tutoriales"));

        resourcesMenu.getItems().addAll(faqItem, tutorialsItem);

        // Agregamos los elementos al menú "Ayuda" y un separador
        helpMenu.getItems().addAll(aboutItem, new SeparatorMenuItem(), userManualItem, new SeparatorMenuItem(), resourcesMenu);

        // Añadimos los menús principales a la barra de menú
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Añadimos la barra de menú al BorderPane (en la parte superior)
        root.setTop(menuBar);

        // Creamos la escena y configuramos el stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}