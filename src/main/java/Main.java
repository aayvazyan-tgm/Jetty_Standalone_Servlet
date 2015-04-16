import server.JettyEmbeddedRunner;

import java.io.IOException;

public class Main {
	public static void main(final String[] args) throws IOException{
		new JettyEmbeddedRunner().startServer(8081);
		System.out.println("Started Servlet/s");
	}
}