package loggerexample;

import java.util.logging.Logger;

public class Runner {

	private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());

	public static void main(String[] args) {

		LOGGER.info("Hello Logger");
		LOGGER.info("Idk what I am doing");

		LOGGER.info("Hello");
	}
}
