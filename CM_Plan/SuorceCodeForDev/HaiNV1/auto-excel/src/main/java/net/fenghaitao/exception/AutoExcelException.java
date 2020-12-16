package net.fenghaitao.exception;

public class AutoExcelException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AutoExcelException(String message) {
        super(message);
    }

    public AutoExcelException(Throwable cause) {
        super(cause);
    }

    public AutoExcelException(String message, Throwable cause) {
        super(message, cause);
    }
}
