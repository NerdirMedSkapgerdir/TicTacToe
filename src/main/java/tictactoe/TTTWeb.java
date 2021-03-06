package tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TTTWeb implements SparkApplication {

	public static void main(String args[]) {
		staticFileLocation("/public");
		SparkApplication tttweb = new TTTWeb();
        	String port = System.getenv("PORT");
        	if (port != null) {
        		setPort(Integer.valueOf(port));
        	}
        	tttweb.init();
	}

	public void init(){
		final TicTacToe mylla = new TicTacToe();

		post(new Route("/index") {
			@Override
			public Object handle(Request request, Response response){
				String greet = mylla.welcome();
				return greet;
			}
		});

        	post(new Route("/start"){
            		@Override
            		public Object handle(Request request, Response response){
                        mylla.clearBoard();
                		return mylla.drawBoard() + "<br/><br/>" +  mylla.getPlayer() + " a leik";
            		}
        	});

		post(new Route("/play"){
            @Override
            public Object handle(Request request, Response response){
                String input = request.queryParams("id");
                if (!mylla.updateBoard(input)) {
                    return mylla.drawBoard() + "<br/> Ogilt inntak eda reitur nu thegar fylltur, reyndu aftur.<br/>" + mylla.getPlayer() + " a leik";
                }

		if (mylla.isFinished()) {
                    return mylla.printResults();
                }
                return mylla.drawBoard() + "<br/><br/>" + mylla.getPlayer() + " a leik";
            }
        });

        post(new Route("/reset"){
            @Override
            public Object handle(Request request, Response response){
                mylla.clearBoard();
                return mylla.drawBoard() + "<br/><br/>" + mylla.getPlayer() + " a leik";
            }
        });
    }
}
