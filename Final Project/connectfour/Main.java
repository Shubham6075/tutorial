package connectfour;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application
	{
		private Controller controller;

		@Override

		public void start(Stage primaryStage) throws Exception
		{
			System.out.println("Application Started");


			FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
			GridPane rootGridPane = loader.load();

			controller = loader.getController();
			controller.createPlayground();

			MenuBar menuBar = createMenu();

			menuBar.prefWidthProperty().bind(primaryStage.widthProperty());


			Pane menuPane = (Pane) rootGridPane.getChildren().get(0);
			menuPane.getChildren().add(menuBar);

			Scene scene = new Scene(rootGridPane);


			primaryStage.setScene(scene);
			primaryStage.setTitle("Connect 4");
			primaryStage.setResizable(false);
			primaryStage.show();
		}

		private MenuBar createMenu()
		{
			//File Menu
			Menu fileMenu = new Menu("File");

			MenuItem newGame = new MenuItem("New Game");
			newGame.setOnAction(event -> controller.resetGame());

			MenuItem resetGame = new MenuItem("Reset Game");
			resetGame.setOnAction(event -> controller.resetGame());

			SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();

			MenuItem exitGame = new MenuItem("Exit Game");
			exitGame.setOnAction(event -> exitGame());

			fileMenu.getItems().addAll(newGame, resetGame, separatorMenuItem, exitGame);

			//Help Menu
			Menu helpMenu = new Menu("Help");

			MenuItem aboutGame = new MenuItem("About Connect 4");
			aboutGame.setOnAction(event -> aboutConnect4());
			SeparatorMenuItem separatorItem = new SeparatorMenuItem();
			MenuItem aboutMe = new MenuItem("About Me");
			aboutMe.setOnAction(event -> aboutMe());

			helpMenu.getItems().addAll(aboutGame, separatorItem, aboutMe);

			// Menu Bar
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(fileMenu, helpMenu); // Adding Menus to Menu Bar

			return menuBar;
		}

		private void aboutMe()
		{
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("About The Developer");
			alert.setHeaderText("Shubham Rathee");
			alert.setContentText("Hi! I am Shubham Rathee, a developer focused on Data Analysis &" +
					" software development. Designing and Coding have been my passion since" +
					" the days I started working with computers since 2021. " +
					"  I enjoy coding and enjoying my MCA from jain university." +
					" My other hobbies includes Playing, Listening Music & Drawing.");

			alert.show();
		}

		private void aboutConnect4()
		{
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("About Connect 4 Game");
			alert.setHeaderText("How To Play ?");
			alert.setContentText("The Connect 4 Game Rules are easy to understand." +
					" In fact, it is in the name. To win Connect Four, all you have to do" +
					" is to choose a color and then take turns dropping colored discs from" +
					" the top into a seven-column, six-row vertically suspended grid." +
					" The pieces fall straight down, occupying the next available space within the column." +
					" The objective of this game is to connect four of your colored checker pieces in a row," +
					" much the same as tic tac toe. This can be done horizontally, vertically or diagonally." +
					" Each player will drop in one checker piece at a time. This will give you a chance" +
					" to either build your row, or stop your opponent from getting four in a row." +
					"\n\n" +
					"\tThe game is over either when you or your friend reaches four in a row," +
					" or when all forty two slots are filled, ending in a stalemate." +
					" If you and your friend decide to play again, the first player typically goes first." +
					" The rules of the game are easy to learn, but difficult to master." +
					" That is the beauty of Connect Four. Now that you know the Connect 4" +
					" board game rules, now is the time to challenge everyone you know." +
					" No matter their age or skill level, they can play this game with you." +
					" Now that you understand the rules, share Connect Four with everyone around you." +
					" You’ll be glad you did.\n\n");

			alert.show();
		}

		private void exitGame()
		{
			Platform.exit();
			System.exit(0);
		}


		public static void main(String[] args)
		{
			launch(args);
		}
	}

