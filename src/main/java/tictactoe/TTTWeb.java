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
        	final TTTInterface vidmot = new TTTInterface();
		final TicTacToe mylla = new TicTacToe();

		post(new Route("/index"){
			@Override
			public Object handle(Request request, Response response){
				String welcome = vidmot.welcome();
				return welcome;
			}
		});

		post(new Route("/instructions"){
                        @Override
                        public Object handle(Request request, Response response){
                                String instr = vidmot.instructions();
                                return instr;
                        }
                });

        	post(new Route("/start"){
            		@Override
            		public Object handle(Request request, Response response){
                		String board = mylla.drawBoard() + "<br>" +  mylla.getPlayer() + " á leik";
                		return board;
            		}
        	});

		post(new Route("/play"){
                        @Override
                        public Object handle(Request request, Response response){
				String input = request.queryParams("input");
				mylla.updateBoard(input);
                                String board = mylla.drawBoard() + mylla.getPlayer() + " á leik";
				if (mylla.isTie)
					return board + "\nJafntefli!";
				if (mylla.isFinished())
					return board + mylla.getPlayer() + " hefur unnið!";
                                return board;
                        }
                });
    	}
}
