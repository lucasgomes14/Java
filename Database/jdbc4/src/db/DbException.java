package db;

public class DbException extends RuntimeException {
	private static final Long serialversionUID = 1L;

	public DbException(String message) {
		super(message);
	}
	
}
