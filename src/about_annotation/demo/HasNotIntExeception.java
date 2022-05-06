package about_annotation.demo;

public class HasNotIntExeception extends RuntimeException{
    public HasNotIntExeception() {
    }

    public HasNotIntExeception(String message) {
        super(message);
    }
}
